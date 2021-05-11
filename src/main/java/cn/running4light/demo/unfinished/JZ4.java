package cn.running4light.demo.unfinished;


import cn.running4light.demo.finished.TreeNode;

/**
 * 重建二叉树
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 * eg:
 * in:[1,2,3,4,5,6,7],[3,2,4,1,6,5,7]
 * out:{1,2,5,3,4,6,7}
 */

public class JZ4 {

    public TreeNode reConstructBinaryTree(int [] pre, int [] in) {
        int length = pre.length;
        if(length > 0){
            return null;
        }
        TreeNode node = new TreeNode(pre[0]);
        for (int i = 1; i < length; i++){
            System.err.print("先根遍历："+pre[i]);
            int pred = pre[i];


        }
        return null;
    }

    public int search(int val,int[] in, int index){
        for(int i = 0; i < index; i++){
            if(in[i] == val)
                return i;
        }
        return 0;
    }
    /**
     *  @Description
     *  @Author running4light朱泽雄
     *  @CreateTime 15:30 2021/4/30
     *  @param pre  前序遍历
     *  @param in   中序遍历
     *  @param indexPre 前序索引
     *  @param indexIn  中序索引
     *  @param rootIndex  子树根节点索引
     */
    public TreeNode buildTree(int[] pre, int[] in, int indexPre, int indexIn, int rootIndex) {
        if (rootIndex <= 0) {
            return null;
        }
        int search = search(pre[indexPre], in, rootIndex);
        System.err.println(search + "\t" + in[indexIn]);
        TreeNode node = new TreeNode(pre[indexPre]);
        node.left = buildTree(pre, in, indexPre + 1, indexIn, search);
        node.right = buildTree(pre, in, indexPre + search + 1, indexIn + search + 1, rootIndex - search - 1);
        return node;
    }

    public void pre(TreeNode node){
        if(node == null){
            return;
        }
        System.err.print(node.val);
        pre(node.left);
        pre(node.right);
    }

    public void mid(TreeNode node){
        if(node == null){
            return;
        }
        mid(node.left);
        System.err.print(node.val);
        mid(node.right);
    }

    public void post(TreeNode node){
        if(node == null){
            return;
        }
        post(node.left);
        post(node.right);
        System.err.print(node.val);
    }

}

