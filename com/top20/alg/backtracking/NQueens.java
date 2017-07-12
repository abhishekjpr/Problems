package com.top20.alg.backtracking;

import java.util.Arrays;

public class NQueens {

	// TC:O(n ^ (n+2)) SC:O(n)
	public static void validPositions1(int n) {
		int[] out = new int[n];
		auxValidPosition1(0, n, out);
	}

	public static void auxValidPosition1(int d, int n, int[] out) {
		if (d == n) {
			if (isValidPosition1(out))
				System.out.println(Arrays.toString(out));
			return;
		}
		for (int i = 0; i < n; i++) {
			out[d] = i;
			auxValidPosition1(d + 1, n, out);
		}
	}

	private static boolean isValidPosition1(int[] out) {
		for (int i = 0; i < out.length; ++i) {
			for (int j = i + 1; j < out.length; ++j) {
				if (out[i] == out[j] || (Math.abs(i - j) == Math.abs(out[i] - out[j])))
					return false;
			}
		}
		return true;
	}

	//TC:O(?)  SC:O(n)
	public static void validPositions2(int n) {
		int[] out = new int[n];
		auxValidPosition2(0, n, out);
	}

	public static void auxValidPosition2(int d, int n, int[] out) {
		if (d == n) {
			System.out.println(Arrays.toString(out));
			return;
		}
		for (int i = 0; i < n; i++) {
			if (isValid2(d, i, out)) {
				out[d] = i;
				auxValidPosition2(d + 1, n, out);
			}
		}
	}
	
	private static boolean isValid2(int d, int c, int[] pos) {
		//add more heuristics to eliminate more branches
		//derive heuristics with experience of solving problem
		for(int q = 0; q < d; ++q) {
				if(pos[q] == c || (Math.abs(q-d) == Math.abs(pos[q]-c)))
					return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(args[0]);
		validPositions2(n);
	}

}
