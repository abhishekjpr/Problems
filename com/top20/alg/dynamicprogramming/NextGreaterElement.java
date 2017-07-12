package com.top20.alg.dynamicprogramming;

import java.util.Arrays;
import java.util.Random;

public class NextGreaterElement {

	//TC: O(n^2) SC:O(n)
	public static void nextGreater1(int[] in) {
		int j;
		for(int i = 0; i < in.length; i++) {
			boolean flag = false;
			for(j = i+1; j < in.length; ++j) {
				if(in[j] > in[i]) {
					flag = true;
					System.out.println(in[i] + " -> " + in[j]);
					break;
				}
			}
			if(!flag)
				System.out.println(in[i] + " -> " + -1);
		}
	}
	
	public static void nextGreater2(int[] in) {
		
	}
	
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int[] in = new int[n];
		Random r = new Random();
		for (int i = 0; i < in.length; i++) {
			in[i] = r.nextInt(n*20) + 1;
		}
		System.out.println();
		System.out.println(Arrays.toString(in));
		nextGreater1(in);
	}
}
