package easy;

import java.util.ArrayList;
import java.util.List;

public class pathSum {
        List<List<Integer>> lists=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {

            if(root==null)
                return lists;
            else
            {
                pathGet(sum,root);
            }
            return lists;
    }

    private void pathGet(int sum, TreeNode root) {
        if(root==null)
            return;
        list.add(root.val);
        if(root.left==null&&root.right==null)
        {
            if(sum==root.val) {
                lists.add(new ArrayList<>(list));
                list.remove(list.size()-1);//回溯是关键
                return;
            }
        }
        else {
            pathGet(sum - root.val, root.left);
            pathGet(sum - root.val, root.right);

        } list.remove(list.size()-1);//回溯是关键


}

}
