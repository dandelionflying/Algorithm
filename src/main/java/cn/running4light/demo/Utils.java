package cn.running4light.demo;

import cn.running4light.demo.finished.*;
import cn.running4light.demo.unfinished.LeetCode12;

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
        list.add(new Catalogue("替换空格", JZ2.class));
        list.add(new Catalogue("重建二叉树", new JZ4()));
        list.add(new Catalogue("用两个栈实现队列", JZ5.class));
        list.add(new Catalogue("旋转数组求最小", JZ6.class));
        list.add(new Catalogue("斐波那契数列", JZ7.class));
        list.add(new Catalogue("跳台阶--斐波那契数列问题", JZ8.class));
        list.add(new Catalogue("整数转罗马", LeetCode12.class));
        System.err.println(list);
        return list;
    }
}
