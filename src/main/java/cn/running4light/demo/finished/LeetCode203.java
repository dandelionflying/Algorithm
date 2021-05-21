package cn.running4light.demo.finished;

import cn.running4light.demo.linkedlist.ListNode;

/**
 * @author running4light
 * @description 移除链表元素
 * @createTime 2021/5/21 10:41
 */
public class LeetCode203 {
    /**
     * @Description
     * @Author running4light朱泽雄
     * @CreateTime 10:41 2021/5/21
     */
    public ListNode removeElements(ListNode head, int val) {
        if(head == null)
            return null;
        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
    }
}
