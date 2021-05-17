package cn.running4light.demo;

import cn.running4light.demo.template.LinearSearch;
import cn.running4light.demo.template.entity.Student;
import cn.running4light.demo.template.entity.StudentComparable;
import cn.running4light.demo.template.sort.SelectiveSorting;
import cn.running4light.demo.utils.ArrayGenerator;
import cn.running4light.demo.utils.SortingUtil;

import java.lang.reflect.InvocationTargetException;

/**
 * @author running4light
 * @description 算法模板测试入口
 * @createTime 2021/5/17 9:39
 */
public class MainForTemplate {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        // 线性查找
//        testLinearSearch();
        testSort();
    }
    /**
     * @Description 测试--线性查找
     * @Author running4light朱泽雄
     * @CreateTime 14:18 2021/5/17
     */
    public static <E> void testLinearSearch(){
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
     * @Description 测试--选择排序
     * @Author running4light朱泽雄
     * @CreateTime 15:15 2021/5/17
     */
    public static void testSort() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        // 普通数据类型的泛型使用
//        Integer[] data = {52,5,6,8,7,1,3,88,121};
        int n = 10000;
        int[] dataSize = {10000,100000};
        for (int nn :
                dataSize) {
            Integer[] data = ArrayGenerator.generateRandom(nn, nn);
            SortingUtil.test("SelectiveSorting", data, "asc");
        }
//        long time = System.nanoTime();
//        SelectiveSorting.sort(data, "asc");
//        long endTime = System.nanoTime();
//        double result = (endTime - time) / 1000000000.0;
//        System.err.println("数组长度:"+n+"\t执行时间："+result+" s");
        /*for (Integer d:
                data) {
            System.err.print(d+" ");
        }*/

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
