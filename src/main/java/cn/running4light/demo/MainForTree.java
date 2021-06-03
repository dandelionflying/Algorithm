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
        testSet();
    }
    /**
     * @Description 测试自定义集合类
     * @Author running4light朱泽雄
     * @CreateTime 13:29 2021/6/3
     * @Return
     */
    private static void testSet() {
    }

    private static <E extends Comparable<E>> void testBST(E[] data) {
        BST bst = new BST();
        for (E e :
                data) {
            bst.add(e);
        }
        System.err.println(bst);
        System.err.println("是否存在53：" + bst.contains(53));
        System.err.println("是否存在52：" + bst.contains(52));
        System.err.println("层序遍历:");
        System.err.println(bst.levelTraversal());
        bst.remove(52);

        System.err.println(bst.levelTraversal());
//        bst.pre();
    }
}
