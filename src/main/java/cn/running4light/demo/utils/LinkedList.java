package cn.running4light.demo.utils;

/**
 * @author running4light
 * @description
 * @createTime 2021/5/21 11:41
 */
public class LinkedList <E>{



    private Node head;
//    private Node dummmyHead;
    int size;

    public LinkedList(){
        head = null;
//        dummmyHead = new Node(null,null);
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
        head = new Node(e, head);
        size++;
    }

    public void add(){

    }

}
