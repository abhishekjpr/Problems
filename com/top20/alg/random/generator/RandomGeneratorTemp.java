package com.top20.alg.random.generator;

import java.util.Random;

public class RandomGeneratorTemp {
	
	//using java system class
	public static void getRandom1(int n){
		Random r = new Random();
		for(int i = 0; i < n; i++)
			System.out.println(r.nextInt(n));
	}
	
	//not an efficient random generation while running in loop.
	public static void getRandom2(int n){
		for(int i = 0; i < n; i++)
			System.out.println(System.currentTimeMillis()%n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(args[0]);
		getRandom2(n);
	}

}
