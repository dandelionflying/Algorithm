package cn.running4light.demo.linkedlist.entity;

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

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

}
