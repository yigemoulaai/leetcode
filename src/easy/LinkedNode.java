package easy;

public class LinkedNode {
    public int val;
    public LinkedNode left;
    public LinkedNode right;
    public LinkedNode next;

    public LinkedNode() {}

    public LinkedNode(int _val) {
        val = _val;
    }
    public LinkedNode(int _val, LinkedNode _left, LinkedNode _right, LinkedNode _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public LinkedNode getLeft() {
        return left;
    }

    public void setLeft(LinkedNode left) {
        this.left = left;
    }

    public LinkedNode getRight() {
        return right;
    }

    public void setRight(LinkedNode right) {
        this.right = right;
    }

    public LinkedNode getNext() {
        return next;
    }

    public void setNext(LinkedNode next) {
        this.next = next;
    }
}
