package cn.running4light.demo.utils;

/**
 * @author running4light
 * @description 递归实现链表
 * @createTime 2021/5/21 11:57
 */
public class LinkedListRecursion<E> {
    private Node head;
    //    private Node dummmyHead;
    int size;

    public LinkedListRecursion(){
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

    @Override
    public String toString(){
        StringBuffer stringBuffer = new StringBuffer();
        if(head != null){
            Node node = head;
            while(true){
                stringBuffer.append(node);
                node = node.next;
                if(node == null){
                    break;
                }else{
                    stringBuffer.append("-->");
                }
            }
        }
        return stringBuffer.toString();
    }

    public void addFirst(E e){
        /*Node node = new Node(e);
        node.next = head;
        head = node;*/
        head = new Node(e, head);
        size++;
    }

    public void add(int index, E e){
        head = add(head, index, e);
        size++;
    }


    public Node add(Node node, int index, E e) {
        if (index == 0){
            System.err.println(general(index) + index);
            return new Node(e, node);
        }
        System.err.println(general(index) + index);
        node.next = add(node.next, index - 1, e);
        System.err.println(general(index) + index);
        return node;
    }

    public String general(int index){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= index; i++) {
            sb.append("--");
        }
        return sb.toString();
    }








    // 错误版本

    public void add2(int index, E e){
        add2(head, index, e);
        size++;
    }
    public void add2(Node node, int index, E e) {
        if (index == 0){
            Node newNode = new Node(e, node);
            node = newNode;
            System.err.println(index);
            int hash = node.hashCode();
            int hashnew = newNode.hashCode();
            System.err.println(node.hashCode());
            System.err.println(newNode.hashCode());
            return;
        }
        int hash = node.hashCode();
        System.err.println(node.hashCode());
        add2(node.next, index - 1, e);
        int hash2 = node.hashCode();
        System.err.println(node.hashCode());

    }
}
