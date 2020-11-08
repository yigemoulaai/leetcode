package easy;

public class reverseList {
    public ListNode reverseList(ListNode head) {
        if(head==null) return null;

        ListNode newhead=new ListNode(0);
        ListNode node=head;
        ListNode prenode=head;

        while(node!=null)
        {
            prenode=node.next;
            node.next=newhead.next;
            newhead.next=node;
            node=prenode;
        }

        return newhead.next;
    }
}
