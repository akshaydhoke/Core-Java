package com.string;

public class StringPalindromeExp {

	public static void main(String[] args) {

		String original = "121";
        String str = "abcba";
		
		
//		boolean flag = checkPalindromString(original);
		
		boolean flag = isPalindrome(original);
		
		
		if (flag == true) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String Is Not palindrome");
		}

	}

	private static boolean checkPalindromString(String original) {
		String revStr = "";

		for (int i = original.length() - 1; i >= 0; i--) {
			revStr = revStr + original.charAt(i);
		}
		if (original.equals(revStr)) {
			return true;
		}
		return false;
	}

	static boolean isPalindrome(String str) {
		if (str == null || str.length() == 0) {
			return true;
		}
		str = str.toLowerCase();
		for (int i = 0; i <= str.length() / 2; i++) {
			char start = str.charAt(i);
			char end = str.charAt(str.length() - 1 - i);

			if (start != end) {
				return false;
			}
		}
		return true;
	}

}
