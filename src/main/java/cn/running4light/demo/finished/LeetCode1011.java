package cn.running4light.demo.finished;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author running4light
 * @description
 *  传送带上的包裹必须在 D 天内从一个港口运送到另一个港口。
 * 传送带上的第 i 个包裹的重量为 weights[i]。每一天，我们都会按给出重量的顺序往传送带上装载包裹。我们装载的重量不会超过船的最大运载重量。
 * 返回能在 D 天内将传送带上的所有包裹送达的船的最低运载能力。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/capacity-to-ship-packages-within-d-days=
 * @createTime 2021/5/31 15:43
 */
public class LeetCode1011 {

    public int run (int[] weights, int days){
        return shipWithinDays(weights, days);
    }

    public int shipWithinDays(int[] weights, int days) {
        int sum = Arrays.stream(weights).sum();
//        Integer max = Arrays.stream(weights).max(Comparator.naturalOrder()).orElse(null);
        int max = Arrays.stream(weights).max().getAsInt();
        // 对于左边界而言，由于我们不能「拆分」一个包裹，因此船的运载能力不能小于所有包裹中最重的那个的重量，即左边界为数组 \textit{weights}weights 中元素的最大值。
        int l = max;
        int r = sum;
        while (l < r){
            int mid = l+(r-l)/2;
            if(finishedTime(weights, mid) > days){
                l = mid + 1;
            } else {
                r = mid;
            }
        }
//        System.err.println(sum);
        return l;
    }
    /**
     * @Description 承载能力为mid时，完成所有运输任务需要的天数
     * @Author running4light朱泽雄
     * @CreateTime 11:06 2021/6/1
     */
    private int finishedTime(int[] weights, int mid) {
        int tmp = 0;
        int days = 1;
        for (int weight: weights) {
            if(tmp + weight > mid){
                days++;
                tmp = 0;
            }
            tmp+=weight;
        }
        System.err.println("承载能力：" + mid + "\t需要天数：" + days);
        return days;
    }
}
