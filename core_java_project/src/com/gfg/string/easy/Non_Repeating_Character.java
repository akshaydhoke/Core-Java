package com.gfg.string.easy;

//https://studyalgorithms.com/string/first-unique-character-in-a-string/

import java.util.HashMap;
import java.util.Map;

public class Non_Repeating_Character {

//	The idea is to search for the current character in the string just after its first occurrence in the string. 
//	If the character is found in the remaining string then return that character. 

//	1. int indexOf(char ch, int fromIndex)
//	This method returns the index within this string of the first occurrence of the specified character or -1, 
//	if the character does not occur.

	static char nonrepeatingCharacter(String s) {

		char res = 0;

		for (int i = 0; i < s.length(); i++) {

			if (s.indexOf(s.charAt(i), s.indexOf(s.charAt(i)) + 1) == -1) {
				System.out.println("First non-repeating character is :" + s.charAt(i));
				res = s.charAt(i);
				break;
			}
		}

		return res;

	}

//	"Hashmap-Based Frequency Counting" approach.

	public static char firstUniqueChar(String str) {

		int index = -1;
		char firstChar = 0;

		Map<Character, Integer> charFreqMap = new HashMap<>();

		// Update the map
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			// Get the current frequency
			int freq = charFreqMap.getOrDefault(c, 0);

			// Update the map
			charFreqMap.put(c, (freq + 1));
		}

		for (int i = 0; i < str.length(); i++) {
			if (charFreqMap.get(str.charAt(i)) == 1) {
				firstChar = str.charAt(i);
				break;
			}
		}

		return firstChar;
	}

	public static void main(String[] args) {

		String S = "studyAlgorithms"; // u

//		String S2 = "zxvczbtxyzvy"; // c

//		System.out.println(nonrepeatingCharacter(S));

		System.out.println(firstUniqueChar(S));

	}

}
