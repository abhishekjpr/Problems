package com.top20.alg.dynamicprogramming;

/* how many different ways were there is someone want to climb ladder with n steps */
public class ClimbNSteps {

	// TC: O(2^n) SC: O(n)
	public static int climbNSteps1(int n) {
		if (n == 1)
			return 1;
		if (n == 2)
			return 2;
		int steps = climbNSteps1(n - 1) + climbNSteps1(n - 2);
		return steps;
	}

	// TC:O(n) SC:O(n) - Memoization
	public static long climbNSteps2(int n) {
		long[] mem = new long[n + 1];
		return auxClimbNSteps(mem, n);
	}

	private static long auxClimbNSteps(long[] mem, int n) {
		if (n == 1)
			return 1;
		if (n == 2)
			return 2;
		if (mem[n] != 0)
			return mem[n];
		else
			mem[n] = auxClimbNSteps(mem, n - 1) + auxClimbNSteps(mem, n - 2);
		return mem[n];
	}

	// TC: O(n) SC:O(n) - optimized DP with N space complexity
	public static long climbNSteps3(int n) {
		long[] mem = new long[n + 1];
		mem[1] = 1;
		mem[2] = 2;
		for (int i = 3; i <= n; i++) {
			mem[i] = mem[i - 1] + mem[i - 2];
		}
		return mem[n];
	}

	// TC: O(n) SC:O(n) - optimized DP with O(1) space complexity
	//Limitation : can't track previous values
	public static long climbNSteps4(int n) {
		int a = 1;
		int b = 2;
		int c = 0;
		for (int i = 3; i <= n; i++) {
			c = a+b;
			a = b;
			b = c;
		}
		return c;
	}

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		System.out.println(climbNSteps4(n));
	}

}
