package easy;

import java.util.ArrayList;
import java.util.List;

public class sumNumbers {
    List<Integer> list=new ArrayList<>();
    public int sumNumbers(TreeNode root) {
            int sum=0;
            if(root==null)
                return sum;
            pathsum(root,0);
            for(int i=0;i<list.size();i++)
                sum+=list.get(i);
            return sum;
    }

    private void  pathsum(TreeNode root, int i) {
        if(root==null)
            return;
        i=i*10+root.val;
        if(root.right==null&&root.left==null)
            list.add(i);
        pathsum(root.left,i);
        pathsum(root.right,i);
        return;
    }
}
