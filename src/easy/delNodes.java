package easy;

import java.util.ArrayList;
import java.util.List;
import java.util.TooManyListenersException;

public class delNodes {
    List<TreeNode> list=new ArrayList<>();
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        int flag=0;

        del(root,root,to_delete,0);
        for(int i=0;i<to_delete.length&&flag==0;i++)
        {
            if(to_delete[i]== root.val)
            {
                flag=1;
            }

        }if(flag==0 )list.add(root);
        return  list;
    }

    private void del(TreeNode preroot,TreeNode root, int[] to_delete,int n) {
        if(root==null)
            return ;
        del(root,root.left,to_delete,0);
        del(root,root.right,to_delete,1);
        for(int i=0;i<to_delete.length;i++)
        {
            if(to_delete[i]== root.val)
            {
                if (root.left!=null) list.add(root.left);
                if (root.right!=null)list.add(root.right);
                if(n==0) preroot.left=null;
                if(n==1) preroot.right=null;
                //return;
            }
        }

    }
}
