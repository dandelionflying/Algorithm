package cn.running4light.demo.utils;

import cn.running4light.demo.template.sort.InsertionSorting;
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
        if("InsertionSorting".equals(sortName)){
            InsertionSorting.sort(data, sort);
        }

        long endTime = System.nanoTime();
        /*for (T d :
                data) {
            System.err.print(d+" ");
        }*/
        double result = (endTime - time) / 1000000000.0;
        boolean check = SortingUtil.checkSorted(data, sort);
        System.err.print("\n排序算法："+sortName+"\t数组长度:"+data.length+"\t执行时间："+result+" s" +"\t是否排序成功：" +check);
    }
    /**
     * @Description 排序校验
     * @Author running4light朱泽雄
     * @CreateTime 17:28 2021/5/17
     */
    public static <T extends Comparable<T>> boolean checkSorted(T[] data, String sort){
        if("asc".equals(sort)){
            return checkAsc(data);
        }else{
            return checkDesc(data);
        }
    }
    /**
     * @Description 递减判断
     * @Author running4light朱泽雄
     * @CreateTime 17:27 2021/5/17
     */
    public static <T extends Comparable<T>> boolean checkDesc(T[] data){
        for (int i = 1; i < data.length; i++) {
            // 若非递减
            if(data[i - 1].compareTo(data[i]) < 0)
                return false;
        }
        return true;
    }
    /**
     * @Description 递增判断
     * @Author running4light朱泽雄
     * @CreateTime 17:27 2021/5/17
     */
    public static <T extends Comparable<T>> boolean checkAsc(T[] data){
        for (int i = 1; i < data.length; i++) {
            // 若非递增
            if(data[i - 1].compareTo(data[i]) > 0)
                return false;
        }
        return true;
    }

    public static <T> void swap(T[] data, int index, int index2){
        T tmp = data[index];
        data[index] = data[index2];
        data[index2] = tmp;
    }
}
