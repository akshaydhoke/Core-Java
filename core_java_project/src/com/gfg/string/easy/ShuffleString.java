package com.gfg.string.easy;

public class ShuffleString {

	static String restoreString(String s, int[] indices) {

		char[] str = new char[s.length()];

		for (int i = 0; i < s.length(); i++) {
			str[indices[i]] = s.charAt(i);
		}

		return String.valueOf(str);
	}

	public static void main(String[] args) {

		String s = "codeleet";
		int[] indices = { 4, 5, 6, 7, 0, 2, 1, 3 };

//	    String s = "abc";
//	    int[] indices = {0, 1, 2};

		System.out.println(restoreString(s, indices));

	}
}
