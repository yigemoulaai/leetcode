package easy;

public class prefect_connect {
    public Node connect(Node root) {
        if(root==null)
            return null;
        search(root);
       return root;

    }

    private void search(Node root) {
        if(root.left==null&&root.right==null)
            return;
        root.left.next=root.right;
        if(root.next!=null) if(root.next.left!=null) root.right.next=root.next.left;
        search(root.left);
        search(root.right);
    }
}
