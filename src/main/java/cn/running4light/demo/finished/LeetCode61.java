package cn.running4light.demo.finished;

import cn.running4light.demo.linkedlist.entity.ListNode;

/**
 * @author running4light
 * @description 旋转链表
 *  eg:
 *      输入：head = [1,2,3,4,5], k = 2
 *      输出：[4,5,1,2,3]
 * @createTime 2021/5/24 11:11
 */
public class LeetCode61 {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null){
            return null;
        }
        ListNode node = head;
        int length = 0;
        while (node!=null){
            length++;
            node = node.next;
        }
        if(length == 0){
            return head;
        }
        ListNode h = head;
        ListNode cutPre = head;
        ListNode cutPost = head.next;
        for (int i = 0; i < length - k%length - 1; i++) {
            cutPre = cutPre.next;
            cutPost = cutPre.next;
        }
        if(cutPost == null ){
            return head;
        }
        cutPre.next = null;
        ListNode post2 = cutPost;
        while(post2.next != null){
            post2 = post2.next;
        }
        post2.next = head;
        System.err.println(cutPre.val+"\t"+cutPre);
        System.err.println(cutPost.val+"\t"+cutPost);
        System.err.println(cutPost);
        return cutPost;
    }
}
