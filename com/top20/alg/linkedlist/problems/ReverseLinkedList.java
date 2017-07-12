package com.top20.alg.linkedlist.problems;

import java.util.Random;

import com.top20.alg.implementation.linkedlist.LinkedList;
import com.top20.alg.implementation.linkedlist.ListNode;

public class ReverseLinkedList {
	static ListNode prev = null, curr = null, next = null;

	public static ListNode reverse(ListNode node) {
		curr = node.next;
		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		node.next = prev;
		return node;
	}

	public static void swap(ListNode n1, ListNode n2) {
		System.out.println("sd");
		ListNode temp = n1;
		n1 = n2;
		n2 = temp;
		temp = null;
	}

	public static ListNode reverse2(ListNode node) {
		curr = node.next;
		prev = null;
		while (curr != null) {
			swap(curr.next, prev);
			System.out.println(curr.next+"---"+prev);
			swap(curr, prev);
			System.out.println("s"+curr.data);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		node.next = prev;
		return node;
	}

	public static void main(String[] args) {
		Random r = new Random();
		int n = r.nextInt(10) + 1;
		ListNode lHead = new LinkedList().createList(n);
		new LinkedList().display(lHead);
		ListNode nNode = reverse2(lHead);
		new LinkedList().display(nNode);
	}
}
