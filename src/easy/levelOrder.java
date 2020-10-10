package easy;
/*
* 层序遍历  用到队列最合适
* */
import java.sql.SQLOutput;
import java.util.*;

public class levelOrder {

    List<List<Integer>> result=new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if(root==null)
        return new ArrayList<>();
        else
        {
           queue.add(root);
           while (!queue.isEmpty())
           {
               int count=queue.size();
                List<Integer> lis=new ArrayList<>();
                while(count>0)
                {
                    TreeNode node=queue.poll();
                    lis.add(node.val);
                    if(node.left!=null)
                        queue.add(node.left);
                    if(node.right!=null)
                        queue.add(node.right);

                    System.out.println();    count--;
                }
                result.add(lis);
           }
        }
            return  result;
    }
}
