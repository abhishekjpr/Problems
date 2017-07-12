package com.top20.alg.array.problems;

import java.util.Random;

public class SpiralTraversal {

	public static void spiralTraversal(Object[][] in){
		int start = 0, end = in.length-1;
		int j = 0;
		int se = in.length-1, ss = 0;
		while(start<=end){
			for(j = start; j <= end; j++)
				System.out.print(in[start][j]+" ");
			ss++;
			for(j = ss; j <= se; j++)
				System.out.print(in[j][end]+" ");
			end--;
			for(j = end; j >= start; --j)
				System.out.print(in[se][j]+" ");
			se--;
			for(j = se; j >= ss; --j)
				System.out.print(in[j][start]+" ");
			start++;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = Integer.parseInt(args[0]);
		int col = Integer.parseInt(args[1]);
		
		Object[][] in = new Object[row][col];
		Random r = new Random();
		for(int i = 0; i < in.length; i++){
			for(int j = 0; j < in[i].length; j++)
				in[i][j] = r.nextInt(90);
		}
		for(int i = 0; i < in.length; i++){
			for(int j = 0; j < in[i].length; j++){
				System.out.print(in[i][j]+ "   ");
			}
			System.out.println();
		}
		spiralTraversal(in);
	}

}
