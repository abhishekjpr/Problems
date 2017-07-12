package com.top20.alg.array.problems;

import java.util.Arrays;

public class FindElementIn2DSortedArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = { { 1, 2, 3, 5 }, { 4, 6, 8, 11 }, { 5, 10, 12, 15 },
				{ 9, 15, 18, 20 } };
		System.out.println(findElement3(a, 100));

	}
	
	// TC: n * n ~ O(n^2) SC: O(1)
	public static boolean findElement1(int[][] in, int key){
		int i;
		for(i = 0; i < in.length; i++){
			for(int j = 0; j < in[i].length; j++){
				if(in[i][j] == key)
					return true;;
			}
		}
		return false;
	}
	
	// TC: n * log n ~ O(n log n) SC: O(1)
	public static boolean findElement2(int[][] in, int key){
		int i;
		for(i = 0; i < in.length; i++){
			if(Arrays.binarySearch(in[i], key) < 0)
				continue;
			else
				return true;
		}
		return false;
	}
	
	public static boolean findElement3(int[][] in, int key){
		int row = 0, col = in.length-1;
		int len = in.length;
		while(row < len && col >= 0){
			if(in[row][col] == key)
				return true;
			else if(in[row][col] < key)
				row++;
			else
				col--;
		}
		return false;
	}
}
