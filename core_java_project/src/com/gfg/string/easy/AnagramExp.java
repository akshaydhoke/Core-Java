package com.gfg.string.easy;

// https://studyalgorithms.com/string/valid-anagram-strings/

import java.util.Arrays;

public class AnagramExp {

	public static boolean isAnagram(String a, String b) {
		boolean flag = false;

		char[] str1 = a.toCharArray();
		char[] str2 = b.toCharArray();

		Arrays.sort(str1);
		Arrays.sort(str2);

		if (Arrays.toString(str1).equals(Arrays.toString(str2))) {
			flag = true;
		}

		return flag;
	}

//	Optimized Approach:
	public static boolean isAnagram2(String str1, String str2) {

		// Convert both to lowercase to ignore case match
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		// Strip of all the white spaces
		str1 = str1.replace(" ", "");
		str2 = str2.replace(" ", "");

		// Initialize the bucket array
		int[] counts = new int[26];

		// Fill the buckets
		for (int i = 0; i < str1.length(); i++) {
			counts[str1.charAt(i) - 'a']++;
		}
		
		System.out.println(Arrays.toString(counts));
		
		// Empty the buckets
		for (int i = 0; i < str2.length(); i++) {
			counts[str2.charAt(i) - 'a']--;
		}

		// Check if all buckets are empty
		for (int count : counts) {
			if (count != 0)
				return false;
		}

		return true;
	}

	public static void main(String[] args) {

		String a = "geeksforgeeks";
		String b = "forgeeksgeeks";

//		boolean res = isAnagram(a, b);

		boolean res = isAnagram2(a, b);

		if (res == true) {
			System.out.println("Strings are anagram");
		} else {
			System.out.println("Not anagram");
		}

	}

}
