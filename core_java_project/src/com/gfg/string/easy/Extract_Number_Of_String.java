package com.gfg.string.easy;

public class Extract_Number_Of_String {

	static long ExtractNumber(String S) {

		long result = 0l;

		String[] strs = S.split(" ");
		for (String s : strs) {
			if (!s.contains("9") && (s.matches("[0-9]+"))) {
				result = Long.parseLong(s.trim());
				break;
			}
		}

		return result;
	}

	public static void main(String[] args) {

//		    Input:
//			Sentence="This is alpha 5057 and 97"
//			Output:
//			5057
//			Explanation:
//			5057 is the only number that does
//			not have a 9.

		String Sentence = "This is alpha 5057 and 97";

		System.out.println(ExtractNumber(Sentence));

	}

}
