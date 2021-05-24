package cn.running4light.demo.linkedlist.entity;

/**
 * @author running4light
 * @description
 * @createTime 2021/5/21 10:42
 */
public class ListNode {


    public Integer val;
    public ListNode next;

    ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
    @Override
    public String toString(){
        if(val ==null && next == null){
            return null;
        }
        StringBuilder sb = new StringBuilder();
        ListNode node = next;
        if(val!=null){
            sb.append(val);
        }
        while (true){
            if(node == null)
                break;
            sb.append("-->");
            sb.append(node.val);
            node = node.next;
        }
        return sb.toString();
    }

}
