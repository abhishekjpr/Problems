package com.top20.alg.linkedlist.problems;

import com.top20.alg.implementation.linkedlist.LinkedList;
import com.top20.alg.implementation.linkedlist.ListNode;

public class AlternatingSplitLinkedList{
    public static void alternatingSplitLinkedList(ListNode head){
        if(head.next == null)
            return;
        ListNode head1 = new ListNode();
        head1.next = head.next;
        ListNode head2 = new ListNode();
        head2.next = head.next.next;
        ListNode temp1 = head1.next;
        ListNode temp2 = head2.next;
        while(temp1!=null && temp2!=null){
            if(temp2!=null){
                temp1.next = temp2.next;
                temp1 = temp1.next;
            }
            if(temp1!=null){
                temp2.next = temp1.next;
                temp2 = temp2.next;
            }
        }
        new LinkedList().display(head1);
        new LinkedList().display(head2);
    }
    public static void main(String[] args) {
    	LinkedList ll = new LinkedList();
		ListNode node = ll.createList(5);
		ll.display(node);
		alternatingSplitLinkedList(node);
	}
}
