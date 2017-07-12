package com.top20.alg.lrucache;

class DListNode {
	DListNode prev;
	String key;
	Integer value;
	DListNode next;

	public DListNode() {
		prev = next = this;
	}

	public DListNode(String key, Integer value) {
		this.key = key;
		this.value = value;
		prev = next = this;
	}
}