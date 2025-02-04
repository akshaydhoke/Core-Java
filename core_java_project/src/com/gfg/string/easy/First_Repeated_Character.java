package com.gfg.string.easy;

import java.util.HashSet;

public class First_Repeated_Character {

//	Hash map approch ::
	static char firstRepeating(String str) {

		char res = ' ';

		HashSet<Character> set = new HashSet<>();

		for (int i = 0; i < str.length(); i++) {
			if (set.contains(str.charAt(i))) {
				return str.charAt(i);
			} else {
				set.add(str.charAt(i));
			}
		}
		return res;
	}

//	Normal counter approach ::
	static char firstRepeating2(String str) {

		char res = ' ';

		int counter = Integer.MAX_VALUE;

		for (int i = 0; i < str.length(); i++) {
			char temp = str.charAt(i);
			for (int j = i + 1; j < str.length(); j++) {
				if (temp == str.charAt(j)) {
					if (j < counter) {
						counter = j;
						res = str.charAt(j);
					}
				}
			}
		}
		return res;
	}

	public static void main(String[] args) {

		String str = "geeksforgeeks";

//		System.out.println(firstRepeating(str));

		System.out.println(firstRepeating2(str));

	}

}
