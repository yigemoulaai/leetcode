package easy;

public class detectCycle {
    public ListNode detectCycle(ListNode head) {
        int k=0;
        boolean flag=false;
        ListNode fastnode=head;
        ListNode slownode=head;
        if(head==null)
            return null;
        else
        {
            while(fastnode.next!=null&&fastnode.next.next!=null)
            {
                if(fastnode==slownode&&k!=0)
                {
                    //System.out.println(fastnode.val+" "+slownode.val);
                    flag=true;
                    break;
                }
                else
                {
                    fastnode=fastnode.next.next;
                    slownode=slownode.next;
                }
                k++;
            }
            fastnode=head; //slownode走过了a+b（入环的距离和在环中已走的距离）  fastnode走过了两倍距离2(a+b)
            if(flag)
            {

                while(fastnode!=slownode)
                {//System.out.println(fastnode.val+" "+slownode.val);
                    slownode=slownode.next;
                    fastnode=fastnode.next;
                }
                return fastnode;
            }
        }
        return null;
    }
}
