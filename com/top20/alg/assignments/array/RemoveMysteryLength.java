package com.top20.alg.assignments.array;

public class RemoveMysteryLength {

	private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	// n + n ~ O(n)
	public static int fetchLength(String str) {

		if (str.length() == 0)
			return -1;
		int length = str.length();
		String newStr = "";
		for (int i = length - 1; i >= 0; --i) {
			newStr = str.charAt(i) + newStr;
			if (Integer.parseInt(newStr) == i) {
				return Integer.parseInt(newStr);
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = Integer.parseInt(args[0]);
		String str = randomAlphaNumeric(size).toString();
		str += size;
		//System.out.println(str);
		long start = System.currentTimeMillis();
		fetchLength(str);
		long end = System.currentTimeMillis();
		System.out.println("\n" + (end - start) / 1000.0 + " sec");
	}

	public static String randomAlphaNumeric(int count) {

		StringBuilder builder = new StringBuilder();
		while (count-- != 0) {
			int character = (int) (Math.random() * ALPHA_NUMERIC_STRING.length());
			builder.append(ALPHA_NUMERIC_STRING.charAt(character));
		}
		return builder.toString();
	}

}
