package easy;

import java.util.List;

public class removeNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node=head;
        ListNode node1=head;
        ListNode prenode=head;
           int k=0;
           while(k<n)
               node1=node1.next;
           while(node1!=null)
           {
               prenode=node;
               node=node.next;
               node1=node1.next;
           }
            prenode.next=node.next;
           if(prenode!=head)
            return  head;
            return head.next;
    }
}
