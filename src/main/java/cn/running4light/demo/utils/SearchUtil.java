package cn.running4light.demo.utils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author running4light
 * @description 查找算法测试
 * @createTime 2021/5/28 10:42
 */
public class SearchUtil {
    /**
     * @Description
     * @Author running4light朱泽雄
     * @CreateTime 11:05 2021/5/28
     * @param searchName 算法名称（类名）
     * @param data
     * @param value 目标元素
     * @param print 是否输出数组
     */
    public static <T extends Comparable<T>> void test(String searchName, T[] data, T value, boolean print) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        long time = System.nanoTime();
        Class<?> aClass = Class.forName("cn.running4light.demo.template.search."+searchName);
        Method method = aClass.getDeclaredMethod("search", Comparable[].class, Comparable.class);
        Integer index = (Integer)method.invoke(aClass, data, value);
        long endTime = System.nanoTime();
        double result = (endTime - time) / 1000000000.0;
        System.err.println("\n查找算法："+searchName+"\t数组长度:"+data.length+"\t目标元素:"+value+"\t执行时间："+result+" s" +"\t查找结果： 索引[" +index +"] 元素："+ (index < 0 ? "null" : data[index]));
        print(data,print);
    }
    /**
     * @Description
     * @Author running4light朱泽雄
     * @CreateTime 11:06 2021/5/28
     * @param searchName 算法名称（类名）
     * @param methodName 方法名
     * @param data
     * @param value 目标元素
     * @param print 是否输出数组
     */
    public static <T extends Comparable<T>> void test(String searchName, String methodName, T[] data, T value, boolean print) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        long time = System.nanoTime();
        Class<?> aClass = Class.forName("cn.running4light.demo.template.search."+searchName);
        Method method = aClass.getDeclaredMethod(methodName, Comparable[].class, Comparable.class);
        Integer index = (Integer)method.invoke(aClass, data, value);
        long endTime = System.nanoTime();
        double result = (endTime - time) / 1000000000.0;
        System.err.println("\n查找算法："+searchName+"\t数组长度:"+data.length+"\t目标元素:"+value+"\t执行时间："+result+" s" +"\t查找结果： 索引[" +index +"] 元素："+ (index < 0 ? "null" : data[index]));
        print(data,print);
    }
    /**
     * @Description 打印输出
     * @Author running4light朱泽雄
     * @CreateTime 11:05 2021/5/28
     */
    public static <T extends Comparable<T>> void print(T[] data, boolean print){
        if(print){
            for (T d :
                    data) {
                System.err.print(d + " ");
            }
            System.err.println();
        }
    }
}
