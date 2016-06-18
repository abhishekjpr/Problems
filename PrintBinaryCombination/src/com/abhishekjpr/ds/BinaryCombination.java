package com.abhishekjpr.ds;

public class BinaryCombination {

	public BinaryCombination() {
		// TODO Auto-generated constructor stub
		int n = 2;
		char []arr = new char[n];
		printBinaryCombination(arr, arr.length);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BinaryCombination();
	}
	
	public void printBinaryCombination(char[] arr, int n){
		if(n<1){
			printArray(arr);
		}
		else{
			arr[n-1] = '0';
			printBinaryCombination(arr, n-1);
			arr[n-1] = '1';
			printBinaryCombination(arr, n-1);
		}
	}
	public void printArray(char[] arr){
		String str=new String();
		for(int i = 0; i < arr.length; i++){
			str+=arr[i];
		}
		System.out.println(str);
	}
}
