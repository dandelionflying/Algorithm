package cn.running4light.demo;

import cn.running4light.demo.template.entity.Student;
import cn.running4light.demo.utils.Array;

/**
 * @author running4light
 * @description
 * @createTime 2021/5/18 11:51
 */
public class TestMain {

    public static void main(String[] args) {
        Array<Integer> arr = new Array();
        for (int i = 0; i < 12; i++) {
            arr.addLast(i);
        }
        System.err.println(arr.toString());
        Array<Student> array = new Array();
        Student[] students  = {new Student("dd"),
                new Student("aa"),
                new Student("cc")};
        for (Student s :
                students) {
            array.addLast(s);
        }
        System.err.println(array.toString());

    }
}
