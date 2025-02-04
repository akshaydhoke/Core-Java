package com.gfg.string.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Anagram_Grouping_Exp {

//	Method 1: Group by Sorting

	public static List<List<String>> groupAnagramsCategorizeBySorting(String[] strs) {

		List<List<String>> resultList = new ArrayList<>();

		Map<String, List<String>> map = new HashMap<>();
		for (String i : strs) {

			char[] arr = i.toCharArray();

			Arrays.sort(arr);

			String key = String.valueOf(arr);

			if (!map.containsKey(key)) {
				map.put(key, new ArrayList<>());
			}
			map.get(key).add(i);
		}

		for (Map.Entry<String, List<String>> list : map.entrySet()) {
			resultList.add(list.getValue());
		}

		return resultList;
	}

//	Method 2: Group by Frequency

	public static List<List<String>> groupAnagramsCategorizeByFrequency(String[] strs) {

		List<List<String>> resultList = new ArrayList<>();

		Map<String, List<String>> frequencyStringsMap = new HashMap<>();

		for (String s : strs) {

			String frequencyString = getFrequencyString(s);

			if (frequencyStringsMap.containsKey(frequencyString)) {
				frequencyStringsMap.get(frequencyString).add(s);
			} else {
				List<String> charList = new ArrayList<>();
				charList.add(s);
				frequencyStringsMap.put(frequencyString, charList);
			}
		}

		for (Map.Entry<String, List<String>> m : frequencyStringsMap.entrySet()) {
			resultList.add(m.getValue());
		}

		return resultList;
	}

	private static String getFrequencyString(String s) {
		// Frequency buckets
		int[] freq = new int[26];

		// Iterate over each character
		for (char c : s.toCharArray()) {
			freq[c - 'a']++;
		}

		// Start creating the frequency string
		StringBuilder frequencyString = new StringBuilder("");
		char c = 'a';
		for (int i : freq) {
			frequencyString.append(c);
			frequencyString.append(i);
			c++;
		}

		return frequencyString.toString();
	}

	public static void main(String[] args) {

//		Question: Given an array of strings strs, you need to group all the anagrams together. You can return the answer in any order.
//				Input: strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
//				Output: [["bat"], ["nat", "tan"], ["ate", "eat", "tea"]]

		String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };

//		System.out.println(groupAnagramsCategorizeBySorting(strs));

		System.out.println(groupAnagramsCategorizeByFrequency(strs));

	}
}
