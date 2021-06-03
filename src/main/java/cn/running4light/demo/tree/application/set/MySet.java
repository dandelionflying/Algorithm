package cn.running4light.demo.tree.application.set;

/**
 * @author running4light
 * @description
 * @createTime 2021/6/3 13:25
 */
public interface MySet<E> {

    void add(E e);
    void remove(E e);
    boolean contains(E e);
    int getSize();
    boolean isEmpty();
}
