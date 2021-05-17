package cn.running4light.demo.utils;

import cn.running4light.demo.template.sort.SelectiveSorting;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author running4light
 * @description 排序测试工具
 * @createTime 2021/5/17 15:38
 */
public class SortingUtil {
    /**
     * @Description 性能测试
     * @Author running4light朱泽雄
     * @CreateTime 15:53 2021/5/17
     */
    public static <T extends Comparable<T>> void test(String sortName, T[] data, String sort) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        long time = System.nanoTime();
//        Class<?> aClass = Class.forName("cn.running4light.demo.template.sort.SelectiveSorting");
//        Method method = aClass.getDeclaredMethod("sort", Integer[].class, String.class);
//        Object invoke = method.invoke(aClass, data, sort);
        if("SelectiveSorting".equals(sortName)){
            SelectiveSorting.sort(data, sort);
        }
        long endTime = System.nanoTime();
        /*for (T d :
                data) {
            System.err.print(d+" ");
        }*/
        double result = (endTime - time) / 1000000000.0;
        System.err.println("数组长度:"+data.length+"\t执行时间："+result+" s");
    }
}
