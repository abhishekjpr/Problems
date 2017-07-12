package com.top20.alg.backtracking;

import java.util.Arrays;

public class Permutation {
	
	
	//Backtracking solution 1: O(n * (? + n!) )  SC:O(n)
	public static void displayAllSeq2(char[] in) {
		char[] out = new char[in.length];
		auxDisplay2(0, in, out);
		return;
	}

	public static void auxDisplay2(int d, char[] in, char[] out) {
		if (d == out.length) {
			System.out.println(Arrays.toString(out));
			return;
		}
		for (int i = 0; i < in.length; i++) {
			if (!isAvail2(in[i], out, d)) {
				out[d] = in[i];
				auxDisplay2(d + 1, in, out);
			}
		}
	}
	
	public static boolean isAvail2(char ch, char[] out, int d) {
		for(int i = 0; i < d; i++){
			if(ch == out[i])
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		char[] in = args[0].toCharArray();
		// System.out.println(Arrays.toString(in));
		displayAllSeq2(in);
	}

}
