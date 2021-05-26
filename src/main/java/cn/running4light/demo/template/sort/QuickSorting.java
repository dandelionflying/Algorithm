package cn.running4light.demo.template.sort;

import cn.running4light.demo.utils.SortingUtil;

import java.util.Random;

/**
 * @author running4light
 * @description 快速排序
 *      1.时间复杂度：
 *      2.空间复杂度：
 * @createTime 2021/5/25 11:13
 */
public class QuickSorting {
    private static String sort = "";
    private static Random random = new Random();
    public static <T extends Comparable<T>> void sort(T[] arr, String sorts){
        sort = sorts;
        // 维乐避免if判断影响性能测试，增减测试分开
        if("asc".equals(sort))
            quickSortAsc(arr, 0 , arr.length - 1);
        else
            quickSortDesc(arr, 0 , arr.length - 1);
    }
    /**
     * @Description 递归划分
     * @Author running4light朱泽雄
     * @CreateTime 12:18 2021/5/25
     */
    public static <T extends Comparable<T>> void quickSortAsc(T[] arr, int l, int r){
        if(l >= r)
            return;
        int p = partitionAsc(arr, l , r);
        quickSortAsc(arr, l, p -1);
        quickSortAsc(arr, p + 1, r);
    }
    public static <T extends Comparable<T>> void quickSortDesc(T[] arr, int l, int r){
        if(l >= r)
            return;
        int p = partitionDesc(arr, l , r);
        quickSortDesc(arr, l, p -1);
        quickSortDesc(arr, p + 1, r);
    }
    /**
     * @Description 排序--递增
     * @Author running4light朱泽雄
     * @CreateTime 12:17 2021/5/25
     */
    public static <E extends Comparable<E>> int partitionAsc(E[] arr, int l, int r){
        E value = arr[l];
        int j = l;
        int i = l + 1;
        while(i <= r){
            E arri = arr[i];
            if (arri.compareTo(value) < 0){
                j++;
                SortingUtil.swap(arr, j, i);
            }
            i++;
        }
        SortingUtil.swap(arr, l, j);
        return j;
    }
    /**
     * @Description 排序--递减
     * @Author running4light朱泽雄
     * @CreateTime 12:17 2021/5/25
     */
    public static <E extends Comparable<E>> int partitionDesc(E[] arr, int l, int r){
        E value = arr[l];
        int j = l;
        int i = l + 1;
        while(i <= r){
            E arri = arr[i];
            if (arri.compareTo(value) > 0){
                j++;
                SortingUtil.swap(arr, j, i);
            }
            i++;
        }
        SortingUtil.swap(arr, l, j);
        return j;
    }
    /**************************************优化部分**************************************/
    public static <T extends Comparable<T>> void sort2(T[] arr, String sorts){
        sort = sorts;
        // 维乐避免if判断影响性能测试，增减测试分开
        if("asc".equals(sort))
            quickSortAsc2(arr, 0 , arr.length - 1);
    }
    /**
     * @Description 递归划分
     * @Author running4light朱泽雄
     * @CreateTime 12:18 2021/5/25
     */
    public static <T extends Comparable<T>> void quickSortAsc2(T[] arr, int l, int r){
        if(l >= r)
            return;
        int p = partitionAsc2(arr, l , r);
        quickSortAsc2(arr, l, p -1);
        quickSortAsc2(arr, p + 1, r);
    }
    /**
     * @Description 排序--递增  优化：对于已经排好序的数组，会不断从每个分组的第一个开始遍历，从第一个划分，故引入随机的索引标记，不以初始的左边界l为起始
     * @Author running4light朱泽雄
     * @CreateTime 9:46 2021/5/26
     */
    public static <E extends Comparable<E>> int partitionAsc2(E[] arr, int l, int r){
        // 随机标记索引，不以l为基准
        // 生成 [l,r]之间的随机索引
        int p = l + random.nextInt(r - l + 1);
        SortingUtil.swap(arr, l, p);

        E value = arr[l];
        int j = l;
        int i = l + 1;
        while(i <= r){
            E arri = arr[i];
            if (arri.compareTo(value) < 0){
                j++;
                SortingUtil.swap(arr, j, i);
            }
            i++;
        }
        SortingUtil.swap(arr, l, j);
        return j;
    }
}
