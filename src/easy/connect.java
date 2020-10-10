package easy;


public class connect {

    public LinkedNode connect(LinkedNode root) {
        if (root == null)
            return null;
        else {
            if(root.left!=null)
            {
                if(root.right!=null)
                    root.left.next=root.right;
                else
                    root.left.next=find(root.next);
            }
            else if(root.right!=null)
                root.right.next=find(root.next);
            connect(root.right);
            connect(root.left);
        }
        return root;
    }
        private LinkedNode find(LinkedNode root){
                while (root!=null)
                {
                    if(root.left!=null)
                        return root.left;
                    if(root.right!=null)
                        return root.right;
                    root=root.next;
                }

                return null;
        }
    }

