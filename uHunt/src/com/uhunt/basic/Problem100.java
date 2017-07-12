package com.uhunt.basic;

import java.util.HashMap;

public class Problem100 {

	//TC:O(n) + O(n) ~ O(n)
	public static int length1(int start, int end) {
		int num = start;
		int pNum = 0;
		while (num <= end) {
			int n = num;
			int count = 0;
			while (n != 1) {
				if (n % 2 == 0)
					n /= 2;
				else
					n = (3 * n) + 1;
				count++;
			}
			++count;
			if (count > pNum) {
				pNum = count;
			}
			count = 0;
			num = ++start;
		}
		return pNum;
	}

	//TC:O(n)	SC:O(n)
	public static int length2(int start, int end) {
		int num = start;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int pNum = 0;
		while (num <= end) {
			int n = num;
			int count = 0;
			while (n != 1) {
				if (map.containsKey(n)) {
					count += map.get(n);
					--count;
					break;
				} else {
					if (n % 2 == 0)
						n /= 2;
					else
						n = (3 * n) + 1;
					count++;
				}
			}
			++count;
			if (!map.containsKey(num)) {
				map.put(num, count);
			}
			if (count > pNum) {
				pNum = count;
			}
			num = ++start;
		}
		return pNum;
	}

	//Limitations are memory overflow error..
	//TC: O(n) SC: O(n)
	public static int length3(int start, int end) {
		int[] mem = new int[100000000 + 1];
		int count = 0, pNum = 0;
		mem[0] = 0;
		mem[1] = 1;
		while (start <= end) {
			int n = start;
			if(mem[n]!=0)
				count = mem[n];
			else
				count = auxLength(n, mem);
			if (count > pNum)
				pNum = count;
			++start;
		}
		return pNum;
	}

	private static int auxLength(int n, int[] mem) {
		if (n == 1)
			return mem[n];
		if (mem[n] != 0)
			return mem[n];
		if (n % 2 == 0)
			mem[n] = auxLength(n / 2, mem) + 1;
		else
			mem[n] = auxLength((3 * n) + 1, mem) + 1;
		return mem[n];
	}

	public static void main(String[] args) {
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		System.out.println(length2(n1, n2));
		//System.out.println(length3(n1, n2));
	}
}
