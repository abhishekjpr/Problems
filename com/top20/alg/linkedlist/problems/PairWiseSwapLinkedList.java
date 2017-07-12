package com.top20.alg.linkedlist.problems;

import com.top20.alg.implementation.linkedlist.LinkedList;
import com.top20.alg.implementation.linkedlist.ListNode;

public class PairWiseSwapLinkedList{
    public static void pairWiseSwap(ListNode head){
        ListNode temp = head.next;
        while(temp != null && temp.next != null){
            int t = temp.data;
            temp.data = temp.next.data;
            temp.next.data = t;
            temp = temp.next.next;
        }
    }
    public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ListNode node = ll.createList(11);
		ll.display(node);
		pairWiseSwap(node);
		ll.display(node);
	}
}
