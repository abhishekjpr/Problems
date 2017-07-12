package com.top20.alg.array.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Intersection {

	public static void printIntersection1(int[] inOne, int[] inTwo) {
		for (int i = 0; i < inOne.length; i++) {
			for (int j = 0; j < inTwo.length; j++) {
				if (inOne[i] == inTwo[j]) {
					inTwo[j] = Integer.MIN_VALUE;
					break;
				}
			}
		}
	}

	public static void printIntersection2(int[] inOne, int[] inTwo) {
		Arrays.sort(inOne);
		Arrays.sort(inTwo);
		System.out.println();
		int i, j;
		i = j = 0;
		while (i < inOne.length && j < inTwo.length) {
			if (inOne[i] == inTwo[j]) {
				i++;
				j++;
			} else if (inOne[i] < inTwo[j]) {
				i++;
			} else {
				j++;
			}
		}
	}

	public static void printIntersection3(int[] inOne, int[] inTwo) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		System.out.println();
		for (int i = 0; i < inOne.length; i++) {
			al.add(inOne[i]);
		}
		for (int i = 0; i < inTwo.length; i++) {
			if (al.contains(inTwo[i])) {
				al.set(al.indexOf(inTwo[i]), Integer.MIN_VALUE);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inOne = new int[Integer.parseInt(args[0])];
		Random r = new Random();
		for (int i = 0; i < inOne.length; i++) {
			inOne[i] = r.nextInt(5) + 1;
		}

		int[] inTwo = new int[Integer.parseInt(args[1])];
		Random rTwo = new Random();
		for (int i = 0; i < inTwo.length; i++) {
			inTwo[i] = rTwo.nextInt(5) + 1;
		}
		System.out.println();


		long start = System.currentTimeMillis();
		printIntersection1(inOne, inTwo);
		long end = System.currentTimeMillis();
		System.out.println();
		System.out.println("\n1st :: " + (end - start) / 1000.0 + " Seconds");
	}
}
