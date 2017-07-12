package com.top20.alg.array.problems;

import java.util.Random;

public class LeaderInArray {
	
	public static void printLeaders1(int[] in){
		boolean flag = true;
		for(int i = 0; i < in.length; ++i){
			flag = true;
			for(int j = i+1; j < in.length; j++){
				if(in[i] >= in[j]){
					flag = true;
				}
				else{
					flag = false;
					break;
				}
			}
			if(flag){
//				System.out.println(in[i]);
			}
		}
//		System.out.println(in[in.length]);
	}
	
	public static void printLeaders2(int[] in){
		int max = in[in.length-1];
//		System.out.println(max);
		for(int i = in.length-1; i > 0; --i){
			if(in[i-1] >= in[i] && in[i-1] >= max){
				max = in[i-1];
//				System.out.println(max);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = Integer.parseInt(args[0]);
		int[] in = new int[size];
		Random r = new Random();
		for (int i = 0; i < in.length; i++) {
			in[i] = r.nextInt(10) + 1;
		}
//		for(int a : in){
//			System.out.print(a+" ");
//		}
		System.out.println();
		
		long start = System.currentTimeMillis(); 
		printLeaders2(in); 
		long end = System.currentTimeMillis();
		System.out.println(); 
		System.out.println((end - start) / 1000.0 +" seconds");
	}

}
