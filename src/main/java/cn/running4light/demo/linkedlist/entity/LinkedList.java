package cn.running4light.demo.linkedlist.entity;

/**
 * @author running4light
 * @description
 * @createTime 2021/5/21 11:41
 */
public class LinkedList <E>{



//    private Node head;
    private Node dummmyHead;
    int size;

    public LinkedList(){
//        head = null;
        dummmyHead = new Node(null,null);
        size = 0;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void addFirst(E e){
        /*Node node = new Node(e);
        node.next = head;
        head = node;*/
//        head = new Node(e, head);
        add(0, e);
        size++;
    }

    public void addLast(E e){
        add(size, e);
    }

    public void add(int index, E e){
        if (index < 0 || index > size)
            throw new IllegalArgumentException("非法索引");
        Node prev = dummmyHead;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }
        prev.next = new Node(e, prev.next);
        size++;
    }

}
