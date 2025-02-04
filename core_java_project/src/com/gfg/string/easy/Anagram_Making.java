package com.gfg.string.easy;

//  https://studyalgorithms.com/string/hackerrank-making-anagrams-solution/

//Question: Given a two strings, find the minimum number of characters that must be deleted to make them anagrams.

//Input: str1 = “a b c”, str2 = “a m n o p”
//Output: 6

public class Anagram_Making {

	static int makingAnagrams(String s1, String s2) {
		int total = 0;

		int[] c = new int[26];

		for (int i = 0; i < s1.length(); i++) {
			c[s1.charAt(i) - 'a']++;
		}

		for (int i = 0; i < s2.length(); i++) {
			c[s2.charAt(i) - 'a']--;
		}

		for (int j : c) {
			total += Math.abs(j);
		}

		return total;
	}

	public static void main(String[] args) {

		String s1 = "abc";
		String s2 = "amnop";

		System.out.println(makingAnagrams(s1, s2));

	}

}
