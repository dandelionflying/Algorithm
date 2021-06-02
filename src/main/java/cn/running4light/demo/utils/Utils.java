package cn.running4light.demo.utils;

import cn.running4light.demo.entity.Catalogue;
import cn.running4light.demo.finished.*;
import cn.running4light.demo.template.search.BinarySearch;
import cn.running4light.demo.template.search.LinearSearch;
import cn.running4light.demo.template.sort.*;
import cn.running4light.demo.finished.LeetCode1011;
import cn.running4light.demo.tree.BST;
import cn.running4light.demo.unfinished.LeetCode12;
import cn.running4light.demo.finished.LeetCode206;
import cn.running4light.demo.finished.LeetCode19;

import java.util.ArrayList;
import java.util.List;

/**
 * @author running4light
 * @description
 * @createTime 2021/5/13 16:27
 */
public class Utils {

    public static List<Object> showCatalogue() {
        List<Object> list = new ArrayList();
        // 牛客
        list.add(new Catalogue("替换空格", JZ2.class));
        list.add(new Catalogue("重建二叉树、前中后序遍历", new JZ4()));
        list.add(new Catalogue("用两个栈实现队列", JZ5.class));
        list.add(new Catalogue("旋转数组求最小", JZ6.class));
        list.add(new Catalogue("斐波那契数列", JZ7.class));
        list.add(new Catalogue("跳台阶--斐波那契数列问题", JZ8.class));
        list.add(new Catalogue("链表中倒数第k个结点", JZ14.class));
        list.add(new Catalogue("合并两个单调递增的链表", JZ16.class));
        // LeetCode
        list.add(new Catalogue("整数转罗马", LeetCode12.class));
        list.add(new Catalogue("有效的括号-- 栈的使用", LeetCode20.class));
        list.add(new Catalogue("移除链表元素", LeetCode203.class));
        list.add(new Catalogue("翻转链表", LeetCode206.class));
        list.add(new Catalogue("删除链表的倒数第 N 个结点", LeetCode19.class));
        list.add(new Catalogue("旋转链表", LeetCode61.class));
        list.add(new Catalogue("爱吃香蕉的珂珂--二分搜索", LeetCode875.class));
        list.add(new Catalogue("在 D 天内送达包裹的能力--二分搜索", LeetCode1011.class));




        list.add(new Catalogue("线性查找(最普通的，主要是记录泛型用法)", LinearSearch.class));
        list.add(new Catalogue("二分查找", BinarySearch.class));
        list.add(new Catalogue("选择排序", SelectiveSorting.class));
        list.add(new Catalogue("归并排序", MergeSorting.class));
        list.add(new Catalogue("快速排序", QuickSorting.class));
        list.add(new Catalogue("双路快排", QuickSortTwoWay.class));
        list.add(new Catalogue("三路快排", QuickSortThreeWay.class));
        list.add(new Catalogue("二分搜索树", BST.class));



        System.err.println(list);
        return list;
    }
}
