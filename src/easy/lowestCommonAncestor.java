package easy;

import com.sun.deploy.util.ArrayUtil;

import java.util.ArrayList;
import java.util.List;

public class lowestCommonAncestor {
    List<List<TreeNode>> lists=new ArrayList<>();
    List<TreeNode> list=new ArrayList<>();
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null)
            return null;

              else   getPath(root,p,q);
              if(lists.size()==1)
              {
                  ArrayList<TreeNode> list1=(ArrayList<TreeNode>) lists.get(0);
                  if(p==list1.get(list1.size()-1))
                  return q;
                  else
                      return p;
              }
            else if(lists.size()==2)
            {
                for(int i=lists.get(0).size();i>0;i--)
                    for(int j=lists.get(1).size();j>0;j--)
                    {
                        System.out.println(lists.get(0).get(i-1).val);
                        if(lists.get(0).get(i-1)==lists.get(1).get(j-1))
                            return lists.get(0).get(i-1);
                    }
            }
            return  null;
        }


    private void getPath(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null)
            return;
        else
            {
            list.add(root);
            if(root==p||root==q)
            {
                lists.add(new ArrayList(list));
                list.remove(list.size()-1);
                return;
            }
            else {
                getPath(root.left,p,q);
                getPath(root.right,p,q);
                list.remove(list.size()-1);
            }

        }

    }
}
