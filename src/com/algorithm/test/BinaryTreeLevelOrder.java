package com.algorithm.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Input :
 * 
 * Output : [[1],[2,3],[4,5]]
 * 
 * Queue bfs
 * Stack dfs
 * @author kyj
 *
 */
class TreeNode {
	int val;
	TreeNode left, right;
	TreeNode(int val) {
		this.val = val;
	}
}

public class BinaryTreeLevelOrder {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		solve(root);
	}
	public static void solve(TreeNode root) {
		List<List<Integer>> result = new ArrayList<>();
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		
		while(!queue.isEmpty()) {
			int size = queue.size();
			
			for ( int i = 0; i < size; i++ ) {
				queue.poll();
			}
		}
	}
}
