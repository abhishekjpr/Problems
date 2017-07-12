package com.top20.alg.array.problems;

public class Segregate0s1s {

	public static void segregate0s1s_1(int[] in) {
		for (int i = 0; i < in.length; i++) {
			for (int j = 0; j < in.length; j++) {
				if (in[i] < in[j]) {
					int temp = in[i];
					in[i] = in[j];
					in[j] = temp;
				}
			}
		}
	}

	public static void segregate0s1s_2(int[] in) {
		int j = in.length - 1;
		for (int i = 0; i < j;) {
			while (in[j] == 1) {
				j--;
			}
			while (in[i] == 0 && i < j) {
				i++;
			}
			if (i < j) {
				in[i] = 0;
				in[j] = 1;
				i++;
				j--;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = Integer.parseInt(args[0]);
		int[] in = new int[size];
		int range = 2;
		ReadData rData = new ReadData();
		rData.readData(in, size, range);
		long start = System.currentTimeMillis();
		rData.printData(in);
		segregate0s1s_2(in);
		System.out.println();
		rData.printData(in);
		long end = System.currentTimeMillis();
		System.out.println("\n" + (end - start) / 1000.0 + " seconds");
	}

}
