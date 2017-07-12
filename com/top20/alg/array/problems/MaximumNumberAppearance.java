package com.top20.alg.array.problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class MaximumNumberAppearance {

	public static int majorityElement1(int[] in) {
		int cNum = 0, pNum = 0;
		int element = 0;
		for (int i = 0; i < in.length; i++) {
			for (int j = 0; j < in.length; j++) {
				if (in[i] == in[j]) {
					cNum++;
				}
			}
			if (cNum > pNum) {
				element = in[i];
				pNum = cNum;
			}
			cNum = 0;
		}
		return element;
	}

	public static int majorityElement2(int[] in) {
		Arrays.sort(in);
		int i, j = 1;
		int cNum = 1, pNum = 0;
		int element = 0;
		for (i = 0; i < in.length;) {
			while (j < in.length && in[i] == in[j]) {
				cNum++;
				j++;
			}
			if (cNum > pNum) {
				element = in[i];
				pNum = cNum;
			}
			cNum = 1;
			i = j;
		}
		return element;
	}

	public static int majorityElement3(int[] in) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int count = 0;
		for (int i = 0; i < in.length; i++) {
			if (!map.containsKey(in[i])) {
				map.put(in[i], count);
			} else {
				int temp = map.get(in[i]);
				temp++;
				map.put(in[i], temp);
			}
		}
		Set<Integer> set = map.keySet();
		Iterator<Integer> iter = set.iterator();
		int max = 0, value = 0;
		while (iter.hasNext()) {
			int v = iter.next();
			if (map.get(v) > max) {
				max = map.get(v);
				value = v;
			}
		}
		return value;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int size = Integer.parseInt(args[0]);
		int[] in = new int[size];
		for (int i = 0; i < in.length; ++i) {
			in[i] = r.nextInt(10) + 1;
		}
//		for (int a : in) {
//			System.out.print(a + " ");
//		}
		System.out.println();

		long start = System.currentTimeMillis();
		majorityElement2(in);
		long end = System.currentTimeMillis();
		System.out.println((end - start) / 1000.0 + " seconds");
		for (int i = 0; i < in.length; ++i) {
			in[i] = r.nextInt(10) + 1;
		}
		start = System.currentTimeMillis();
		majorityElement3(in);
		end = System.currentTimeMillis();
		System.out.println((end - start) / 1000.0 + " seconds");
	}

}
