package cn.running4light.demo.finished;

import cn.running4light.demo.linkedlist.entity.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author running4light
 * @description 牛客--链表中倒数第k个结点
 * @createTime 2021/5/24 10:01
 */
public class JZ14 {
    /**
     * @Description     递归方式
     *  时间复杂度O(n^2)
     * @Author running4light朱泽雄
     * @CreateTime 10:21 2021/5/24
     */
    public ListNode FindKthToTail (ListNode pHead, int k) {
        ListNode node = pHead;
        int i = 0;
        while (node!=null){
            i++;
            node = node.next;
        }
        if((i - k) < 0){
            return null;
        }
        return find(pHead, k, i);
    }
    public ListNode find(ListNode pHead, int k, int length){
        while(true){
            if(pHead == null){
                return null;
            }
            if((length - k) == 0){
                return  pHead;
            }
            k++;
            pHead = pHead.next;
        }
    }
    /**
     * @Description     list方式
     *  时间复杂度：O（n）
     * @Author running4light朱泽雄
     * @CreateTime 10:21 2021/5/24
     */
    public ListNode find2(ListNode pHead, int k){
        ListNode node = pHead;
        List<ListNode> list = new ArrayList<>();
        int i = 0;
        while (node!=null){
            list.add(node);
            i++;
            node = node.next;
        }
        int size = list.size();
        if((size - k)<0 || (size - k) > size - 1){
            return null;
        }
        return list.get(size - k);
    }
}
