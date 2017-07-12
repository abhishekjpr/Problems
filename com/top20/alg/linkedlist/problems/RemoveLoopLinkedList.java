package com.top20.alg.linkedlist.problems;

import com.top20.alg.implementation.linkedlist.LinkedList;
import com.top20.alg.implementation.linkedlist.ListNode;

public class RemoveLoopLinkedList{
    public static void removeLoop(ListNode head){
    	if(head == null || head.next == null || head.next.next == null)
    		return;
        ListNode slowPtr = head.next;
        ListNode fastPtr = head.next.next;
        boolean loop = false;
        while(fastPtr != null){
            if(slowPtr == fastPtr){
                loop = true;
                break;
            }  
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        if(loop){
        	slowPtr = head.next;
        	ListNode temp = fastPtr;
        	while(temp.next!=slowPtr){
        		slowPtr = slowPtr.next;
        		temp = temp.next;
        	}
        	temp.next = null;
        }
        
    }
    public static void main(String[] args) {
    	LinkedList ll = new LinkedList();
		ListNode node = ll.createList(1);
		ll.display(node);
		ListNode current = node.next;
		for(; current.next!=null; current = current.next);
		current.next = node.next.next;
		removeLoop(node);
		System.out.println();
		ll.display(node);
	}
}