package cn.running4light.demo.tree;


import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author running4light
 * @description 二分搜索树
 * @createTime 2021/6/2 11:42
 */
public class BST<E extends Comparable<E>> {
    private class Node {
        public E val;
        public Node left, right;
        public Node(E val){
            this.val = val;
            left = null;
            right = null;
        }
    }

    private Node root;
    private int size;

    public BST(){
        root = null;
        size = 0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    /**
     * @Description 删除指定结点
     * @Author running4light朱泽雄
     * @CreateTime 13:21 2021/6/3
     * @Return
     */
    public void remove(E e){
        root = remove(root, e);
    }
    private Node remove(Node node, E e) {
        if (node == null)
            return null;
        if (e.compareTo(node.val) < 0){
            node.left = remove(node.left, e);
        } else if (e.compareTo(node.val) > 0){
            node.right = remove(node.right, e);
        } else if (e.compareTo(node.val) == 0){
            Node right = node.right;
            Node left = node.left;
            if(right != null && left != null){
                // 找到右子树的最小节点删除后作为新节点返回          也可找左子树的最大node
                Node min = min(right);// 找到右子树最小暂存
                Node afterRemove = removeMin(right);// 移除最小node并返回移除该结点后的右子树
                min.right = afterRemove;// 将暂存结点的右子树指向 新的右子树
                min.left = node.left;// 将暂存结点的左子树指向当前node（即待删除结点） 的左子树，
                node.left = node.right = null;
                return min;
            }
            if(left == null){
                node.right = null;
                size--;// 注意容量大小控制
                return right;
            }
            if(right == null){
                node.left = null;
                size--;
                return left;
            }
        }
        return node;
    }

    /**
     * @Description 删除最小值
     * @Author running4light朱泽雄
     * @CreateTime 17:07 2021/6/2
     * @Return
     */
    public E removeMin(){
        E tmp = min();
        root = removeMin(root);
        return tmp;
    }

    private Node removeMin(Node node) {
        if (node.left == null){
            Node right = node.right;
            node.right = null;
            size--;
            return right;
        }
        node.left = removeMin(node.left);
        return node;
    }
    /**
     * @Description 删除最大值
     * @Author running4light朱泽雄
     * @CreateTime 17:07 2021/6/2
     * @Return
     */
    public E removeMax(){
        E tmp = min();
        root = removeMax(root);
        return tmp;
    }

    private Node removeMax(Node node) {
        if (node.right == null){
            Node left = node.left;
            node.left = null;
            size--;
            return left;
        }
        node.right = removeMax(node.right);
        return node;
    }



    /**
     * @Description 添加新元素
     * @Author running4light朱泽雄
     * @CreateTime 11:54 2021/6/2
     */
    public void add(E e){
        root = add(root, e);
    }
    /**
     * @Description 递归插入元素
     * @Author running4light朱泽雄
     * @CreateTime 11:53 2021/6/2
     */
    private Node add(Node node, E e) {
        if (node == null) {
            size++;
            return new Node(e);
        }
        // 递归寻找插入点
        if (e.compareTo(node.val) < 0) {
            node.left = add(node.left, e);
        } else {
            node.right = add(node.right, e);
        }
        // 返回当前节点，返回上一层递归即为次节点的父节点
        return node;
    }

    /**
     * @Description 搜索元素
     * @Author running4light朱泽雄
     * @CreateTime 14:07 2021/6/2
     * @Return 存在：true;不存在：false
     */
    public boolean contains(E e){
        return search(root, e);
    }
    /**
     * @Description 递归搜索元素
     * @Author running4light朱泽雄
     * @CreateTime 14:08 2021/6/2
     * @Return  存在：true;不存在：false
     */
    private boolean search(Node node, E e) {
        if(e.equals(root.val)){
            return true;
        }
        if (node == null)
            return false;
        if (e.compareTo(node.val) < 0) {
            return search(node.left, e);
        } else {
            return search(node.right, e);
        }
    }
    /**
     * @Description 最小值
     * @Author running4light朱泽雄
     * @CreateTime 16:49 2021/6/2
     * @Return
     */
    public E min(){
        if (size == 0)
            throw new IllegalArgumentException("BST is empty");
        return min(root).val;
    }

    private Node min(Node node) {
        if(node.left == null)
            return node;
        return min(node.left);
    }
    /**
     * @Description 最大值
     * @Author running4light朱泽雄
     * @CreateTime 16:50 2021/6/2
     * @Return
     */
    public E max(){
        if (size == 0)
            throw new IllegalArgumentException("BST is empty");
        return max(root).val;
    }

    private Node max(Node node) {
        if(node.right == null)
            return node;
        return max(node.right);
    }

    /************************** 遍  历 **************************/
    public void pre(){
        pre(root);
    }
    public void mid(){
        mid(root);
    }
    public void post(){
        post(root);
    }
    /**
     * @Description 前序遍历
     * @Author running4light朱泽雄
     * @CreateTime 14:12 2021/6/2
     * @Return
     */
    private void pre(Node node){
        if(node == null){
            return;
        }
        System.err.print(node.val + " ");
        pre(node.left);
        pre(node.right);
    }
    /**
     * @Description 中序遍历
     * @Author running4light朱泽雄
     * @CreateTime 14:13 2021/6/2
     * @Return
     */
    private void mid(Node node){
        if(node == null){
            return;
        }
        mid(node.left);
        System.err.print(node.val);
        mid(node.right);
    }
    /**
     * @Description 后续遍历
     * @Author running4light朱泽雄
     * @CreateTime 14:13 2021/6/2
     * @Return
     */
    private void post(Node node){
        if(node == null){
            return;
        }
        post(node.left);
        post(node.right);
        System.err.print(node.val);
    }

    /**
     * @Description 层序遍历(广度优先遍历)
     * @Author running4light朱泽雄
     * @CreateTime 15:57 2021/6/2
     * @Return
     */
    public String levelTraversal(){
        StringBuilder sb = new StringBuilder();
        Queue<Node> queue = new LinkedList();
        queue.add(root);
        while (!queue.isEmpty()){
            Node cur = queue.remove();
            sb.append(cur.val + " ");
            if(cur.left != null){
                queue.add(cur.left);
            }
            if(cur.right != null){
                queue.add(cur.right);
            }
        }
        return sb.toString();
    }




    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        generateBST(root, 0, sb);
        return sb.toString();
    }

    private void generateBST(Node node, int i, StringBuilder sb) {
        if(node == null){
            sb.append(generalDepthString(i) + "null\n");
            return;
        }
        sb.append(generalDepthString(i) + node.val+"\n");
//        System.err.print(node.val+" ");
        generateBST(node.left, i+ 1, sb);
        generateBST(node.right, i+ 1, sb);
    }

    private String generalDepthString(int index){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < index; i++) {
            sb.append("--");
        }
        return sb.toString();
    }
}
