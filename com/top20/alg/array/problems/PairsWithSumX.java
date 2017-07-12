package com.top20.alg.array.problems;

import java.util.Arrays;
import java.util.Random;

public class PairsWithSumX {

	public static void printPairs1(int[] in, int x) {
		for (int i = 0; i < in.length; ++i) {
			for (int j = i + 1; j < in.length; ++j) {
				if (in[i] + in[j] == x) {
					// System.out.println(in[i] + ", " + in[j]);
					in[j] = Integer.MIN_VALUE;
					i++;
				}
			}
		}
	}

	public static void printPairs2(int[] in, int x) {
		Arrays.sort(in);
		int i = 0, j = in.length - 1;
		while (i < j) {
			if (in[i] + in[j] == x) {
				// System.out.println(in[i] + ", " + in[j]);
				++i;
				--j;
			} else if (in[i] + in[j] < x) {
				++i;
			} else {
				--j;
			}
		}
	}

	/*	Still to implement for HashMap Technique
	 * 
	 * public static void printPairs3(int[] in, int x) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < in.length; ++i) {
			int diff = Math.abs(in[i] - x);
			if (!map.containsKey(diff)) {
				map.put(in[i], diff);
			} else {
				System.out.println(in[i] + ", " + diff);
			}
		}
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int size = Integer.parseInt(args[0]);
		int x = r.nextInt(10) + 1;
		int[] in = new int[size];
		for (int i = 0; i < in.length; ++i) {
			in[i] = r.nextInt(10) + 1;
		}
		for (int a : in) {
			System.out.print(a + " ");
		}
		System.out.println();
		System.out.println(x);
		
		long start = System.currentTimeMillis();
		printPairs2(in, x);
		long end = System.currentTimeMillis();
		System.out.println((end - start) / 1000.0 + " seconds");

	}

}
