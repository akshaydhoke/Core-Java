package com.gfg.string.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Panagram {

	public static boolean checkPangram(String str) {

		boolean[] mark = new boolean[26];

		int index = 0;

		for (int i = 0; i < str.length(); i++) {
			if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
				index = str.charAt(i) - 'A';
			} else if ('a' <= str.charAt(i) && str.charAt(i) <= 'z') {
				index = str.charAt(i) - 'a';
			} else {
				continue;
			}

			mark[index] = true;
		}

		System.out.println(Arrays.toString(mark));

		return false;
	}

	// Approch 2 ::
	static boolean checkIfPangram(String sentence) {

		Set<Character> alphabetSet = new HashSet<>();

		// Add all characters from 'a' to 'z' in hashset
		for (int i = 'a'; i <= 'z'; i++) {
			alphabetSet.add((char) i);
		}

		// Remove every character and check
		// if set becomes empty at any point of time
		for (int i = 0; i < sentence.length(); i++) {
			alphabetSet.remove(sentence.charAt(i));
			if (alphabetSet.isEmpty())
				return true;
		}

		return false;
	}

	public static void main(String[] args) {

//		A pangram is a sentence containing every letter in the English Alphabet.

//		Input: “The quick brown fox jumps over the lazy dog” 
//		Output: is a Pangram 

//		String str = "The quick brown fox jumps over the lazy dog";
		
		String str = "thequickbrownfoxjumpsoverthelazydog";
		
//		String str="studyalgorithms";

//		boolean flag = checkPangram(str);

		boolean flag = checkIfPangram(str);

		if (flag == true) {
			System.out.println("STRING IS PANAGRAM");
		} else {
			System.out.println("NOT PANAGRAM");
		}

	}

}
