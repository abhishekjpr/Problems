package com.top20.alg.array.problems;

import java.util.Arrays;

public class NumberOccuringOddNoOfTime {

	/**
	 * @param args
	 * Program to find number occured odd number of times.
	 */
	public static int missingNumber1(int[] in){
		Arrays.sort(in);
		int result = 0;
		for(int i = 0; i < in.length-1; i+=2){
			if(in[i] != in[i+1]){
				result = in[i];
				break;
			}
		}
		if(result == 0 && in[in.length-2] != in[in.length-1])
			return in[in.length-1];
		return result;
	}
	
	public static int missingNumber2(int[] in) {
		int result = 0;
		for (int out : in) {
			result ^= out;
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] in = new int[] { 19, -4, -4, 1, 1, 1, 2, 2, 3, 3, 7, 7, 4, 4, 5, 5, 6, 6, 19, 20, 20 };
		int mNumber = missingNumber2(in);
		System.out.println(mNumber);
	}
}
