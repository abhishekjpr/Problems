package com.top20.alg.array.problems;

public class SearchElementInPivotedArray {
	
	//4 5 6 7 8 1 2 3
	//3

	public static boolean findElemnt(int[] in, int key) {
		int i, j;
		i = 0; 
		j = in.length-1;
		int mid = (i+j)/2;
		if(in[mid] == key){
			return true;
		}
		for (i = 0; in[mid]!=key; i++) {

		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
