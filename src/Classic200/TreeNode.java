package Classic200;

/**
 * @Author ACER
 * @Date:2022/2/6
 */
public  class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }

      public TreeNode(TreeNode left, TreeNode right) {
            this.left = left;
            this.right = right;
      }

      public TreeNode() {
            System.out.println("base 构造器代码");
      }
      static {
            System.out.println(" base static");
      }
      {
            System.out.println(" base 普通代码块");
      }
}
