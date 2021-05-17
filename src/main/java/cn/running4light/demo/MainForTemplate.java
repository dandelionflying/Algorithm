package cn.running4light.demo;

import cn.running4light.demo.template.LinearSearch;
import cn.running4light.demo.template.entity.Student;

/**
 * @author running4light
 * @description 算法模板测试入口
 * @createTime 2021/5/17 9:39
 */
public class MainForTemplate {
    public static void main(String[] args) {
        // 线性查找
        testLinearSearch();
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
}
