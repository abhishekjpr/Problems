package com.top20.alg.tree.problems;

public class BSTCount {

	// TC: O(c^n) SC:O(n)
	public static int bstCount1(int n) {
		int count = 0;
		if (n <= 1)
			return 1;
		for (int i = 1; i <= n; i++) {
			count += (bstCount1(i - 1) * bstCount1(n - i));
		}
		return count;
	}

	public static int bstCount2(int n) {
		int[] mem = new int[n + 1];
		auxbstCount2(n, mem);
		return mem[n];
	}

	private static int auxbstCount2(int n, int[] mem) {
		int res = 0;
		if (n <= 1)
			return 1;
		for (int i = 1; i <= n; i++) {
			long left = mem[i - 1] != 0 ? mem[i-1] : auxbstCount2(i - 1, mem);
			long right = mem[n - i] != 0 ? mem[n-i] : auxbstCount2(n - i, mem);
			res += left * right;
		}
		return mem[n] = res;
	}
	
	public static int bstCount3(int n) {
		int[] mem = new int[n + 1];
		mem[0] = mem[1] = 1;
		for(int i = 1; i <= n; ++i){
			int res = 0;
			for (int j = 1; j <= i; ++j) {
				res += (mem[j-1] * mem[i-j]);
			}
			mem[i] = res;
		}
		return mem[n];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(args[0]);
		System.out.println(bstCount3(n));
	}
}
