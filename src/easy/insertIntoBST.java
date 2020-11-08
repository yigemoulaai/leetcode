package easy;
/*给定二叉搜索树（BST）的根节点和要插入树中的值，将值插入二叉搜索树。
返回插入后二叉搜索树的根节点。 输入数据 保证 ，新值和原始二叉搜索树中的任意节点值都不同。
*/
public class insertIntoBST {
    public TreeNode insertIntoBST(TreeNode root, int val){
        if(root==null)
        {
            TreeNode treeNode=new TreeNode(val);
            return treeNode;
        }
        else
            search(root,val);
        return root;

    }

    private void search(TreeNode root, int val) {
        if(root==null)
            return;
        if(root.val>val)
        {
            if(root.left!=null)
            {
                search(root.right,val);
            }
            else if(root.left==null)
                root.left=new TreeNode(val);
                 }
        else if(root.val<val)
        {
            if(root.right!=null)
            {
                search(root.right,val);
            }
            else
            {
                root.right=new TreeNode(val);
            }
        }
    }
}
