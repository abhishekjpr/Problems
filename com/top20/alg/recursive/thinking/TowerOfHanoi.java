package com.top20.alg.recursive.thinking;

public class TowerOfHanoi {

	public static void towerOfHanoi(int n, char src, char aux, char target){
		//if only 1 disk available move from source to target
		if(n == 1){
			System.out.println(src+"->"+target);
			return;
		}
		// Move (n-1) disk to src to aux with the help of target
		towerOfHanoi(n-1, src, target, aux);
		// move nth disk to target
		System.out.println(src+"->"+target);
		// Move (n-1) disk to aux to target with the help of src
		towerOfHanoi(n-1, aux, src, target);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(args[0]);
		towerOfHanoi(n, 'A', 'B', 'C');
	}

}
