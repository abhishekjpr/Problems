package com.top20.alg.backtracking;

import java.util.Arrays;

public class DisplayAllSeq {

	public static void displayAllSeq(int n, char[] in) {
		char[] out = new char[n];
		auxDisplay(0, n, in, out);
		return;
	}
	
	public static void auxDisplay(int d, int n, char[] in, char[] out) {
		if(d == n){
			System.out.println(Arrays.toString(out));
			return ;
		}
		for(int i = 0; i < in.length; i++) {
			out[d] = in[i];
			auxDisplay(d+1, n, in, out);
		}
	}
	
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		char[] in = args[1].toCharArray();
		//System.out.println(Arrays.toString(in));
		displayAllSeq(n, in);
	}

}

