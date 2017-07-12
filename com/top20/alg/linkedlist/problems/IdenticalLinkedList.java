package com.top20.alg.linkedlist.problems;

import com.top20.alg.implementation.linkedlist.LinkedList;
import com.top20.alg.implementation.linkedlist.ListNode;

public class IdenticalLinkedList {
	public static ListNode identicalList(ListNode head){
		if(head == null)
			return null;
		ListNode newHead = new ListNode();
		ListNode temp = head.next;
		ListNode temp2 = new ListNode();
		while(temp!=null){
			ListNode node = new ListNode(temp.data);
			if(newHead.next == null)
				newHead.next = temp2.next = node;
			else
				temp2.next = node;
			temp2 = temp2.next;
			temp = temp.next;
		}
		return newHead;
	}
	
	public static void main(String[] args) {
    	LinkedList ll = new LinkedList();
		ListNode node = ll.createList(11);
		ll.display(node);
		ListNode newHead = identicalList(node);
		ll.display(newHead);
	}
}
