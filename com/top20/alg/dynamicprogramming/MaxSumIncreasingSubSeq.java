package com.top20.alg.dynamicprogramming;

public class MaxSumIncreasingSubSeq {
	
	public static int maxSum1(int[] in) {
		int pSum = 0, cSum = 0;
		for(int i = 0; i < in.length; i++) {
			cSum = in[i];
			int num = in[i];
			for(j = i+1; j < in.length; j++) {
				if(num < in[j]) {
					cSum += in[j];
					num = in[j];
					//System.out.println(cSum);
				}
				else{
					if(pSum <= cSum) {
						pSum = cSum;
						cSum = num = in[j];
					}
				}
			}
		}
		if(pSum <= cSum) {
			pSum = cSum;
		}
		return pSum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[]{1, 101, 2, 3, 100, 4, 5};
		System.out.println(maxSum1(arr));
	}
}
