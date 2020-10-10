package easy;


import java.util.Arrays;

public class buildTree {
    public TreeNode buildTree1(int[] inorder, int[] postorder) {
        if(inorder.length==0||postorder.length==0) return null;
        else if(inorder.length==1)
            return new TreeNode(inorder[0]);
        else
        {
            TreeNode tnode=new TreeNode(postorder[postorder.length-1]);
            int index=getIndex(inorder,postorder[postorder.length-1]);
            System.out.println("11"+Arrays.copyOfRange(inorder,0,index).length);
            tnode.left=buildTree1(Arrays.copyOfRange(inorder,0,index),Arrays.copyOfRange(postorder,0,index));
            tnode.right=buildTree1(Arrays.copyOfRange(inorder,index+1,inorder.length),Arrays.copyOfRange(postorder,index+1,postorder.length));
            return  tnode;
        }

    }
    public TreeNode buildTree2(int[] preorder, int[] inorder) {
        if(preorder.length==0||inorder.length==0)
        return null;
        else if(preorder.length==1)
            return new TreeNode(preorder[0]);
        else {
            TreeNode treeNode=new TreeNode(preorder[0]);
            int index=getIndex(inorder,preorder[0]);
            treeNode.left=buildTree2(Arrays.copyOfRange(preorder,1,index+1),Arrays.copyOfRange(inorder,0,index));
            treeNode.right=buildTree2(Arrays.copyOfRange(preorder,index+1,preorder.length),Arrays.copyOfRange(inorder,index+1,inorder.length));
            return treeNode;
        }


    }

    private int getIndex(int[] inorder, int val) {
        for(int i=0;i<=inorder.length-1;i++)
        {
            if(inorder[i]==val)
            {
                return  i;
            }
        }
        return -1;
    }


}
