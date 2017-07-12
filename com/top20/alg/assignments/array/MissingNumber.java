package com.top20.alg.assignments.array;

/*
 * 
Find the Missing Number
You are given a list of n-1 integers and these integers are in the range of 1 to n. 
There are no duplicates in list. One of the integers is missing in the list. 
Write an efficient code to find the missing integer.
*/

public class MissingNumber {
	
	public static int missingNumber(int[] in){
		int sum = ((in.length+1)*(in.length+2))/2;
		int sum_n = 0;
		for(int i : in){
			sum_n += i;
		}
		return (sum - sum_n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] in = new int[]{1, 2, 4, 5, 6, 3, 7, 8, 9, 10, 12};
		long start = System.currentTimeMillis();
		System.out.println(missingNumber(in));
		long end = System.currentTimeMillis();
		System.out.println("\n" + (end - start) / 1000.0 + " seconds");
	}

}
