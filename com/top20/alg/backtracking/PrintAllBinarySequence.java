package com.top20.alg.backtracking;

import java.util.Arrays;

public class PrintAllBinarySequence {
	
	public static void printBinarySequence(int n) {
		int out[] = new int[n];
		auxPrint(0, n, out);
	}
	
	public static void auxPrint(int d, int n, int[] out) {
		if(d == n) {
			System.out.println(Arrays.toString(out));
			return;
		}
		for(int i = 0; i < 2; i++) {
			out[d] = i;
			auxPrint(d+1, n, out);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(args[0]); 
		printBinarySequence(n); 

	}

}
