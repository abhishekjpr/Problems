package com.top20.alg.array.problems;

public class SegregateEvenOdd {
	
	// n ~ O(n)
	public static void segregateEvenOdd(int[] in){
		int i = 0, j = in.length-1;
		while(i < j){
			while(in[i]%2==0)
				i++;
			while(in[j]%2!=0)
				j--;
			if(i<j){
				int temp = in[i];
				in[i] = in[j];
				in[j] = temp;
				i++;
				j--;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] in = new int[]{12, 34, 45, 9, 8, 90, 3};
		segregateEvenOdd(in);
		for(int a : in){
			System.out.print(a+" ");
		}
	}

}
