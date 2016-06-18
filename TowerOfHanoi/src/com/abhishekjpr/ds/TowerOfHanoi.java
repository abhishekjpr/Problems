package com.abhishekjpr.ds;

public class TowerOfHanoi {
	
	public void solveTowerOfHanoi(int n, char source, char intermediate, char destination){
		if(n == 0)
			return;
		solveTowerOfHanoi(n-1, source, destination, intermediate);
		System.out.println("Moving "+source+" to "+destination);
		solveTowerOfHanoi(n-1, intermediate, source, destination);
		
	}
	public TowerOfHanoi() {
		// TODO Auto-generated constructor stub
		solveTowerOfHanoi(4, 'A', 'B', 'C');
	}
	public static void main(String[] args) {
		new TowerOfHanoi();
	}
}
