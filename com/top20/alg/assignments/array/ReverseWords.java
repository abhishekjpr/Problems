package com.top20.alg.assignments.array;

public class ReverseWords {
	
	// n + (n/2) + n = 3n ~ O(n)
	public static String reverseWords(String str){
		String[] strArray = str.split(" ");
		for(int i = 0, j = strArray.length-1; i < j; ++i, --j){
			String s = strArray[i];
			strArray[i] = strArray[j];
			strArray[j] = s;
		}
		str = new String();
		for(String s : strArray)
			str += s + " ";
		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "India is Best and I live in India that very awesome";
		System.out.println(reverseWords(str));
	}

}
