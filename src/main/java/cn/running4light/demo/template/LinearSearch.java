package cn.running4light.demo.template;

/**
 * @author running4light
 * @description 线性查找
 * @createTime 2021/5/17 9:35
 */
public class LinearSearch {

    /**
     * @Description    使用泛型定义
     * @Author running4light朱泽雄
     * @CreateTime 9:38 2021/5/17
     * @param data 数据类型为泛型，当类型为自定义的类时，应在自定义的类中重写equal方法！
     * @param target
     */
    public static <E> int search(E[] data, E target){
        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(target))
                return i;
        }
        return -1;
    }
}
