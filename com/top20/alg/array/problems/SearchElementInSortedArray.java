package com.top20.alg.array.problems;

import java.util.Arrays;
import java.util.Random;

public class SearchElementInSortedArray {

	public static boolean findElement(int[] in, int key){
		if(Arrays.binarySearch(in, key)>=0)
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = Integer.parseInt(args[0]);
		Random r = new Random();
		int x = r.nextInt(10)+1;
		int[] in = new int[size];
		for (int i = 0; i < in.length; i++) {
			in[i] = r.nextInt(10)+1;
		}
		System.out.println();
		long start = System.currentTimeMillis();
		findElement(in, x);
		long end = System.currentTimeMillis();
		System.out.println("\n" + (end - start) / 100000.0 + " seconds");
	}

}
