package swordto_offer;

import easy.ListNode;

/*
* 实现一种算法，找出单向链表中倒数第 k 个节点。返回该节点的值。*/
public class kthToLast {
    public int kthToLast(ListNode head, int k) {
        if(head==null)
            return 0;
        ListNode node1=head;
        ListNode node2=head;
        for(int i=0;i<k;i++)
        {
            node2=node2.next;
        }
        while (node2!=null)
        {
            node1=node1.next;
            node2=node1.next;
        }
            return node1.val;

    }
    public ListNode getKthFromEnd(ListNode head, int k) {
        if(head==null)
            return null;
        ListNode node1=head;
        ListNode node2=head;
        for(int i=0;i<k;i++)
        {
            node2=node2.next;
        }
        while (node2!=null)
        {
            node1=node1.next;
            node2=node2.next;
        }
        return node1;
    }
    }
