package com.gfg.string.medium;

import java.util.HashMap;
import java.util.Map;

// Two strings are isomorpic if all occurrences of character can be replaced with other character to form the second string.

public class IsomorphicStrings {

	// Creating hashMap to store each replacement entry.
	//
	static boolean isIsomorphic(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}

		// Create a hashmap to store character mappings

		Map<Character, Character> charMappingMap = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {

			char original = s.charAt(i);
			char replacement = t.charAt(i);

			if (!charMappingMap.containsKey(original)) {
				if (!charMappingMap.containsValue(replacement)) {
					charMappingMap.put(original, replacement);
				} else {
					return false;
				}
			} else {
				char mappedCharacter = charMappingMap.get(original);
				if (mappedCharacter != replacement) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {

//		String s = "add"; // true
//		String t = "egg";

//	    String s = "paper";  //true
//	    String t = "title";

		String s = "badc"; // false
		String t = "baba";

		boolean res = IsomorphicStrings.isIsomorphic(s, t);

		if (res == true) {
			System.out.println("Strings are isomorphic");
		} else {
			System.out.println("Not isomorphic");
		}

	}

}
