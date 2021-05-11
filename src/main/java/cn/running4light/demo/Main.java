package cn.running4light.demo;

import cn.running4light.demo.unfinished.JZ4;
import cn.running4light.demo.finished.TreeNode;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        JZ4 jz4 = new JZ4();
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
        System.out.println();
    }
}
