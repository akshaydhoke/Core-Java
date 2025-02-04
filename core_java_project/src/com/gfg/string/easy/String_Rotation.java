package com.gfg.string.easy;

public class String_Rotation {

	public static boolean areRotations(String s1, String s2) {

		if (s1.length() != s2.length()) {
			return false;
		}

		// Approach 1:

//		String concatenated = s1 + s1;
//		if (concatenated.indexOf(s2) != -1) {
//			return true;
//		}

		// Approach 2:

		StringBuffer str = new StringBuffer(s1 + s1);
		if (str.lastIndexOf(s2) > 0) {
			return true;
		}

		return false;
	}

	public static void main(String[] args) {

		String s1 = "geeksforgeeks";
		String s2 = "forgeeksgeeks";

		boolean flag = areRotations(s1, s2);

		if (flag == true) {
			System.out.println("String Rotated");
		} else {
			System.out.println("STRING NOT ROTATED");
		}

	}

}
