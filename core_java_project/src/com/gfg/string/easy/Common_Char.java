package com.gfg.string.easy;

import java.util.HashSet;
import java.util.Set;

public class Common_Char {

	public static String twoStrings(String s1, String s2) {
		String res = "No";

		Set<Character> set1 = new HashSet<>();
		Set<Character> set2 = new HashSet<>();

		for (int i = 0; i < s1.length(); i++) {
			set1.add(s1.charAt(i));
		}

		for (int i = 0; i < s2.length(); i++) {
			set2.add(s2.charAt(i));
		}
		System.out.println(set1);
		System.out.println(set2);

		set1.retainAll(set2); // retains all matching elements

		if (!set1.isEmpty()) {
			System.out.println(set1.toString());
			return "YES";
		}

		return res;
	}

	public static void main(String[] args) {

		String str1 = "barbell";
		String str2 = "trarpper";

		System.out.println(twoStrings(str1, str2));

	}

}
