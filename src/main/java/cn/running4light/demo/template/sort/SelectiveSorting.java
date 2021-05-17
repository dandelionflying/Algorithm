package cn.running4light.demo.template.sort;

import cn.running4light.demo.utils.SortingUtil;

/**
 * @author running4light
 * @description 选择排序算法
 *      1.时间复杂度：1+2+3+······+n = (1+n)n/2 = ½n²+½n = O(n^2)
 *      2.空间复杂度：
 * @createTime 2021/5/17 14:22
 */
public class SelectiveSorting {
    /**
     * @Description 选择排序
     * @Author running4light朱泽雄
     * @CreateTime 14:23 2021/5/17
     */
    public static <T extends Comparable<T>> void sort(T[] data, String sort) {
        if ("asc".equals(sort)) {
            sortAsc(data);
        } else if ("desc".equals(sort)) {
            sortDesc(data);
        }
    }
    /**
     * @Description 正序
     * @Author running4light朱泽雄
     * @CreateTime 14:48 2021/5/17
     */
    private static <T extends Comparable<T>> void sortDesc(T[] data) {
        int index = 0;
        int tmpIndex = 0;
        int minIndex = 0;
        while (index < data.length) {
            if (data[minIndex].compareTo(data[index]) <0 ) {
                minIndex = index;
            }
            if (index == data.length - 1) {
                // 交换
                SortingUtil.swap(data, minIndex, tmpIndex);
                tmpIndex++;
                index = tmpIndex + 1;
                minIndex = tmpIndex;
                continue;
            }
            index++;
        }
    }
    /**
     * @Description 倒序
     * @Author running4light朱泽雄
     * @CreateTime 14:48 2021/5/17
     */
    private static <T extends Comparable<T>> void sortAsc(T[] data) {
        int index = 0;
        int tmpIndex = 0;
        int maxIndex = 0;
        while (index < data.length) {
            if (data[maxIndex].compareTo(data[index]) > 0) {
                maxIndex = index;
            }
            if (index == data.length - 1) {
                // 交换
                SortingUtil.swap(data, maxIndex, tmpIndex);
                tmpIndex++;
                index = tmpIndex + 1;
                maxIndex = tmpIndex;
                continue;
            }
            index++;
        }
    }
}
