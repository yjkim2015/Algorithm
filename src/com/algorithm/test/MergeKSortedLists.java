package com.algorithm.test;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 *  1 -> 4 -> 5
 *  1 -> 3 -> 4
 *  2 -> 6
 *  Output : 1 -> 1 -> 2 -> 3 -> 4 -> 4 -> 5 -> 6
 * @author kyj
 *
 */
public class MergeKSortedLists {
	
	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(5);
		
		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(3);
		l2.next.next = new ListNode(4);
		
		ListNode l3 = new ListNode(2);
		l3.next = new ListNode(6);
		
		ListNode[] listNodes = new ListNode[3];
		listNodes[0] = l1;
		listNodes[1] = l2;
		listNodes[2] = l3;
		
		ListNode result = solve(listNodes);
		while ( result.next != null ) {
			System.out.print(result.next.val + " " );
			result = result.next;
		}
	}
	
	public static ListNode solve(ListNode[] listNodes) {
		
		ListNode newHeader = new ListNode(0);
		ListNode p = newHeader;
		PriorityQueue<ListNode> queue = new PriorityQueue<ListNode>(comp);
		for ( ListNode oneNode : listNodes ) {
			queue.offer(oneNode);
		}
		
		while ( !queue.isEmpty() ) {
			p.next = queue.poll();
			p = p.next;
			if ( p.next != null ) {
				queue.offer(p.next);
			}
			
		}
		
		return newHeader;
	}
	static Comparator<ListNode> comp = new Comparator<ListNode>() {

		@Override
		public int compare(ListNode o1, ListNode o2) {
			return o1.val - o2.val;
		}
	};
}
