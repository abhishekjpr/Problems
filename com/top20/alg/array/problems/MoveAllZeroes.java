package com.top20.alg.array.problems;

import java.io.*;

public class MoveAllZeroes{
	public static void main(String... args) throws IOException{
		int[] arr = new int[]{1, 0, 4, 0, 5, 0, 0, 5, 7, 9};
		moveZeroArray(arr);
	}
	public static void moveZeroArray(int []arr){
		int count = 0;
		for(int i = 0; i < arr.length; i++){
			if(arr[i]!=0){
				arr[count++] = arr[i];
			}
		}
		while(count<arr.length){
			arr[count++] = 0;
		}
		
	}
}