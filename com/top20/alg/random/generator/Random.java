package com.top20.alg.random.generator;

public class Random {
	
	private long seed = System.currentTimeMillis();
	private static final long multiplier = 7;
	private static final long addend = 9;
	private static final long modulus = 1 << 21;
	
	public Random(long seed){
		this.seed = seed;
	}
	
	public Random(){
		
	}

	// TC: O(1)
	public long nextInt(int n){
		long tmp = (seed * multiplier + addend) % modulus;
		seed = tmp;
		return tmp % n;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(args[0]);
		Random r = new Random();
		for(int i = 0; i < 10; i++){
			System.out.println(r.nextInt(n));
		}
	}
}
