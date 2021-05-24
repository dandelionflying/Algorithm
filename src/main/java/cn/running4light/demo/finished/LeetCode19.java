package cn.running4light.demo.finished;

import cn.running4light.demo.linkedlist.entity.ListNode;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.List;

/**
 * @author running4light
 * @description  删除链表的倒数第 N 个结点
 *  给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 *
 * 进阶：你能尝试使用一趟扫描实现吗？
 * @createTime 2021/5/24 9:39
 */
public class LeetCode19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node = head;
        int i = 0;
        while (node!=null){
            i++;
            node = node.next;
        }
        return remove(head, n, i);
    }
    public ListNode remove(ListNode head, int n, int length){
        if(head == null)
            return null;
        head.next = remove(head.next, n + 1 , length);
        return (length - n) == 0 ? head.next : head;
    }

    public ListNode removeNthFromEnd2(ListNode head, int n) {
       return null;
    }
}
