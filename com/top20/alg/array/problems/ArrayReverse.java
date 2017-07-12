package com.top20.alg.array.problems;

import java.util.Random;

public class ArrayReverse {

	public static void arrayReverse(int[] in){
		for(int i = 0, j = in.length-1; i < j; ++i, --j){
			int temp = in[i];
			in[i] = in[j];
			in[j] = temp;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] in = new int[Integer.parseInt(args[0])];
		Random r = new Random();
		for (int i = 0; i < in.length; i++) {
			in[i] = r.nextInt(5) + 1;
		}
		for (int i = 0; i < in.length; i++) {
			System.out.print(in[i] +" ");
		}
		System.out.println();

		long start = System.currentTimeMillis();
		arrayReverse(in);
		long end = System.currentTimeMillis();
		System.out.println();
		System.out.println((end - start) / 1000.0 + " Seconds");
		for (int i = 0; i < in.length; i++) {
			System.out.print(in[i] +" ");
		}
	}

}
