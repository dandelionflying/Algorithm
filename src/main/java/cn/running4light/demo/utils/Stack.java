package cn.running4light.demo.utils;

/**
 * @author running4light
 * @description
 * @createTime 2021/5/18 16:02
 */
public interface Stack<E> {
    int getSize();
    boolean isEmpty();
    void push(E e);
    E pop();
    E peek();
}
