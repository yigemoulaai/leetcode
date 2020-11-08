package easy;
/*
* 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换*/
public class swapPairs {
    public ListNode swapPairs(ListNode head) {
        if(head==null)
            return null;
        if(head.next==null)
            return head;
        ListNode firnode=head;
        ListNode secnode=head.next;
        ListNode prenode=null;
        while(firnode!=null&&secnode!=null)
        {
            ListNode node=new ListNode(0);
            node =firnode;
            if(prenode==null)
            {
            firnode.next=secnode.next;
            secnode.next=firnode;
            head=secnode;
            }
            else {
                firnode.next=secnode.next;
                secnode.next=firnode;
                prenode.next=secnode;
            }
            prenode=firnode;
            firnode=firnode.next;
            secnode=firnode.next.next;
       if(secnode!=null) System.out.println(secnode.val);
        }

            return head;
    }
}
