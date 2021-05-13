package cn.running4light.demo.finished;


import java.util.Arrays;

/**
 * 重建二叉树
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 * eg:
 * in:[1,2,3,4,5,6,7],[3,2,4,1,6,5,7]
 * out:{1,2,5,3,4,6,7}
 */

public class JZ4 {

    /**
     *  @Description    构建二叉树
     *  @Author running4light朱泽雄
     *  @CreateTime 15:30 2021/4/30
     *  @param pre  前序遍历
     *  @param in   中序遍历
     */
    public TreeNode buildTree(int [] pre, int [] in) {
        if(pre.length == 0){
            return null;
        }
        int rootVal = pre[0];
        if(pre.length == 1){
            return new TreeNode(rootVal);
        }
        //先找到root所在的位置，确定好前序和中序中左子树和右子树序列的范围
        TreeNode root = new TreeNode(rootVal);
        int rootIndex = search(rootVal, in);
        //递归，假设root的左右子树都已经构建完毕，那么只要将左右子树安到root左右即可
        //Arrays.copyOfRange(int[],start,end)是左闭又开区间
        root.left = buildTree(Arrays.copyOfRange(pre,1,rootIndex+1),Arrays.copyOfRange(in,0,rootIndex));
        root.right = buildTree(Arrays.copyOfRange(pre,rootIndex+1,pre.length),Arrays.copyOfRange(in,rootIndex+1,in.length));

        return root;
    }

    public int search(int val,int[] in){
        for(int i = 0; i < in.length; i++){
            if(in[i] == val)
                return i;
        }
        return 0;
    }

    /**
     *  @Description
     *  @Author running4light朱泽雄
     *  @CreateTime 15:33 2021/5/13
     */
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

