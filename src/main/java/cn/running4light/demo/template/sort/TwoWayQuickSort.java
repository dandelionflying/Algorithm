package cn.running4light.demo.template.sort;

import cn.running4light.demo.utils.SortingUtil;

import java.util.Random;

/**
 * @author running4light
 * @description 双路快排
 * @createTime 2021/5/26 11:12
 */
public class TwoWayQuickSort {
    private static String sort = "";
    private static Random random = new Random();
    /**
     * @Description
     * @Author running4light朱泽雄
     * @CreateTime 11:13 2021/5/26
     */
    public static <T extends Comparable<T>> void sort(T[] arr, String sorts){
        sort = sorts;
        // 维乐避免if判断影响性能测试，增减测试分开
        if("asc".equals(sort))
            quickSortAsc(arr, 0 , arr.length - 1);
    }
    public static <T extends Comparable<T>> void quickSortAsc(T[] arr, int l, int r){
        if(l >= r)
            return;
        int p = partitionAsc(arr, l , r);
        quickSortAsc(arr, l, p -1);
        quickSortAsc(arr, p + 1, r);
    }
    public static <E extends Comparable<E>> int partitionAsc(E[] arr, int l, int r){
        // 随机标记索引，不以l为基准
        // 生成 [l,r]之间的随机索引
        int p = l + random.nextInt(r - l + 1);
        SortingUtil.swap(arr, l, p);

        int i = l + 1, j = r;
        while (true){
            while (i <= j && arr[i].compareTo(arr[l]) < 0){
                i++;
            }
            while (i <= j && arr[j].compareTo(arr[l]) > 0){
                j--;
            }
            if(i >= j)
                break;
            SortingUtil.swap(arr, i, j);
            i++;
            j--;
        }
        SortingUtil.swap(arr, l, j);
        return j;
    }
}
