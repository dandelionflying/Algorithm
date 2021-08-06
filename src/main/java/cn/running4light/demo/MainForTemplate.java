package cn.running4light.demo;

import cn.running4light.demo.template.search.BinarySearch;
import cn.running4light.demo.template.search.LinearSearch;
import cn.running4light.demo.template.entity.Student;
import cn.running4light.demo.utils.ArrayGenerator;
import cn.running4light.demo.utils.SearchUtil;
import cn.running4light.demo.utils.SortingUtil;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Random;

/**
 * @author running4light
 * @description 算法模板测试入口
 * @createTime 2021/5/17 9:39
 */
public class MainForTemplate {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        boolean ifPrint = true;// 是否打印数组
        // 线性查找
//        testLinearSearch(ifPrint);
//        testBinarySearch(ifPrint);
        testSort(ifPrint);
//        testQuickSort(ifPrint);
    }
    /**
     * @Description 二分查找
     * @Author running4light朱泽雄
     * @CreateTime 10:25 2021/5/28
     */
    private static void testBinarySearch(boolean ifPrint) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Integer[] data = ArrayGenerator.generateAsc(10000000, "asc");
//        Integer[] data2 = Arrays.copyOfRange(data, 0, data.length);
        Random random = new Random();
        for (int i = 1; i <= 10; i++) {
            System.err.println("round " + i);
            Integer value = random.nextInt(10000000);
            SearchUtil.test("BinarySearch", data, value, ifPrint);
            SearchUtil.test("BinarySearch","searchWithoutRecursion", data, value, ifPrint);
        }
    }

    /**
     * @Description 测试--线性查找
     * @Author running4light朱泽雄
     * @CreateTime 14:18 2021/5/17
     */
    public static <E> void testLinearSearch(boolean ifPrint){
        Integer[] data = {52,5,6,8,7,1,3,88,121};
        int search = LinearSearch.search(data, 5);
        System.err.println(search);
        Student[] students  = {new Student("dd"),
                new Student("aa"),
                new Student("cc")};
        Student cc = new Student("cc");
        System.err.println(LinearSearch.search(students,cc));
    }
    /**
     * @Description 快拍测试
     * @Author running4light朱泽雄
     * @CreateTime 10:15 2021/5/26
     */
    public static <E> void testQuickSort(boolean ifPrint) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        int n = 10000;
        int[] dataSize = {1000000};
//        int[] dataSize = {100};
        String sort = "asc";
        for (int nn :
                dataSize) {
            Integer[] data = ArrayGenerator.generateRandom(nn, nn);
            Integer[] data2 = ArrayGenerator.generateAsc(nn, sort);
            Integer[] data3 = Arrays.copyOfRange(data, 0, data.length);
            Integer[] data4 = Arrays.copyOfRange(data, 0, data.length);
            Integer[] data5 = Arrays.copyOfRange(data, 0, data.length);
//            SortingUtil.test("SelectiveSorting", data, sort);
//            SortingUtil.test("InsertionSorting", data, sort);
//            SortingUtil.test("MergeSorting", data, sort);
//            SortingUtil.test2("MergeSorting","sort2", data, sort);// 归并排序优化测试
//            SortingUtil.test("QuickSorting", data, sort);// 快排--测试普通随机数组
//            SortingUtil.test("QuickSorting", data2, sort);// 快排--测试有序数组
//            SortingUtil.test2("QuickSorting", "sort2", data2, sort);// 快排优化--随机索引标记--测试有序数组
//            SortingUtil.test2("QuickSorting", "sort2", data3, sort);// 快排优化--随机索引标记--测试单值数组
//            SortingUtil.test("QuickSortTwoWay", data3, sort);// 双路快排--测试单值数组
            SortingUtil.test2("QuickSorting", "sort2", data, sort, ifPrint);// 快排优化--随机索引标记--测试普通随机数组
            SortingUtil.test("QuickSortTwoWay", data5, sort, ifPrint);// 双路快排
            SortingUtil.test2("QuickSortThreeWay", "sort", data4, sort, ifPrint);// 三路快排
//            SortingUtil.test2("QuickSorting", "sort3", data, sort);
        }
    }

    /**
     * @Description 性能测试--排序算法对比
     * @Author running4light朱泽雄
     * @CreateTime 15:15 2021/5/17
     */
    public static void testSort(boolean ifPrint) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        // 普通数据类型的泛型使用
//        Integer[] data = {52,5,6,8,7,1,3,88,121};
        int n = 10000;
        int[] dataSize = {10000,100000};
//        int[] dataSize = {100};
        String sort = "asc";
        for (int nn :
                dataSize) {
            Integer[] data = ArrayGenerator.generateRandom(nn, nn);
//            Integer[] data = ArrayGenerator.generateAsc(nn, sort);
//            SortingUtil.test("SelectiveSorting", data, sort, ifPrint);
            SortingUtil.test("InsertionSorting", data, sort, ifPrint);
//            SortingUtil.test("MergeSorting", data, sort);
//            SortingUtil.test2("MergeSorting","sort2", data, sort);// 归并排序优化测试
//            SortingUtil.test("QuickSorting", data, sort);// 快排
//            SortingUtil.test("TwoWayQuickSort", data, sort, ifPrint);// 双路快排
        }

        System.err.println();
//        SelectiveSorting.sort(data, "desc");
        // 复杂对象的泛型使用
       /* StudentComparable[] students  = {new StudentComparable("dd", 55),
                new StudentComparable("aa", 66),
                new StudentComparable("cc", 11)};
        StudentComparable cc = new StudentComparable("cc", 11);
        SelectiveSorting.sort(students, "asc");*/
        /*for (StudentComparable stu :
                students) {
            System.err.println(stu);
        }*/
//        SelectiveSorting.sort(students, "desc");
    }
}
