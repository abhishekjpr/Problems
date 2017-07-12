package com.top20.alg.array.problems;

import java.util.Arrays;

public class FindSubarrayWithGivenSum {

	// TC : O(n^2) SC : O(1)
	public static String getSubarray1(int[] in, int sum) {
		int temp = 0;
		boolean flag = true;
		int sIndex = 0, eIndex = 0;
		outer: for (int i = 0; i < in.length; ++i) {
			temp = in[i];
			sIndex = i;
			for (int j = i + 1; j < in.length; j++) {
				temp += in[j];
				if (temp == sum) {
					eIndex = j;
					flag = false;
					break outer;
				} else if (temp > sum) {
					break;
				}
			}
		}
		if (!flag)
			return "Index " + sIndex + " to index " + eIndex;
		else
			return "No Subarray Found";
	}

	//TC : O(n) SC : O(1)
	public static String getSubarray2(int[] in, int sum) {
		int temp = 0;
		for(int i = 0; i < in.length; i++) {
			int j = i+1;
			temp = in[i];
			while(temp < sum) {
				temp += in[j++];
			}
			if(temp == sum) {
				return "Index " + i + " to index " + (j-1);
			}
		}
		return "No Subarray Found";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 4, 0, 0, 3, 10, 5 };
		int sum = 15;
		System.out.println(Arrays.toString(arr));
		System.out.println(getSubarray2(arr, sum));
	}

}
