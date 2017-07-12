package com.top20.alg.linkedlist.problems;

import java.util.Random;

import com.top20.alg.implementation.linkedlist.LinkedList;
import com.top20.alg.implementation.linkedlist.ListNode;

public class RandomNodeGenerate {

	public static ListNode randomNode1(ListNode head) {
		int size = 0;
		ListNode current;
		for(current = head; current.next != null; current = current.next)
			++size;
		
		Random r = new Random();
		int rindex = r.nextInt(size) + 1;
		current = head.next;
		for(int i = 1; i <= rindex; ++i)
			current = current.next;
		return current;
	}
	
	public static ListNode randomNode2(ListNode head) {
		Random r = new Random();
		ListNode random = head.next;
		for(ListNode current = head.next.next; current != null; current = current.next) {
			if(r.nextInt(2) == 1)
				random = current;
		}
		return random;
	}
	
	public static ListNode randomNode3(ListNode head) {
		Random r = new Random();
		ListNode random = head.next;
		int count = 1;
		for(ListNode current = head.next.next; current != null; current = current.next) {
			++count;
			if(r.nextInt(count) == 0)
				random = current;
		}
		return random;
	}
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		ListNode head = new LinkedList().createList(n);
		new LinkedList().display(head);
		System.out.println(randomNode3(head));
	}

}