package com.top20.alg.array.problems;

import java.util.Random;

public class ReadData {
	int data = 0;
	public int generateSingleValue(int range) {
		Random r = new Random();
		data = r.nextInt(range);
		return data;
	}

	public void readData(int[] in, int size, int range) {
		Random r = new Random();
		for (int i = 0; i < in.length; ++i) {
			in[i] = r.nextInt(range);
		}
	}

	public void readData(double[] in, int size, int range) {
		Random r = new Random();
		for (int i = 0; i < in.length; ++i) {
			in[i] = r.nextDouble();
		}
	}

	public void printData(double[] in) {
		for (int i = 0; i < in.length; i++) {
			System.out.print(in[i] + " ");
		}
	}

	public void printData(int[] in) {
		for (int i = 0; i < in.length; i++) {
			System.out.print(in[i] + " ");
		}
	}
}
