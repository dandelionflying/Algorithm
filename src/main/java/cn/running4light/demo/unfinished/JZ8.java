package cn.running4light.demo.unfinished;

/**
 * @author running4light
 * @description 跳台阶：一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 * @createTime 2021/5/13 16:43
 */
public class JZ8 {
    public int jumpFloor(int target) {
        // 10
        1 1 1 1  len1
        2 2      len2
        需要做len2-len1次组合
        第一次
        2 1 0
        4*3*2 = 12
        第二次
        2 2 0


        2 1 1 0
        2 1 0 1
        2 0 1 1
        1 2 1 0
        1 2 0 1
        0 2 1 1
        1 1 2 0
        1 0 2 1
        0 1 2 1
        0 1 1 2


        2 2 0 0
        2 0 2 0
        2 0 0 2
        0 2 2 0
        0 2 0 2
        0 0 2 2



        return 0;
    }
}
