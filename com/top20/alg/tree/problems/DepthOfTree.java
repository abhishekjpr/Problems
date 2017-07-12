package com.top20.alg.tree.problems;

import java.util.LinkedList;
import java.util.Queue;

public class DepthOfTree {

	public static int depthOfTree1(TreeNode root) {
		if (root == null)
			return 0;
		int lDepth = depthOfTree1(root.left);
		int rDepth = depthOfTree1(root.right);
		return Math.max(lDepth, rDepth) + 1;
	}

	public static int depthOfTree2(TreeNode root) {
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		int nLevels = 0;
		q.add(root);
		q.add(null);
		while (true) {
			TreeNode tmp = q.remove();
			if (tmp == null) {
				++nLevels;
				if (!q.isEmpty()){				
					q.add(null);
				}
				else
					break;
			} else {
				if (tmp.left != null)
					q.add(tmp.left);
				if (tmp.right != null)
					q.add(tmp.right);
			}
		}
		return nLevels;
	}
	
	public static int depthOfTree3(TreeNode root){
		MyInteger maxSum = new MyInteger();
		int sum = 0;
		auxDepthOfTree(root, maxSum, sum);
		return maxSum.getMax();
	}
	
	public static void auxDepthOfTree(TreeNode root, MyInteger maxSum, int sum){
		if(root == null)
			return;
		if(root.left == null && root.right == null){
			maxSum.setMax(Math.max(maxSum.getMax(), sum+1));
			return;
		}
		auxDepthOfTree(root.left, maxSum, sum+1);
		auxDepthOfTree(root.right, maxSum, sum+1);
	}

	final public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		TreeNode root = BinaryTreeUtils.createBinaryTree(n);
		//BinaryTreeUtils.display1(root);
		BinaryTreeUtils.display2(root);
		System.out.println(depthOfTree1(root));
		System.out.println(depthOfTree2(root));
		System.out.println(depthOfTree3(root));
	}

}