package com.top20.alg.array.problems;

public class MergeSort {

	public static void mergeSort(int[] in){
		if(in.length < 2)
			return;
		int length = in.length;
		int mid = length/2;
		int k = 0;
		int[] left = new int[mid];
		int[] right = new int[length-mid];
		for(int i = 0; i < mid; i++)
			left[i] = in[i];
		for(int i = mid; i < length; i++)
			right[k++] = in[i];
		mergeSort(left);
		mergeSort(right);
		merge(left, right, in);
	}
	
	public static void merge(int[] left, int[] right, int[] in){
		int i = 0, j = 0, k = 0;
		int nL = left.length, nR = right.length;
		while(i < nL && j < nR){
			if(left[i] < right[j]){
				in[k] = left[i++];
			}else{
				in[k] = right[j++];
			}
			k++;
		}
		while(i < nL){
			in[k++] = left[i++];
		}
		while(j < nR){
			in[k++] = right[j++];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] in = new int[] { 9, 39, 1, 44, 23, 43, 90, 65, 2, 54, 67, 88, 100 };
		mergeSort(in);
		ReadData rData = new ReadData();
		rData.printData(in);
	}

}
