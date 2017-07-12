package com.top20.alg.array.problems;

public class Sort012 {
	public static void sort012(int[] in) {
		int low = 0, high = in.length - 1, mid = 0;
		while (mid <= high) {
			switch (in[mid]) {
			case 0:
				int temp = in[low];
				in[low] = in[mid];
				in[mid] = temp;
				low++;
				mid++;
				break;

			case 1:
				mid++;
				break;

			case 2:
				temp = in[high];
				in[high] = in[mid];
				in[mid] = temp;
				high--;
				break;
			}
		}
	}
	public static void main(String[] args) {
		int size = Integer.parseInt("10");
		int[] in = new int[size];
		int range = 3;
		ReadData rData = new ReadData();
		rData.readData(in, size, range);
		rData.printData(in);
		System.out.println();
		sort012(in);
		rData.printData(in);
	}
}
