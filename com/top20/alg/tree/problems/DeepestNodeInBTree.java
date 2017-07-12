package com.top20.alg.tree.problems;

import java.util.LinkedList;
import java.util.Queue;

public class DeepestNodeInBTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(args[0]);
		TreeNode root = BinaryTreeUtils.createBinaryTree(n);
		BinaryTreeUtils.display2(root);
		System.out.println(deepestNode1(root));
	}
	
	//using level order traversal TC: O(n)	SC: O(n)
	public static int deepestNode1(TreeNode root) {
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		TreeNode temp = null;
		while (!q.isEmpty()) {
			temp = q.remove();
			if (temp.left != null)
				q.add(temp.left);
			if (temp.right != null)
				q.add(temp.right);
		}
		return temp.data;
	}
}
