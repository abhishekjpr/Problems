package com.top20.alg.array.problems;

public class MaximumRowOf0s1s {
	
	// (M log n)
	public static int countOne(int[] in){
		int i = 0, j = in.length-1, mid = (i+j)/2;
		int start = 0;
		while(true){
			if(in[j] == 0)
				return 0;
			else if(in[0] == 1)
				return in.length;
			// 0 1 2 3
			// 0 0 0 1
			else if(in[mid] == 1 && in[mid-1] != 1){
				start = mid;
				break;
			}
			else if(in[mid] < 1)
				i = mid+1;
			else
				j = mid-1;
			mid = (i+j)/2;
		}
		return (in.length-start);
	}
	
	public static int getMaxRow1(int[][] in){
		int max = 0, pmax = 0, index = 0;;
		for(int i = 0; i < in.length; i++){
			max = countOne(in[i]);
			if(max >= pmax){
				pmax = max;
				index = i;
			}
		}
		return (index + 1);
	}
	
	public static int getMaxRow2(int[][] in){
		int max_row_index = 0;
		int j = countOne(in[0]);
		if(j == 0)
			j = in.length-1;
		for (int i = 1; i < in.length; i++)
	    {
	        // Move left until a 0 is found
	        while (j >= 0 && in[i][j] == 1)
	        {
	           j = j-1;  // Update the index of leftmost 1 seen so far
	           max_row_index = i;  // Update max_row_index
	        }
	    }
	    return max_row_index;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] in = new int[][]{{0,1,1,1,1,1},{0,1,1,1,1,1},{0,1,1,1,1,1},{0,0,0,1,1,1}, {1,1,1,1,1,1},
									{0,1,1,1,1,1}};		//MxN
		int row = getMaxRow2(in);
		System.out.println(row);
	}

}
