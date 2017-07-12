package com.top20.alg.listimplementation;

import java.util.Random;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		Random r = new Random(100);
		int n = Integer.parseInt(args[0]);
		for(int i = 1; i <= n ; i++){
			al.add(r.nextInt(n));
		}
		al.display();
		al.display();
		System.out.println(al.size());
		al.add(2, 23);
		al.display();
		al.add(al.size()+1, 123);
		al.display();
	}
}
