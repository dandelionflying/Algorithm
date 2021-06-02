package cn.running4light.demo;

import cn.running4light.demo.tree.BST;

/**
 * @author running4light
 * @description 树结构相关测试
 * @createTime 2021/6/2 11:48
 */
public class MainForTree {
    public static void main(String[] args) {
        Integer[] data = {52,5,6,8,7,1,3,88,121};
        testBST(data);
    }

    private static <E extends Comparable<E>> void testBST(E[] data) {
        BST bst = new BST();
        for (E e :
                data) {
            bst.add(e);
        }
        boolean search = bst.contains(53);
        System.err.println(bst);
        System.err.println(search);
//        bst.pre();
    }
}
