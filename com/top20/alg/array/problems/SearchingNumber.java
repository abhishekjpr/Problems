package com.top20.alg.array.problems;

import java.util.Random;

public class SearchingNumber {
	public static boolean findNumber1(int[] in, int x) {
		for (int i = 0; i < in.length; i++) {
			if (in[i] == x) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int size = Integer.parseInt(args[0]);
		Random r = new Random();
		int x = r.nextInt(10)+1;
		int[] in = new int[size];
		for (int i = 0; i < in.length; i++) {
			in[i] = r.nextInt(10)+1;
		}
		System.out.println();
//		for (int a : in) {
//			System.out.print(a + " ");
//		}
//		System.out.print("\n" + x + " ");
		long start = System.currentTimeMillis();
		if (findNumber1(in, x)) {
			System.out.println("true");
		}
		long end = System.currentTimeMillis();
		System.out.println("\n" + (end - start) / 100000.0 + " seconds");
	}
}
