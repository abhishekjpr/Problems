package com.top20.alg.assignments.array;

import com.top20.alg.array.problems.ReadData;

public class PolynomialEvaluation {

	// c + (n*n) * c ~ O(n^2)
	public static double polynomialEvaluation1(double[] coef, double x){
		int n = coef.length - 1;
		double result = 0.0d;
		for(int i = 0; i <= n; i++){
			result += (coef[i]*pow(x,i));
		}
		return result;
	}
	
	// n + (n * c) ~ O(n);
	public static double polynomialEvaluation2(double[] coef, double x){
		int n = coef.length - 1;
		double res = pow(x, n);
		double result = 0.0d;
		for(int i = n; i >= 0; --i){
			result += (coef[i]*res);
			res/=x;
			if(res == 0)
				res = 1;
		}
		return result;
	}
	
	// 1 * n ~ O(n)
	public static double pow(double x, int power){
		double res = 1;
		for(int i = 0; i < power; i++)
			res *= x;
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReadData rData = new ReadData();
		int size = Integer.parseInt(args[0]);
		double[] coef = new double[size];
		int range = 100;
		rData.readData(coef, size, range);
		rData.printData(coef);
		
		double x = 4.1d;
		long start = System.currentTimeMillis();
		polynomialEvaluation2(coef, x);
		//System.out.println(polynomialEvaluation(coef, x));
		long end = System.currentTimeMillis();
		System.out.println("\n" + (end - start) / 1000.0 + " seconds");
	}

}
