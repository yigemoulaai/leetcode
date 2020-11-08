package easy;

import javax.swing.undo.CannotUndoException;
import java.util.LinkedList;
import java.util.Stack;

public class isPalindromeLinknode {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack=new Stack<>();
        ListNode node=head;
        Integer integer=new Integer(0);
        int k=0;
        while (node!=null)
        {
            node=node.next;
            k++;
        }
        node=head;
        int m=0;
        m=k/2;
        for(int i=0;i<m;i++)
        {
            stack.push(node.val);
            node=node.next;
        }
        if(k%2!=0) node=node.next;
        while(node!=null)
        {
            integer=stack.peek();
            if(integer==node.val)
                stack.pop();
            node=node.next;
        }
        if(stack.empty())
            return true;
        else return false;
    }
}
