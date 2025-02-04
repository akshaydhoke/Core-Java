package com.gfg.string.easy;

public class Palindrome_String {

	static int isPalindrome(String S) {
		int flag = 0;
		String rev = "";

//		for (int i = S.length() - 1; i >= 0; i--) {
//			rev += S.charAt(i);
//		}

		rev = new StringBuilder(S).reverse().toString();

		if (rev.equals(S)) {
			flag = 1;
		}

		return flag;
	}

	public static void main(String[] args) {

		String s = "abba";

		int res = isPalindrome(s);

		if (res == 1) {
			System.out.println("String is palindrom");
		} else {
			System.out.println("Not palindrom");
		}

	}
}
