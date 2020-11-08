package easy;

import java.util.LinkedList;
import java.util.Queue;

/*给你一棵二叉树，请你返回层数最深的叶子节点的和
* 层序遍历的例子*/
public class deepestLeavesSum {
    public int deepestLeavesSum(TreeNode root) {
        int k = 1;
        int sum = 0;
        if (root == null)
            return k;
        Queue<TreeNode> queue = new LinkedList<>();
        Queue<TreeNode> queue1 = new LinkedList<>();
        queue.add(root);
        while (k < treeDepth(root)) {
            int size = queue.size();
            while (size != 0) {
                TreeNode node = queue.peek();
                System.out.println(node.val);
                if (node.left != null)
                    queue1.add(node.left);
                if (node.right != null)
                    queue1.add(node.right);
                queue.poll();
            }
            queue = queue1;
            k++;
        }
        while (!queue.isEmpty()) {
            sum += queue.poll().val;
        }
        return sum;
    }

    static int treeDepth(TreeNode root) {
        if (root != null) {
            int left = treeDepth(root.left);
            int right = treeDepth(root.right);
            return left > right ? left + 1 : right + 1;
        }
        return 0;
    }
}




