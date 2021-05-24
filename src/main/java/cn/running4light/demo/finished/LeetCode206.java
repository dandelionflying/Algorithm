package cn.running4light.demo.finished;

import cn.running4light.demo.linkedlist.entity.ListNode;

/**
 * @author running4light
 * @description 翻转链表
 * @createTime 2021/5/21 16:45
 */
public class LeetCode206 {
    /**
     * @Description 递归方式
     * @Author running4light朱泽雄
     * @CreateTime 17:16 2021/5/21
     */
    public ListNode reverseList(ListNode head, int depth) {
        System.err.print(generateDepthString(depth));
        System.err.println("head:" + head);
        if (head == null || head.next == null) {
            System.err.print(generateDepthString(depth));
            System.err.println("Return :" + head);
            return head;
        }
        ListNode rev = reverseList(head.next, depth + 1);
        head.next.next = head;
        head.next = null;
        System.err.print(generateDepthString(depth));
        System.err.println("return: " + rev);
        return rev;
    }
    /**
     * @Description 非递归
     * @Author running4light朱泽雄
     * @CreateTime 17:06 2021/5/21
     */
    public ListNode reverseList2(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;;
        while (cur != null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    public String generateDepthString(int depth){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= depth; i++) {
            sb.append("--");
        }
        return sb.toString();
    }
}
