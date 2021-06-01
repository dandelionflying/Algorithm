package cn.running4light.demo.unfinished;

/**
 * @author running4light
 * @description 牛客--二进制中1的个数
 * @createTime 2021/6/1 15:02
 */
public class JZ11 {
    /**
     * @Description 二进制移位法（暴力）
     *      1.时间复杂度：O(32)
     *      2.空间复杂度：O(1)
     *
     *
     * @Author running4light朱泽雄
     * @CreateTime 15:13 2021/6/1
     */
    public int NumberOf1(int n) {
        int re = 0;
        /*while(n!=0){
            if(n%2 == 1){
                re++;
            }
            n = n/2;
        }*/
        int mark = 0x01;
        while (mark  != 0) {
            if ((mark & n) != 0) ++re;
            mark <<= 1;
        }
        return re;
    }
    /**
     * @Description 技巧法
     *
     *  “对于上一种解法中，无用操作是，如果当前位是0， 还是会做判断，然后一位一位的移动。
     * 如果，给你一种超能力，你一下可以对从右向左的第一位1直接判断，遇到0直接略过，那效率是不是很快。
     *
     * 现考虑二进制数：val :1101000, val-1: 1100111 那么val & （val-1） : 1100000
     * 如果你会了这个操作，是不是这题就很简单了。”
     *
     * @Author running4light朱泽雄
     * @CreateTime 15:22 2021/6/1
     */
    public int NumberOf1B(int val){
        int ans = 0;
        while (val != 0) {
            ++ans;
            val = val & (val-1);
        }
        return ans;
    }
}
