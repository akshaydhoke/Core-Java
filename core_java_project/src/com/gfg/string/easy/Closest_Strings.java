package com.gfg.string.easy;

import java.util.ArrayList;

public class Closest_Strings {

	static int shortestDistance(ArrayList<String> s, String word1, String word2) {
		int minimum = s.size();
		int diff = 0;
		int l = -1, h = -1;

		for (int i = 0; i < s.size(); i++) {
			if (s.get(i).equals(word1)) {
				l = i;
				if (h != -1) {
					diff = Math.abs(h - l);
					minimum = Math.min(minimum, diff);
				}
			}

			if (s.get(i).equals(word2)) {
				h = i;
				if (l != -1) {
					diff = Math.abs(h - l);
					minimum = Math.min(minimum, diff);
				}
			}
		}

		return minimum;
	}

	public static void main(String[] args) {

//		    Input:
//		   	S = {"geeks", "for", "geeks", "contribute", 
//			     "practice"}
//			word1 = "geeks"
//			word2 = "practice"
//			Output: 2
//			Explanation: Minimum distance between the
//			words "geeks" and "practice" is 2

		ArrayList<String> list = new ArrayList<>();
		list.add("geeks");
		list.add("for");
		list.add("geeks");
		list.add("contribute");
		list.add("practice");

		String word1 = "geeks";
		String word2 = "practice";

		System.out.println(shortestDistance(list, word1, word2));

	}

}
