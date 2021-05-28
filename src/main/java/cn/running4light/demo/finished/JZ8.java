package cn.running4light.demo.finished;

import java.util.Vector;

/**
 * @author running4light
 * @description 牛客--跳台阶：一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 * @createTime 2021/5/13 16:43
 */
public class JZ8 {
    /*
     * @description 斐波那契方式
     *  时间复杂度：（2^n）
     *  空间复杂度：递归栈的空间
     * @Author running4light朱泽雄
     * @CreateTime 2021/5/14 14:11
     * @param
     * @return
     */
    public int jumpFloor1(int n) {
        if (n<=1) return 1;
        return jumpFloor1(n-1) + jumpFloor1(n-2);
    }
    /*
     * @description 动态规划
     *  时间复杂度：  O(n)
     *  空间复杂度：  O(n)
     * @Author running4light朱泽雄
     * @CreateTime 2021/5/14 14:21
     * @param	n
     * @return
     */
    public int jumpFloor2(int n){
        Vector<Integer> dp = new Vector<>(n+1, 0);
        dp.add(1);
        dp.add(1);
        for (int i=2; i<=n; ++i) {
            dp.set(i,dp.get(i-1) + dp.get(i-2));
        }
        return dp.get(n);
    }

    /*
     * @description 最优
     *  时间复杂度：  O(n)
     *  空间复杂度：  1
     * @Author running4light朱泽雄
     * @CreateTime 2021/5/14 14:33
     * @param	n
     * @return
     */
    public int jumpFloor3(int n){
        if(n == 0)
            return 0;
        if(n == 1)
            return 1;
        int post = 1;
        int pre = 1;
        int result = 0;
        for (int i = 0; i < n - 1 ; i++) {
            result = pre+post;
            pre = post;
            post = result;
        }
        return result;
    }
}
