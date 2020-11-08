package easy;

import java.util.ArrayList;
import java.util.List;
import java.util.TooManyListenersException;
/*给出二叉树的根节点 root，树上每个节点都有一个不同的值。
如果节点值在 to_delete 中出现，我们就把该节点从树上删去，最后得到一个森林（一些不相交的树构成的集合）。
返回森林中的每棵树。你可以按任意顺序组织答案
*/
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
