package com.top20.alg.tree.problems;

import java.util.LinkedList;
import java.util.Queue;

public class CountFullNodesOfBTree {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(args[0]);
		TreeNode root = BinaryTreeUtils.createBinaryTree(n);
		BinaryTreeUtils.display2(root);
		System.out.println(fullNodes(root));
	}
	
	//using level order traversal TC: O(n)	SC: O(n)
	public static int fullNodes(TreeNode root) {
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		int count = 0;
		q.add(root);
		TreeNode temp = null;
		while (!q.isEmpty()) {
			temp = q.remove();
			if(temp.left != null && temp.right != null)
				count++;
			if (temp.left != null)
				q.add(temp.left);
			if (temp.right != null)
				q.add(temp.right);
		}
		return count;
	}
}
