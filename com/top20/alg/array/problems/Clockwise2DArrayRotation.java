package com.top20.alg.array.problems;

public class Clockwise2DArrayRotation {

	public static void arrayRotate(Object[][] in) {
		for (int layer = 0; layer < in.length / 2; layer++) {
			int first = layer;
			int last = in.length - layer - 1;
			for (int i = first; i < last; i++) {
				int offset = i - first;
				Object top = in[first][i];
				in[first][i] = in[last - offset][first];
				in[last - offset][first] = in[last][last-offset];
				in[last][last-offset] = in[i][last];
				in[i][last] = top;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object[][] in = new Object[][]{{1,2,3,4},{5,6,7,8},{'a','b','c','d'},{'e','f','g','h'}};
		arrayRotate(in);
		for(int i = 0; i < in.length; i++){
			for(int j = 0; j < in[i].length; j++){
				System.out.print(in[i][j]+" ");
			}
			System.out.println();
		}
	}

}
