package com.top20.alg.dynamicprogramming;

public class NthFibonacci {
	
	// TC: O(2^n)	SC:O(n)
	public static long fib1(int n){
		if(n <= 2)
			return 1;
		return fib1(n-1) + fib1(n-2);
	}
	
	// TC: O(n)	SC:O(n) ----> Top down Dynamic Programming or Memoization
	public static long fib2(int n){
		long[] mem = new long[n+1];
		auxfib2(n, mem);
		return mem[n];
	}

	private static long auxfib2(int n, long[] mem) {
		// TODO Auto-generated method stub
		if(n <= 2)
			return 1;
		if(mem[n]!=0) return mem[n];
		mem[n] = auxfib2(n-1, mem) + auxfib2(n-2, mem);
		return mem[n];
	}
	
	// TC: O(n)		SC:O(n)
	// TC: O(n)	SC:O(n) ----> Dynamic Programming
	public static long fib3(int n){
		int[] mem = new int[n+1];
		mem[1] = mem[2] = 1;
		for(int i = 3; i <= n; i++){
			mem[i] = mem[i-1] + mem[i-2];
		}
		return mem[n];
	}
	
	// TC: O(n)		SC:O(1)
	// TC: O(n)	SC:O(n) ----> Optimized Dynamic Programming
	public static long fib4(int n){
		int last1, last2, current = 0;
		last1 = last2 = 1;
		for(int i = 3; i <= n; i++){
			current = last1+last2;
			last1 = last2;
			last2 = current;
		}
		return current;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fib4(19));
	}

}
