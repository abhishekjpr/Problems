package com.top20.alg.assignments.linkedlist;

import java.util.Random;

public class SplitAndCombine {
	
	// c + (n/2) ~ O(n)
	public static ListNode splitAndCombine(ListNode head){
		ListNode slow = head;
		ListNode fast = head.next;
		if(head.next == null)
			return head;
		while(fast.next != null){
			fast = fast.next;
			slow = slow.next;
			if(fast.next == null)
				break;
			fast = fast.next;
		}
		fast.next = head;
		head = slow.next;
		slow.next = null;
		return head;
	}
	
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ListNode head = null;
		int n = new Random().nextInt(10)+1;
		head = ll.createList(n);
		ll.display(head);
		ListNode newListNode = 	splitAndCombine(head);
		ll.display(newListNode);
	}
}
