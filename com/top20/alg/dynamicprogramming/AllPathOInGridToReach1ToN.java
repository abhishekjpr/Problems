package com.top20.alg.dynamicprogramming;

import com.top20.alg.tree.problems.MyInteger;

public class AllPathOInGridToReach1ToN {

	// TC: O(2 ^ 2N) SC: O(2n)
	public static int allPaths1(int n) {
		MyInteger i = new MyInteger();
		i.setMax(0);
		auxAllPath1(0, 0, n, i);
		return i.getMax();
	}

	public static void auxAllPath1(int i, int j, int n, MyInteger count) {
		if (i >= n)
			return;
		if (j >= n)
			return;
		if (i == n - 1 && j == n - 1) {
			count.setMax(count.getMax() + 1);
		}
		auxAllPath1(i + 1, j, n, count);
		auxAllPath1(i, j + 1, n, count);
	}

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		// System.out.println(allPaths1(n));
		System.out.println(allPaths1(n));
	}

}
