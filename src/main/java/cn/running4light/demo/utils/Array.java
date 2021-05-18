package cn.running4light.demo.utils;

import java.util.Arrays;

/**
 * @author running4light
 * @description             多此一举，只是为了配合视频教程创建
 * @createTime 2021/5/18 11:26
 */
public class Array<E> {
    private E[] data;
    private int size;

    public Array(int capacity){
        data = (E[]) new Object[capacity];
        size = 0;
    }

    public Array(){
        this(10);
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return data.length;
    }

    public boolean isEmpty(){
        return data.length == 0;
    }
    /**
     * @Description 数组扩容
     * @Author running4light朱泽雄
     * @CreateTime 15:25 2021/5/18
     */
    private void expansion(int newCapacity){
        E[] newData =(E[]) new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    public void addLast(E e){
        add(size, e);
    }

    public void addFirst(E e){
        add(0, e);
    }

    public void add(int index, E e){
        if(index < 0 || index > size){
            throw new IllegalArgumentException("索引非法");
        }
        if(size == data.length){
            // 数组扩容
            expansion(2*data.length);
        }

        for (int i = size - 1; i >= index ; i--) {
            data[i+1] = data[i];
        }
        data[index] = e;
        size++;
    }

    public void set(int index, E e){
        if(size == data.length){
            throw new IllegalArgumentException("索引非法");
        }
        data[index] = e;
    }

    public boolean contains(E e){
        for (E d :
                data) {
            if(d.equals(e)){
                return true;
            }
        }
        return false;
    }

    public int findIndex(E e){
        for (int i = 0; i < data.length; i++) {
            if(data[i] == e)
                return i;
        }
        return -1;
    }


    public E remove(int index){
        if(index < 0 || index > size){
            throw new IllegalArgumentException("索引非法");
        }
        E d = data[index];
        for (int i = index ; i < size - 1; i++) {
            data[i] = data[i+1];
        }
        size--;
        data[size] = null;
        if(size == data.length/4 && data.length/2 != 0){
            expansion(data.length/2);
        }
        return d;
    }

    public E removeFirst(){
        return remove(0);
    }
    public E removeLast(){
        return remove(size - 1);
    }

    public void removeElement(E e){
        int index = findIndex(e);
        if(index != -1)
            remove(index);
    }
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.format("Array: size = %d , capacity = %d.\n",size,data.length));
        stringBuilder.append("data=[");
        for (int i = 0; i < size; i++) {
            stringBuilder.append(data[i].toString());
            if(i != size - 1)
                stringBuilder.append(" , ");
        }
        stringBuilder.append("]");
//        return stringBuilder.append("data=" + Arrays.toString(Arrays.copyOfRange(data, 0, size))).toString();
        return stringBuilder.toString();
    }
}
