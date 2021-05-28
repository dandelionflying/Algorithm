package cn.running4light.demo.utils;

import java.util.Random;

/**
 * @author running4light
 * @description
 * @createTime 2021/5/17 15:26
 */
public class ArrayGenerator {
    /**
     * @Description 生成随机数组
     * @Author running4light朱泽雄
     * @CreateTime 15:28 2021/5/17
     * @param n 数组长度
     * @param bound 随机数范围
     */
    public static Integer[] generateRandom(int n, int bound){
        Integer[] arr = new Integer[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(bound);
        }
        return arr;
    }
    /**
     * @Description 生成有序数组
     * @Author running4light朱泽雄
     * @CreateTime 10:06 2021/5/26
     * @param order "asc" for incremental or "desc" for decreasing, others for equivalence
     */
    public static Integer[] generateAsc(int length, String order){
        Integer[] arr = new Integer[length];
        if("asc".equals(order)){
            for (int i = 0; i < length ; i++) {
                arr[i] = i;
            }
        } else if("desc".equals(order)){
            for (int i = length; i < 0 ; i--) {
                arr[i] = i;
            }
        } else{
            for (int i = length; i < 0 ; i--) {
                arr[i] = 1;
            }
        }
        return arr;
    }
}
