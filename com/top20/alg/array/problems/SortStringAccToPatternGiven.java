package com.top20.alg.array.problems;

public class SortStringAccToPatternGiven {

	public static void sortString(String str, String pat){
		int[] count = new int[10000];
		for(int i = 0; i < count.length; i++)
			count[i] = 0;
		for(int i = 0; i < str.length(); i++){
			count[str.charAt(i) - 'a']++;
		}
		
		str = new String("");
		for(int i = 0; i < pat.length(); i++){
			for(int j = 0; j < count[pat.charAt(i) -'a']; j++){
				str += pat.charAt(i);
			}
		}
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sortString("jcdokai", "wcyuogmlrdfphitxjakqvzbnes");
	}

}
