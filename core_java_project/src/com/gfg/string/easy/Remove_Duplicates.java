package com.gfg.string.easy;

import java.util.HashSet;
import java.util.Set;

public class Remove_Duplicates {
	static String removeDups(String S) {

		String res = "";

		Set<Character> set = new HashSet<>();

		for (int i = 0; i < S.length(); i++) {
			if (set.add(S.charAt(i))) {
				res += S.charAt(i);
			}
		}

		return res;
	}

	public static void main(String[] args) {

		String S = "zvvo"; // zvo

		System.out.println(removeDups(S));

	}

}
