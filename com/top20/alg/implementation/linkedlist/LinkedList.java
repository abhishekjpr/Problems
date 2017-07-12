package com.top20.alg.implementation.linkedlist;

import java.util.Random;

public class LinkedList {
	ListNode start;
	ListNode end;
	int size;

	public LinkedList() {
		// TODO Auto-generated constructor stub
		start = new ListNode();
		end = new ListNode();
		size = 0;
	}

	public ListNode createList(int n) {
		Random r = new Random();
		for (int i = 0; i < n; i++) {
			ListNode node = new ListNode();
			node.data = r.nextInt(20) + 1;
			if (start.next == null) {
				start.next = end = node;
				++size;
			} else {
				end.next = node;
				end = end.next;
				++size;
			}
		}
		return start;
	}

	public void add(int data) {
		ListNode node = new ListNode();
		node.data = data;
		node.next = null;
		if (this.start.next == null) {
			start.next = end.next = node;
			end = end.next;
		} else {
			end.next = node;
			end = end.next;
		}
		++size;
	}

	public void add(int index, int data) {
		ListNode iter = start.next;
		ListNode node = new ListNode();
		int count = 0;
		node.data = data;
		if (index > size) {
			System.out.println("Invalid Index");
			return;
		}
		if (index == 0) {
			node.next = start.next;
			start.next = node;
			++size;
			return;
		}
		while (count < (index - 1)) {
			++count;
			iter = iter.next;
		}
		node.next = iter.next;
		iter.next = node;
		++size;
		return;
	}

	public int size() {
		return size;
	}

	public void display(ListNode node) {
		ListNode temp = node.next;
		while (temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		System.out.println("NULL");
	}
}
