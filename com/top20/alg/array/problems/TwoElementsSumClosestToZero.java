package com.top20.alg.array.problems;

public class TwoElementsSumClosestToZero {
	
	public static void rintElements1(int[] in){
		int diff = 0, a=0, b=0;
		int min_diff = Integer.MAX_VALUE;
		for(int i = 0; i < in.length; i++){
			for(int j = i+1; j < in.length; j++){
				diff = in[i]+in[j];
				if(diff < min_diff){
					min_diff = diff;
					diff = 0;
					a = in[i];
					b = in[j];
				}
			}
		}
		System.out.println(a+"---"+b+"----------"+min_diff);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] in = new int[]{1,60,-10,70,-80,85, -2};
//		printElements(in);
	}

}
