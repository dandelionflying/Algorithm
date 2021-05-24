package cn.running4light.demo.template.sort;

import java.util.Arrays;

/**
 * @author running4light
 * @description 归并排序
 *      1.时间复杂度：O(nlog2n)
 *      2.空间复杂度：
 * @createTime 2021/5/24 15:18
 */
public class MergeSorting {
    private static String sort = "";
    public static <E extends Comparable<E>> void sort(E[] arr, String sorts){
        sort = sorts;
        mergeSort(arr, 0, arr.length - 1);
    }
    public static <E extends Comparable<E>> void mergeSort(E[] arr, int l, int r){
        if(l >= r)
            return;
        int mid = l + (r - l)/2;//(l + r)/2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, r);
        if ("asc".equals(sort))
            mergeAsc(arr, l, r ,mid);
        else
            mergeDesc(arr, l, r ,mid);
    }
    /**
     * @Description 归并--递增
     * @Author running4light朱泽雄
     * @CreateTime 15:32 2021/5/24
     */
    private static <E extends Comparable<E>> void mergeAsc(E[] arr, int l, int r, int mid){
        E[] temp = Arrays.copyOfRange(arr, l, r + 1);
        int i = l, j = mid + 1;
        for (int k = l; k <= r; k++) {
            if (i > mid) {
                arr[k] = temp[j - l];
                j++;
            } else if (j > r) {
                arr[k] = temp[i - l];
                i++;
            } else if (temp[i - l].compareTo(temp[j - l]) <= 0) {
                arr[k] = temp[i - l];
                i++;
            } else {
                arr[k] = temp[j - l];
                j++;
            }
        }
    }
    /**
     * @Description 归并--递减
     * @Author running4light朱泽雄
     * @CreateTime 16:14 2021/5/24
     */
    private static <E extends Comparable<E>> void mergeDesc(E[] arr, int l, int r, int mid){
        E[] temp = Arrays.copyOfRange(arr, l, r + 1);
        int i = l, j = mid + 1;
        for (int k = l; k <= r; k++) {
            if (i > mid) {
                arr[k] = temp[j - l];
                j++;
            } else if (j > r) {
                arr[k] = temp[i - l];
                i++;
            } else if (temp[i - l].compareTo(temp[j - l]) > 0) {
                arr[k] = temp[i - l];
                i++;
            } else {
                arr[k] = temp[j - l];
                j++;
            }
        }
    }
}
