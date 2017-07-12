package com.top20.alg.assignments.array;

import java.util.Arrays;

import com.top20.alg.array.problems.ReadData;

public class ProblemOneCountZeroes {

	// n * 2 ~ O(n)
	public static int countZeroes1(int[] in) {
		int cZero = 0;
		for (int i = 0; i < in.length; i++) {
			if (in[i] == 0) // 1
				cZero++; // 1
			else
				break;
		}
		return cZero;
	}

	// ~ O(log n)
	public static int countZeroes2(int[] in) {
		int mid, i = 0, j = in.length - 1;
		mid = (i + j) / 2;
		if (in[0] != 0)
			return -1;
		else {
			// c * log n ~ O(log n)
			while (true) {
				if (in[mid] != 0 && in[mid - 1] == 0)
					return (mid);
				if (in[mid] != 0)
					j = mid - 1;
				if (in[mid] == 0 && in[mid + 1] != 0)
					return ++mid;
				if(in[mid]==0)
					i = mid+1;
				mid = (i + j) / 2;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReadData rData = new ReadData();
		int size = Integer.parseInt(args[0]);
		int[] in = new int[size];
		int range = 2;
		rData.readData(in, size, range);
		Arrays.sort(in);
//		rData.printData(in);
		long start = System.currentTimeMillis();
		countZeroes2(in);
//		System.out.println("\ncount :: " + cZero);
//		if (cZero != -1)
//			System.out.println("\n--->" + cZero);
		long end = System.currentTimeMillis();
		System.out.println("\n" + (end - start) / 1000.0 + " sec");
		
	}

}
