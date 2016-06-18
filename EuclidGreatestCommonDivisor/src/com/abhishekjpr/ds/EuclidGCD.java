package com.abhishekjpr.ds;

import java.util.Scanner;

/**
 * @author abhishekjpr
 *
 */
public class EuclidGCD {

	int a, b;
	/**
	 * 
	 */
	public EuclidGCD() {
		// TODO Auto-generated constructor stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number :: ");
		a = sc.nextInt();
		System.out.println("Enter the second number :: ");
		b = sc.nextInt();
		System.out.println("GCD :: "+euclidGCD(a, b));
		sc.close();
	}
	
	public int euclidGCD(int a, int b){
		if(a == 0)
			return b;
		return euclidGCD(b%a, a);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new EuclidGCD();
	}

}
