package easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class levelOrderBottom {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> lists=new ArrayList<>();
        if(root==null)
            return null;
        Queue<TreeNode> queue=new LinkedList<>();
        Queue<TreeNode> queue1=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty())
        {
            List<Integer> list=new ArrayList<>();
            int size=queue.size();
            while(size!=0)
            {
                TreeNode node=queue.peek();
                list.add(node.val);
                if(node.left!=null)
                    queue1.add(node.left);
                if(node.right!=null)
                    queue1.add(node.right);
                queue.poll();
                size--;
            }
            queue=queue1;
            lists.add(0,list);
        }
        return lists;
    }
}
