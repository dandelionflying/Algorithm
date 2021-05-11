package cn.running4light.demo;

import cn.running4light.demo.unfinished.JZ4;
import cn.running4light.demo.finished.TreeNode;
import cn.running4light.demo.unfinished.JZ6;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
       /* JZ4 jz4 = new JZ4();
        int[] pre = {1,2,3,4,5,6,7};
        int[] in = {3,2,4,1,6,5,7};
        int indexPre = 0;
        int indexIn = 0;
        int length = 7;
        TreeNode treeNode = jz4.buildTree(pre, in, indexPre, indexIn, length);
        jz4.pre(treeNode);
        System.err.println();
        jz4.mid(treeNode);
        System.err.println();
        jz4.post(treeNode);
        System.out.println();*/
        testJZ6();
    }

    public static void testJZ6() {
        JZ6 jz6 = new JZ6();
//        int[] data = {};
//        int[] data = {3, 4, 5, 1, 2};
//        int[] data = {2, 3, 4, 5, 1};
//        int[] data = {1, 2, 3, 4, 5};
//        int[] data = {5, 1, 2, 3, 4};
//        int[] data = {3, 4, 5, 6, 1, 2};
//        int[] data = {2, 3, 4, 5, 6, 1};
//        int[] data = {1, 2, 3, 4, 5, 6};
//        int[] data = {5, 6,  1, 2, 3, 4};
//        int[] data = {4, 5, 6, 1, 2, 3};
        int[] data = {4, 5, 6, 1, 2, 2, 3, 3};
// 需要采用二分法
        int dd = jz6.minNumberInRotateArray(data);
        System.err.println("result:"+dd);
    }
}
