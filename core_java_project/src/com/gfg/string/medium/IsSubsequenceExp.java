package com.gfg.string.medium;

public class IsSubsequenceExp {

//	Using two pointer
	static boolean isSubsequence(String str1, String str2) {

		// Initialize pointers for both strings
		int i = 0;
		int j = 0;

		while (i < str1.length() && j < str2.length()) {
			// Compare characters, increment both pointers if same
			if (str1.charAt(i) == str2.charAt(j)) {
				i++;
				j++;
			} else {
				j++; // Only increment second pointer
			}
		}

		// If it is a subsequence, 'i' will have travelled full
		// length of string 'str1', so just check and return
		return (i == str1.length());
	}

	public static void main(String[] args) {

		String s = "abc";
		String t = "ahbgdc"; // true

//	    String s = "abx";
//	    String t = "ahbgdc";  // false

		System.out.println(isSubsequence(s, t));

	}

}
