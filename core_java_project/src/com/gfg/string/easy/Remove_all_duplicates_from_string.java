package com.gfg.string.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Remove_all_duplicates_from_string {

	static String removeDuplicates(String str) {

		StringBuilder res = new StringBuilder();

		Set<Character> set = new LinkedHashSet();

		for (int i = 0; i < str.length(); i++) {
			set.add(str.charAt(i));
		}

		for (char c : set) {
			res.append(c);
		}

		return res.toString();
	}

	static String removeDuplicatesJava8(String str) {

		StringBuilder res = new StringBuilder();

		str.chars().distinct().forEach(i -> res.append((char) i));

		return res.toString();
	}

	public static void main(String[] args) {

		String str = "geeksforgeeks"; // geksfor

//		System.out.println(removeDuplicates(str));

		System.out.println(removeDuplicatesJava8(str));

	}

}
