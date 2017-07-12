package com.top20.alg.tree.problems;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class BinaryTreeUtils {
	public static TreeNode createBinaryTree(int n) {
		TreeNode root = null;
		Random r = new Random();
		for (int i = 0; i < n; i++) {
			Integer data = r.nextInt(n) + 1;
			root = add(root, data);
		}
		return root;
	}

	private static TreeNode add(TreeNode root, Integer data) {
		if (root == null)
			return new TreeNode(data);
		TreeNode current = root;
		while (current != null) {
			if (Math.random() < 0.5) {
				if (current.left == null) {
					current.left = new TreeNode(data);
					break;
				}
				current = current.left;
			} else {
				if (current.right == null) {
					current.right = new TreeNode(data);
					break;
				}
				current = current.right;
			}
		}
		return root;
	}

	public static void display1(TreeNode root) {
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		q.add(null);
		TreeNode dummy = new TreeNode(-1);
		while (true) {
			TreeNode tmp = q.remove();
			if (tmp == null) {
				System.out.println();
				if (q.isEmpty())
					break;
				else
					q.add(null);
			} else {
				System.out.print(tmp.data + " ");
				if (tmp == dummy)
					continue;
				if (tmp.left != null)
					q.add(tmp.left);
				else
					q.add(dummy);
				if (tmp.right != null)
					q.add(tmp.right);
				else
					q.add(dummy);
			}
		}
	}
	
	public static void display2(TreeNode root){
		auxDisplay(root, 0);
	}

	private static void auxDisplay(TreeNode root, int nSpaces) {
		if(root == null)
			return;
		for(int i = 0; i < nSpaces; ++i)
			System.out.print(' ');
		System.out.println(root.data);
		auxDisplay(root.left, nSpaces+2);
		auxDisplay(root.right, nSpaces+2);
	}
}
