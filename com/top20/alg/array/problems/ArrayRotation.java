package com.top20.alg.array.problems;

/* Pending efficient Solution */
import java.util.Random;

public class ArrayRotation {

	public static void arrayRotation1(int[] in, int x){
		for(int i = 0; i < x; i++){
			for(int j = 0; j < in.length-1; j++){
				int temp = in[j];
				in[j] = in[j+1];
				in[j+1] = temp;
			}
		}
	}
	
	public static void arrayRotation2(int[] in, int x){
		int d = x;
		int n = in.length;
		int i, j, k, temp;
        for (i = 0; i < gcd(d, n); i++) 
        {
            /* move i-th values of blocks */
            temp = in[i];
            j = i;
            while (1 != 0) 
            {
                k = j + d;
                if (k >= n) 
                    k = k - n;
                if (k == i) 
                    break;
                in[j] = in[k];
                j = k;
            }
            in[j] = temp;
        }
	}
	
	 public static int gcd(int a, int b) 
	    {
	        if (b == 0)
	            return a;
	        else
	            return gcd(b, a % b);
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = Integer.parseInt(args[0]);
		int[] in = new int[size];
		int range = 10;
		int x = new Random().nextInt(10);
		System.out.println(x);
		ReadData rData = new ReadData();
		rData.readData(in, size, range);
		long start = System.currentTimeMillis();
		rData.printData(in);
		System.out.println();
		arrayRotation2(in, x);
		rData.printData(in);
		long end = System.currentTimeMillis();
		System.out.println("\n" + (end - start) / 1000.0 + " seconds");
	}

}
