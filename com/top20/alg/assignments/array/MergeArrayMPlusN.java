package com.top20.alg.assignments.array;

import com.top20.alg.array.problems.ReadData;

public class MergeArrayMPlusN {
	
	// (n + n + n = 3*n) ~ O(n)
	public static int[] mergeArray1(int[] mArr, int[] nArr){
		int k = 0;
		int i, j;
		shiftAllElementsToEnd(mArr, nArr.length);
		for(i = (nArr.length), j = 0; i < mArr.length && j < nArr.length;){
			System.out.println(i+"---"+j);
			if(mArr[i] < nArr[j]){
				mArr[k++] = mArr[i];
				i++;
			}
			else if(mArr[i] >= nArr[j]){
				mArr[k++] = nArr[j];
				j++;
			}
		}
		while(j < mArr.length && k < mArr.length){
			mArr[k++] = nArr[j++];
		}
//		ReadData rData = new ReadData();
//		System.out.println();
//		rData.printData(mArr);
//		System.out.println();
		return mArr;
	}
	
	public static void shiftAllElementsToEnd(int[] mArr, int nArrLength){
		int lastIndex = mArr.length-nArrLength-1;
		int last = mArr.length-1;
		for(int i = 0; i < (mArr.length-nArrLength); i++){
			mArr[last--] = mArr[lastIndex--];
		}
		ReadData rData = new ReadData();
		rData.printData(mArr);
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReadData rData = new ReadData();
		//int size = Integer.parseInt(args[0]);
		int[] in = new int[]{1,0,0,0,0 ,0 , 0, 0 ,0, 0,0};
		int[] out = new int[]{1,3, 5, 5,7,9,14,16,18, 20};
		long start = System.currentTimeMillis();
		out = mergeArray1(in, out);
		rData.printData(out);
		long end = System.currentTimeMillis();
		System.out.println("\n" + (end - start) / 1000.0 + " sec");
	}
}
