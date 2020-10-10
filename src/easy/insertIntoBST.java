package easy;

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
