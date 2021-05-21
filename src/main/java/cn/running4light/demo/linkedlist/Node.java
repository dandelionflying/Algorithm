package cn.running4light.demo.linkedlist;

/**
 * @author running4light
 * @description
 * @createTime 2021/5/21 12:05
 */
public class Node <E> {
    public E e;
    public Node next;

    public Node(E e, Node next) {
        this.e = e;
        this.next = next;
    }
    public Node(E e){
        this.e = e;
    }
    public Node(){
        this(null,null);
    }
    @Override
    public String toString(){
        return e.toString();
    }
}