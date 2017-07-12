package com.top20.alg.recursive.thinking;

public class Power {
	
	// TC: O(n)			SC: O(1)
	public static long power1(long num, long x){
		int res = 1;
		for(int i = 0; i < x; i++){
			res *= num;
		}
		return res;
	}
	
	//recursive thinking
	// TC : O(n)		SC: O(n)
	public static long power2(long num, long x){
		if(x == 1)
			return num;
		long res = num * power2(num, --x);
		return res;
	}
	//recursive thinking more optimized --> Dynamic Programming
	// TC : O(n)		SC: O(n)
	public static long power3(long num, long x){
		if(x == 0)
			return 1;
		if(x == 1)
			return num;
		long res = power3(num, x/2);
		if(x%2==0)
			return (res*res);
		else
			return (res*res*num);
	}

	public static void main(String[] args) {
		long num = Integer.parseInt(args[0]);
		long x = Integer.parseInt(args[1]);
		long start = System.currentTimeMillis();
		System.out.println(power3(num, x));
		long end = System.currentTimeMillis();
		System.out.println("Method 1 :: " + (end-start)/1000.0);
	}
}
