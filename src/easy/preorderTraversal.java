package easy;

import java.util.ArrayList;
import java.util.List;

public class preorderTraversal {
    List<Integer> list=new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
            if(list.size()==0&&root==null)
            return list;
            if(root==null)
            return  null;
            else
            {
                list.add(root.val);
                preorderTraversal(root.left);
                System.out.println("11");
                preorderTraversal(root.right);
                return list;
            }

    }


}
