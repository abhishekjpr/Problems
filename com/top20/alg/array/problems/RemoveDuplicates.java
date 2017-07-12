package com.top20.alg.array.problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class RemoveDuplicates {

	public static int[] removeDuplicate1(int[] in) {

		int nDistinct = 0;
		for (int i = 0; i < in.length; i++) {
			if (in[i] != Integer.MIN_VALUE) {
				++nDistinct;
				for (int j = i + 1; j < in.length; j++) {
					if (in[i] == in[j]) {
						in[j] = Integer.MIN_VALUE;
					}
				}
			}
		}
		int k = 0;
		int[] out = new int[nDistinct];
		for (int a : in) {
			if (a != Integer.MIN_VALUE)
				out[k++] = a;
		}
		return out;
	}

	public static int[] removeDuplicate2(int[] in) {
		Arrays.sort(in);
		int nDistinct = 1;
		int i = 0, j;
		for (j = i + 1; j < in.length; j++) {
			if (in[i] == in[j]) {
				in[j] = Integer.MIN_VALUE;
			} else {
				i = j;
				++nDistinct;
			}
		}
		int k = 0;
		int[] out = new int[nDistinct];
		for (int a : in) {
			if (a != Integer.MIN_VALUE)
				out[k++] = a;
		}
		return out;
	}

	public static int[] removeDuplicate3(int[] in) {
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < in.length; i++) {
			if (!set.contains(in[i])) {
				set.add(in[i]);
			}
		}
		int k = 0;
		int[] out = new int[set.size()];
		Iterator<Integer> iter = set.iterator();
		while (iter.hasNext()) {
			out[k++] = (Integer) iter.next();
		}
		return out;
	}

	public static void main(String[] args) {
		int size = Integer.parseInt(args[0]);
		int[] in = new int[size];
		Random r = new Random();
		for (int i = 0; i < in.length; i++) {
			in[i] = r.nextInt(10) + 1;
		}
		System.out.println();
		
		long start = System.currentTimeMillis(); 
		int[] out = removeDuplicate3(in); 
		long end = System.currentTimeMillis();
		System.out.println(); 
		System.out.println((end - start) / 1000.0 +" seconds"+" "+out);
		
		in = new int[size];
		for (int i = 0; i < in.length; i++) {
			in[i] = r.nextInt(10) + 1;
		}
		
		start = System.currentTimeMillis(); 
		out = removeDuplicate2(in); 
		end = System.currentTimeMillis();
		System.out.println(); 
		System.out.println((end - start) / 1000.0 +" seconds"+" "+out);
		
		in = new int[size];
		for (int i = 0; i < in.length; i++) {
			in[i] = r.nextInt(10) + 1;
		}
		
		start = System.currentTimeMillis(); 
		out = removeDuplicate3(in); 
		end = System.currentTimeMillis();
		System.out.println(); 
		System.out.println((end - start) / 1000.0 +" seconds"+" "+out);

	}
}
