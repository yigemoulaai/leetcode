package easy;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class preorderTraversal {
    List<Integer> list=new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        //递归做法  时间相对较快但是可以训练迭代进阶
          /*  if(list.size()==0&&root==null)
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
            }*/
          //迭代做法  借助到了stack结构
         if(root==null)
            return list;
        TreeNode node=root;
        Deque<TreeNode> stack=new LinkedList<>();
        list.add(node.val);
        stack.push(node);
        node=node.left;
        while(!stack.isEmpty()||node!=null)
        {
            if(node!=null)
            {
                list.add(node.val);
                stack.push(node);
                node=node.left;
            }
            else{
                node=stack.pop();
                node=node.right;
            }
        }
        return  list;
    }


}
