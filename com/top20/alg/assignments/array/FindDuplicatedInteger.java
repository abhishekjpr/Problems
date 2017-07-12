package com.top20.alg.assignments.array;

import java.util.Arrays;
import java.util.HashSet;

import com.top20.alg.array.problems.ReadData;

public class FindDuplicatedInteger {

	// (n-1) + (n-2) + (n-3) + ..... + 1
	// n(n-1)/2
	// (n^2/2 - n/2) ~ O(n^2)
	public static int findDuplicate1(int[] in) {
		for (int i = 0; i < in.length; i++) {
			for (int j = i + 1; j < in.length; j++) {
				if (in[i] == in[j])
					return in[i];
			}
		}
		return -1;
	}
	
	// n log n + (n) ~ O(n log n) 
	public static int findDuplicate2(int[] in) {
		Arrays.sort(in);
		for (int i = 0; i < in.length - 1; i++) {
			if (in[i] == in[i + 1])
				return in[i];
		}
		return -1;
	}
	
	// n + O(1) ~ O(n)
	public static int findDuplicate3(int[] in){
		HashSet<Integer> hset = new HashSet<Integer>();
		for(int i = 0; i < in.length; i++){
			if(!hset.contains(in[i]))
				hset.add(in[i]);
			else
				return in[i];
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReadData rData = new ReadData();
		int size = Integer.parseInt(args[0]);
		int[] in = new int[size];
		int range = Integer.MAX_VALUE;
		rData.readData(in, size, range);
		//rData.printData(in);
		long start = System.currentTimeMillis();
		findDuplicate3(in);
		//System.out.println("\n" + num);
		long end = System.currentTimeMillis();
		System.out.println("\n" + (end - start) / 1000.0 + " sec");
	}

}
