package com.top20.alg.linkedlist.problems;

import java.util.*;

import com.top20.alg.implementation.linkedlist.LinkedList;
import com.top20.alg.implementation.linkedlist.ListNode;

public class LoopDetection {

	public static boolean detectLoop1(ListNode node) {
		ListNode prev = null;
		ListNode curr = node;
		ListNode nextNode = curr.next;
		while (nextNode != null && nextNode != node) {
			nextNode = curr.next;
			curr.next = prev;
			prev = curr;
			curr = nextNode;
		}
		if (nextNode == node)
			return true;
		return false;
	}

	public static boolean detectLoop2(ListNode node) {
		ListNode start = node;
		HashSet<ListNode> set = new HashSet<>();
		while (start != null) {
			if (!set.contains(start)) {
				set.add(start);
			} else {
				return true;
			}
			start = start.next;
		}
		return false;
	}

	public static boolean detectLoop3(ListNode node) {
		ListNode tortoise = node, rabbit = node;
		do {
			tortoise = tortoise.next;
			if (rabbit == null || rabbit.next == null)
				return false;
			rabbit = rabbit.next.next;
		} while (tortoise != rabbit);
		return false;
	}
	
	public static void main(String[] args) {
		int n = 10;//r.nextInt(15) + 1;
		LinkedList ll = new LinkedList();
		ListNode lHead = ll.createList(n);
		ll.display(lHead);
		System.out.println(LoopDetection.detectLoop2(lHead));
	}
}
