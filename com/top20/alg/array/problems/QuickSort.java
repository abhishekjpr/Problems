package com.top20.alg.array.problems;

public class QuickSort {

	public static void quickSort(int[] in, int start, int end) {
		if (start < end) {
			int pIndex = partitionIndex(in, start, end);
			quickSort(in, start, pIndex - 1);
			quickSort(in, pIndex + 1, end);
		}
	}

	public static int partitionIndex(int[] in, int start, int end) {
		int pIndex = start;
		int pivot = in[end];
		for (int i = start; i < end; i++) {
			if (in[i] <= pivot) {
				int temp = in[i];
				in[i] = in[pIndex];
				in[pIndex] = temp;
				pIndex++;
			}
		}
		int temp = in[end];
		in[end] = in[pIndex];
		in[pIndex] = temp;
		return pIndex;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] in = new int[] { 9, 39, 1, 44, 23, 43, 90, 65, 2, 54, 67, 88, 100 };
		quickSort(in, 0, in.length - 1);
		ReadData rData = new ReadData();
		rData.printData(in);
	}

}
