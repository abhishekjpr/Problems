package com.top20.alg.assignments.array;

import java.util.HashMap;

public class AnagramDiscovery {

	public static boolean anagramDiscovery(String strOne, String strTwo) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		if (strOne.length() != strTwo.length())
			return false;
		for (int i = 0; i < strOne.length(); i++) {
			int count = 0;
			if(map.containsKey(strOne.charAt(i))){
				count = map.get(strOne.charAt(i));
			}
			map.put(strOne.charAt(i), ++count);
		}

		for (int i = 0; i < strTwo.length(); i++) {
			if (map.containsKey(strTwo.charAt(i))) {
				int count = map.get(strTwo.charAt(i));
				//System.out.println(count);
				if(count<=0)
					return false;
				map.put(strTwo.charAt(i), --count);
			} else {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ADFG";
		String str1 = "ABCD";
		System.out.println(anagramDiscovery(str, str1));
	}
}
