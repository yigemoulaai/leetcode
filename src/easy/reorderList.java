package easy;

public class reorderList {
    public void reorderList(ListNode head) {
        if(head==null) return;
        ListNode prenode=head;
        ListNode nextnode=head;
        ListNode node=head;
        ListNode lastnode=head;
        ListNode node1=head;
        int k=0;
        while(node.next!=null)
        {
            node=node.next;
            k++;
        }
        k++;
        lastnode=node;
        System.out.println(k);
        int n=k;
        k=(k-1)/2;
        for(int i=0;i<k;i++)
        {
            nextnode=nextnode.next;
        }
        if(n%2==0) nextnode=nextnode.next;
        node=nextnode.next;//node现在为新链表的第一个节点
        /*反转链表*/
        node=reverseList(node);
        // System.out.println(node.next.val);
        nextnode.next=null;
        for(int i=0;i<k;i++)
        {
            nextnode=node.next;
            node1=prenode.next;
            prenode.next=node;
            node.next=node1;
            node=nextnode;
            prenode=node1;
        }
        //prenode.next=null;
    }

    private ListNode reverseList(ListNode node) {
        ListNode head=new ListNode(0);
        head.next=node;
        ListNode p = node;
        while(p!= null){
            //保存插入点之后的数据
            ListNode tempList = p.next;
            p.next = head.next;
            head.next = p;
            p = tempList;

        }
        return head.next;
    }
}
