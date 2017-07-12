package com.top20.alg.array.problems;

import java.util.Arrays;

public class NoOfOccurencesInSortedArray {

	public static int noOfOccurences1(int[] in, int x) {
		int count = 0;
		for (int i = 0; i < in.length; i++) {
			if(in[i]==x)
				++count;
			if(in[i]>x)
				break;
		}
		return count;
	}
	
	// Log n + Log n = 2 Log n ~ O(log n)

	public static int noOfOccurences2(int[] in, int x) {
		int start = 0, end = 0;
		if (in == null)
			return -1;
		int i = 0, j = in.length - 1;
		int mid = (i + j) / 2;

		// find first occurence of x
		while (true) {
			if (mid != 0) {
				if (in[mid] == x && in[mid - 1] != x) {
					start = mid;
					break;
				}
				if (in[mid] == x && in[mid - 1] == x)
					j = mid;
				else if (in[mid] < x)
					i = mid + 1;
				else if (in[mid] > x)
					j = mid - 1;
				mid = ((i + j) / 2);
			} else {
				start = 0;
				break;
			}
		}
		i = 0; 
		j = in.length - 1;
		mid = (i + j) / 2;
		while (true) {
			if (mid != in.length-1) {
				if (in[mid] == x && in[mid + 1] != x) {
					end = mid;
					break;
				}
				if (in[mid] == x && in[mid + 1] == x)
					i = mid+1;
				else if (in[mid] < x)
					i = mid + 1;
				else if (in[mid] > x)
					j = mid;
				mid = ((i + j) / 2);
			} else {
				end = in.length-1;
				break;
			}
		}
		return ((end-start+1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = Integer.parseInt(args[0]);
		int[] in = new int[size];
		int range = 5;
		ReadData rData = new ReadData();
		rData.readData(in, size, range);
		int x = rData.generateSingleValue(range);
		Arrays.sort(in);
		//rData.printData(in);
		//System.out.println("===="+x);
		long start = System.currentTimeMillis();
		System.out.println("\nMethod 1 :: " + noOfOccurences1(in, x));
		long end = System.currentTimeMillis();
		System.out.println("\n" + (end - start) / 1000.0 + " seconds");
		
		start = System.currentTimeMillis();
		System.out.println("\nMethod 2 :: " + noOfOccurences2(in, x));
		end = System.currentTimeMillis();
		System.out.println("\n" + (end - start) / 1000.0 + " seconds");
	}

}
