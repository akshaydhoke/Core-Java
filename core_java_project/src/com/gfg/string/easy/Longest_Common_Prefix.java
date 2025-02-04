package com.gfg.string.easy;

import java.util.Arrays;

public class Longest_Common_Prefix {

//	DRY-RUN METHOD ::

	static String longestCommonPrefix(String[] arr, int n) {

		StringBuilder sb = new StringBuilder();

		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));

		char[] first = arr[0].toCharArray();
		char[] last = arr[arr.length - 1].toCharArray();

		for (int i = 0; i < first.length; i++) {
			if (first[i] != last[i]) {
				break;
			}
			sb.append(first[i]);
		}

		return sb.toString();
	}

//	Horizontal Scanning

	static String longestCommonPrefix(String[] S) {
		if (S.length == 0) {
			return "";
		}
		String prefix = S[0];
		for (int i = 1; i < S.length; i++) {
			while (S[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length() - 1);
				if (prefix.isEmpty()) {
					return "";
				}
			}
		}
		return prefix;
	}

	public static void main(String[] args) {

		String arr[] = { "geeksforgeeks", "geeks", "geek", "geezer" };

		System.out.println(longestCommonPrefix(arr, arr.length - 1));

//		System.out.println(longestCommonPrefix(arr));

	}

}
