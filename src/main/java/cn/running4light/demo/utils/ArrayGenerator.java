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
}
