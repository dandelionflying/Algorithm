package cn.running4light.demo.linkedlist;

/**
 * @author running4light
 * @description
 * @createTime 2021/5/21 10:42
 */
public class ListNode {


    public int val;
    public ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

}
