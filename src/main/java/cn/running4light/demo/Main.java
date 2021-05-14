package cn.running4light.demo;

import cn.running4light.demo.finished.JZ6;
import cn.running4light.demo.finished.TreeNode;
import cn.running4light.demo.finished.JZ4;
import cn.running4light.demo.finished.JZ7;
import cn.running4light.demo.unfinished.LeetCode12;

import java.util.Scanner;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
//        testZJ4();
//        testJZ6();
//        testDivide();
//        Utils.showCatalogue();
//        testJZ7();
        testLeetCode12();
    }
    /*
     * @description
     * @Author running4light朱泽雄
     * @CreateTime 2021/5/14 15:23
     * @return
     */
    private static void testLeetCode12() {
        LeetCode12 leetCode12 = new LeetCode12();
        String s = leetCode12.intToRoman(901);
        System.err.println(s);
    }

    private static void testJZ7() {
        JZ7 jz = new JZ7();
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long start1 = System.currentTimeMillis();
        int result1 = jz.Fibonacci(n);
        long time1 = System.currentTimeMillis() - start1;
        System.err.println(result1+"\t耗时："+time1);
        long start2 = System.currentTimeMillis();
        int result2 = jz.Fibonacci2(n);
        long time2 = System.currentTimeMillis() - start2;
        System.err.println(result2+"\t耗时："+time2);
    }

    /**
     *  @Description
     *  @Author running4light朱泽雄
     *  @CreateTime 11:28 2021/5/13
     */
    public static void testZJ4(){
        JZ4 jz4 = new JZ4();
        int[] pre = {1,2,3,4,5,6,7};
        int[] in = {3,2,4,1,6,5,7};
        TreeNode treeNode = jz4.buildTree(pre, in);
        jz4.pre(treeNode);
        System.err.println();
        jz4.mid(treeNode);
        System.err.println();
        jz4.post(treeNode);
        System.out.println();
    }

    public static void testJZ6() {
//        非递减 即           数组递增或相邻元素相等！！
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
//        int[] data = {4, 5, 6, 1,       2,      2, 2, 3, 3};
//        int[] data = {4, 5, 6, 7,       1,      2, 2, 3, 3};
//        int[] data = {5, 6, 1, 2,       2,      2, 3, 3, 4};
//        int[] data = {3, 4, 5, 6,       7,      1, 2, 2, 3};
//        int[] data = {7,9,9,1,2,2,3,4,4,5,5,6};
//        int[] data = {4,4,5,5,6,7,9,9,1,2,2,3};
//        int[] data = {7,9,9,1,2,2,3,4,4,5,5,6,6};
//        int[] data = {4,4,5,5,6,7,9,9,1,2,2,3,3};
        int[] data = {4197, 4251, 4281, 4287, 4307, 4334, 4364, 4410, 4445, 4467, 4492, 4572, 4596, 4727, 4777, 4919, 4921, 4984, 5037, 5065, 5291, 5351, 5355, 5385,
                5403, 5416, 5638, 5711, 5754, 5757, 5766, 5813, 5839, 5847, 5925, 5940, 6032, 6078, 6091, 6218, 6302, 6372, 6455, 6544, 6581, 6670, 6733, 6750, 6758,
                6983, 7039, 7099, 7126, 7222, 7382, 7407, 7424, 7431, 7553, 7586, 7608, 7693, 7739, 7771, 7919, 7991, 8022, 8045, 8239, 8248, 8314, 8347, 8535, 8604,
                8650, 8688, 8786, 8799, 8843, 8957, 8987, 8990, 9023, 9102, 9112, 9144, 9196, 9234, 9241, 9353, 9434, 9435, 9472, 9479, 9487, 9500, 9533, 9590, 9681,
                9761, 9809, 9813, 9834, 9842, 9861, 22, 42, 103, 119, 141, 156, 171, 186, 195, 202, 310, 371, 465, 583, 633, 672, 755, 782, 816, 936, 961, 1040, 1046,
                1117, 1139, 1206, 1258, 1281, 1292, 1340, 1342, 1345, 1349, 1353, 1371, 1438, 1459, 1657, 1681, 1731, 1797, 1830, 2069, 2094, 2189, 2232, 2290, 2315,
                2316, 2369, 2390, 2404, 2412, 2518, 2548, 2557, 2588, 2667, 2675, 2678, 2875, 2896, 2948, 3001, 3050, 3064, 3118, 3125, 3137, 3159, 3169, 3190, 3270,
                3333, 3551, 3699, 3764, 3794, 3816, 3978, 3993, 4002, 4076, 4156, 4165};

// 需要采用二分法
        int dd = jz6.minNumberInRotateArray(data);
        System.err.println("result:"+dd);
    }
}
