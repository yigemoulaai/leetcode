package easy;

public class rotateRight {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)
            return null;
        ListNode countnode=head;
        ListNode nextnode=head;
        ListNode prenode=head;
        int i=0,length=1;
        while (countnode.next!=null)
        {
            countnode=countnode.next;
            length++;
        }
        k=k%length;
        if(k==0)
            return head;
        while(i<length-k)
        {
            prenode=nextnode;
            nextnode=nextnode.next;
            i++;
        }
        countnode.next=head;
        prenode.next=null;
        return nextnode;
    }
}
