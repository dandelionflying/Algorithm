package cn.running4light.demo.template.sort;

import cn.running4light.demo.utils.SortingUtil;

import java.util.Random;

/**
 * @author running4light
 * @description 三路快排
 *      1.时间复杂度：O(n)
 * @CreateTime 11:36 2021/5/27
 */
public class QuickSortThreeWay {
    private static String sort = "";
    private static Random random = new Random();
    /**
     * @Description
     * @Author running4light朱泽雄
     * @CreateTime 11:36 2021/5/27
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
        // 随机标记索引，不以l为基准
        // 生成 [l,r]之间的随机索引
        int p = l + random.nextInt(r - l + 1);
        SortingUtil.swap(arr, l, p);
        // arr[l+1 , lt] < v,   arr[lt+1, i-1] ==v ,    arr[gt,r] > v
        int lt = l;
        int i = l + 1;
        int gt = r + 1;
        while (i < gt){
            if(arr[i].compareTo(arr[l])<0){
                lt++;
                SortingUtil.swap(arr, i, lt);
                i++;
            } else if(arr[i].compareTo(arr[l])>0){
                gt--;
                SortingUtil.swap(arr, i, gt);
            } else{
                i++;
            }
        }
        SortingUtil.swap(arr, l, lt);
        quickSortAsc(arr, l, lt - 1);
        quickSortAsc(arr, gt, r);
    }

}
