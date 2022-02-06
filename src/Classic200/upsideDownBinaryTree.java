package Classic200;

/*
* LeetCode - 156 上下翻转二叉树
* 1、确定翻转后的新二叉树的根节点 head。如果，node 为叶子节点且 head 为空，则 node 成为新的头结点，head = node；
2、node 为 null，return；
3、node 不是叶子节点也不为 null，则先递归把 node 的左右子树翻转好，得到新的左右子节点，然后把新右子节点变为 node 新左子节点的左子节点，node 自己变为新左子节点的右子节点，最后 node 的左右子结点置空，即不再是原来左右子结点的父节点了。
*/
public class upsideDownBinaryTree {
    TreeNode head;
    public  TreeNode upsideDownBinaryTree(TreeNode root) {
        if(root == null){ return null;}
        dfs(root);
        return head;
    }

    private TreeNode dfs(TreeNode node) {
        if (node == null)
            return null;
        if(node.left == null && node.right == null){
            if(head == null){ //最左边的节点为新的根节点
                head =node;
            }
            return node;
        }

        TreeNode left = dfs(node.left);
        TreeNode right = dfs(node.right);
        if(left != null){
            left.right = node;
            left.left = right;
        }
        node.left =null;
        node.right = null;
        return node;
    }
}
