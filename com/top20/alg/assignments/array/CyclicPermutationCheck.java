package com.top20.alg.assignments.array;

public class CyclicPermutationCheck {

	// 1 + n + n ~ O(n)
	public static boolean checkCylicPermutation(String strOne, String strTwo) {
		if (strOne.length() != strTwo.length())
			return false;
		if (strOne.equals(strTwo))
			return true;
		for (int i = 0; i < strOne.length(); ++i) {
			char ch = strOne.charAt(0);
			strOne = strOne.substring(1, strOne.length()) + ch;
			System.out.println(strOne);
			if (strOne.equals(strTwo))
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		String strOne = "ABCD", strTwo = "CDAB";
		System.out.println(checkCylicPermutation(strOne, strTwo));
	}
}
