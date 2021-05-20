package com.algorithm.test;

/**
 * Input 1 -> 2-> 3 -> null
 * Output 3 -> 2 -> 1 -> null
 * @author kyj
 *
 */
public class ReverseLinkedLists {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(3);
		
		ListNode result = solve(l1);
		
	}
	
	public static ListNode solve(ListNode l1) {
		ListNode curr;
		ListNode prev;
		ListNode next;
		ListNode newHead = new ListNode(0);
			
		
		
		return newHead;
	}
}
