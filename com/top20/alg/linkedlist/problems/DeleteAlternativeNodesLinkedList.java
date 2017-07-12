package com.top20.alg.linkedlist.problems;

import com.top20.alg.implementation.linkedlist.LinkedList;
import com.top20.alg.implementation.linkedlist.ListNode;

public class DeleteAlternativeNodesLinkedList {
	public static void deleteAlternativeNodesLinkedList(ListNode head){
        ListNode current = head.next;
        while(current != null && current.next != null){
            ListNode temp = current.next;
            current.next = temp.next;
            temp.next = null;
            current = current.next;
        }
	}
	public static void main(String[] args) {
    	LinkedList ll = new LinkedList();
		ListNode node = ll.createList(11);
		ll.display(node);
		deleteAlternativeNodesLinkedList(node);
		ll.display(node);
	}
}
