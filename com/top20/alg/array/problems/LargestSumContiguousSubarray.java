package com.top20.alg.array.problems;

public class LargestSumContiguousSubarray {

	public static int maxSum(int[] in){
		int max_prev = Integer.MIN_VALUE, max_end = 0;
		for(int i = 0; i < in.length; i++){
			max_end += in[i];
			if(max_prev < max_end){
				max_prev = max_end;
			}
			if(max_end<0)
				max_end = 0;
		}
		return max_prev;
	}
	
	public static void main(String[] args) {
		int[] in = new int[]{-2, -3, 4, 1, 3, -1, 5, -5};
		long start = System.currentTimeMillis();
		System.out.println(maxSum(in));
		long end = System.currentTimeMillis();
		System.out.println("\n" + (end - start) / 1000.0 + " seconds");
	}

}
