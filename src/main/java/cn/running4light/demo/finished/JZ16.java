package cn.running4light.demo.finished;

import cn.running4light.demo.linkedlist.entity.ListNode;

import java.util.List;

/**
 * @author running4light
 * @description 合并两个排序的链表
 * @createTime 2021/5/24 11:50
 */
public class JZ16 {
    /**
     * @Description 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
     * @Author running4light朱泽雄
     * @CreateTime 15:09 2021/5/24
     */
    public ListNode Merge(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode re1 = null;
        ListNode re2 = null;
        re1 = list1.val <= list2.val ? list1 : list2;
        re2 = list1.val <= list2.val ? list2 : list1;
        ListNode tmp1 = re1;
        ListNode tmp2 = re2;
        // 方式1 2插入到1
        while (tmp2 != null) {
            ListNode tmp11 = tmp1;
            ListNode tmp22 = tmp2;
            while (tmp11.next != null && tmp22.val > tmp11.next.val) {
                tmp11 = tmp11.next;
            }
            ListNode tmp1Next = tmp11.next;// 暂存插入点的后续链表
            ListNode tmp2Next = tmp22.next;// 暂存链表2的后续链表，即剩余待插入元素
            tmp11.next = tmp22;// 插入
            tmp22.next = tmp1Next;// 连接插入点的后续
            tmp2 = tmp2Next;// 指向下一个带插入元素的结点
            if (tmp2 == null) {
                break;
            }
        }
        return re1;
    }
}
