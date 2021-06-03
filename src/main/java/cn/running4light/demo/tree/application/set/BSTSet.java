package cn.running4light.demo.tree.application.set;

import cn.running4light.demo.tree.BST;

/**
 * @author running4light
 * @description 基于二分搜索树的集合类
 * @createTime 2021/6/3 13:27
 */
public class BSTSet<E extends Comparable<E>> implements MySet<E> {

    private BST<E> bst;
    public BSTSet(){
        bst = new BST<>();
    }

    @Override
    public void add(E e) {
        bst.add(e);
    }

    @Override
    public void remove(E e) {
        bst.remove(e);
    }

    @Override
    public boolean contains(E e) {
        return bst.contains(e);
    }

    @Override
    public int getSize() {
        return bst.size();
    }

    @Override
    public boolean isEmpty() {
        return bst.isEmpty();
    }
}
