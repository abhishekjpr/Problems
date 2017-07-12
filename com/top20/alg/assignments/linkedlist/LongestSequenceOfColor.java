package com.top20.alg.assignments.linkedlist;

import com.top20.alg.implementation.linkedlist.LinkedList;
import com.top20.alg.implementation.linkedlist.ListNode;

public class LongestSequenceOfColor{
    public static int longestSequenceOfColor(ListNode head){
        ListNode current = head;
        ListNode temp = current.next;
        int max = 0, pmax = 0;
        while(temp.next!=null && temp!=null){
            if(temp.data == current.data){
                max++;
            }
            else{
                if(max > pmax){
                    pmax = max;
                    max = 1;
                }
                current = temp;
            }
            temp = temp.next;
        }
        if(temp!=null){
            if(current.data == temp.data)
                max++;
            if(max > pmax){                    
                pmax = max;                     
            }    
        }
        return pmax;
    }
    public static void main(String[] args) {
    	LinkedList ll = new LinkedList();
		ListNode node = ll.createList(11);
		ll.display(node);
		longestSequenceOfColor(node);
		ll.display(node);
	}
}
