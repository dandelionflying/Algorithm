package cn.running4light.demo.template.sort;

import cn.running4light.demo.utils.SortingUtil;

/**
 * @author running4light
 * @description 插入排序
 *      1.时间复杂度：
 *      2.空间复杂度：
 * @createTime 2021/5/17 16:51
 */
public class InsertionSorting {

    /**
     * @Description 插入排序
     * @Author running4light朱泽雄
     * @CreateTime 17:48 2021/5/17
     */
    public static <T extends Comparable<T>> void sort(T[] data, String sort) {
        if ("asc".equals(sort)) {
            sortAsc2(data);
        } else if ("desc".equals(sort)) {
            sortDesc(data);
        }
    }

    /**
     * @Description 插入排序--递增
     * @Author running4light朱泽雄
     * @CreateTime 17:48 2021/5/17
     */
    private static <T extends Comparable<T>> void sortAsc(T[] data) {
        int index = 1;
        int j = 0;
        int curor = 1;
        while(index < data.length){
            if(j < 0){
                index++;
                curor = index;
                j = index - 1;
                continue;
            }
            if(data[j].compareTo(data[curor]) > 0){
                SortingUtil.swap(data, j, curor);
                curor--;
            }
            j--;
        }
    }
    /*
     * @description     优化
     * @Author running4light朱泽雄
     * @CreateTime 2021/5/17 20:17
     * @param	null
     * @return
     */
    private static <T extends Comparable<T>> void sortAsc2(T[] data) {
        int index = 1;
        int j = 1;
        T tmp;
        while(index < data.length){
            if(j < 1){
                index++;
                j = index - 1;
                continue;
            }
            tmp = data[index];
            if(data[j].compareTo(tmp) > 0){
                data[j] = data[j - 1];
            }else{
                data[j] = tmp;
            }
            j--;
        }
    }

    /**
     * @Description 插入排序--递减
     * @Author running4light朱泽雄
     * @CreateTime 17:47 2021/5/17
     */
    private static  <T extends Comparable<T>> void sortDesc(T[] data) {
        int index = 1;
        int j = 0;
        int curor = 1;
        while(index < data.length){
            if(j < 0){
                index++;
                curor = index;
                j = index - 1;
                continue;
            }
            T dataj = data[j];
            T dataindex = data[curor];
            if(data[j].compareTo(data[curor]) < 0){
                SortingUtil.swap(data, j, curor);
                curor--;
            }
            j--;
        }
    }
}
