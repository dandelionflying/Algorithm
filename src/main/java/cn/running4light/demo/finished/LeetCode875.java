package cn.running4light.demo.finished;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author running4light
 * @description 爱吃香蕉的珂珂
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/koko-eating-bananas
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @createTime 2021/5/28 15:32
 */
public class LeetCode875 {
    /**
     * @Description
     * 珂珂喜欢吃香蕉。这里有 N 堆香蕉，第 i 堆中有 piles[i] 根香蕉。警卫已经离开了，将在 H 小时后回来。
     * 珂珂可以决定她吃香蕉的速度 K （单位：根/小时）。每个小时，她将会选择一堆香蕉，从中吃掉 K 根。如果这堆香蕉少于 K 根，她将吃掉这堆的所有香蕉，然后这一小时内不会再吃更多的香蕉。  
     * 珂珂喜欢慢慢吃，但仍然想在警卫回来前吃掉所有的香蕉。
     * 返回她可以在 H 小时内吃掉所有香蕉的最小速度 K（K 为整数）。
     *  eg:
     *      输入: piles = [3,6,7,11], H = 8
     *      输出: 4
     *      输入: piles = [30,11,23,4,20], H = 5
     *      输出: 30
     *      输入: piles = [30,11,23,4,20], H = 6
     *      输出: 23
     * @Author running4light朱泽雄
     * @CreateTime 15:33 2021/5/28
     */
    public int run(Integer[] piles, Integer h){
        return minEatingSpeed(piles,h);
    }
    /**
     * @Description " 寻找eatingTIme(k)<= H的最大eatingtime对应的k"
     *  总时长h与每小时吃的个数k成单调负相关，k范围从1到 piles数组的最大值递增，符合二分查找的特性--已排序
     * @Author running4light朱泽雄
     * @CreateTime 15:14 2021/5/31
     */
    public Integer minEatingSpeed(Integer[] piles, Integer h) {
        int l = 1;
        Integer max = Arrays.stream(piles).max(Comparator.naturalOrder()).orElse(null);
       /* int max = piles[0];
        for (Integer in :
                piles) {
            if (in > max){
                max = in;
            }
        }*/
//        Arrays.sort(piles,(a, b) -> a > b ? 1 : -1);
        int r = max;
        while (l < r){
            int mid = l + (r - l)/2;// 下取整
//            int mid = l + (r - l)/2;// 上取整
            if (eatingTime(piles, mid) <= h){
                r = mid;
            }else {
                l = mid + 1;
            }
        }
        return l;
    }
    /**
     * @Description 每小时吃k根香蕉，吃完全部的时长
     * @Author running4light朱泽雄
     * @CreateTime 15:24 2021/5/31
     */
    private int eatingTime (Integer[] piles, Integer k){
        int res = 0;
        for (int p :
                piles) {
            res += p / k + (p % k > 0 ? 1 : 0);
        }
        return res;
    }
}
