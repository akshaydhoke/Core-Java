package com.gfg.string.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Second_Most_Repeated_String {

	static String secFrequent(String arr[], int N) {

		Map<String, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1); // put("aaa",1);
			} else {
				map.put(arr[i], 1);
			}
		}

		Iterator<Entry<String, Integer>> itr = map.entrySet().iterator();

		while (itr.hasNext()) {
			Entry<String, Integer> element = itr.next();
			if (element.getValue() == 2) {
				return element.getKey();
			}
		}

		return "";
	}

	static String secFrequentJava8(String arr[], int N) {

		String res = "";

		res = Arrays.stream(arr).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
				.stream().filter(i -> i.getValue() == 2).map(i -> i.getKey()).findFirst().get();

		return res;
	}

	public static void main(String[] args) {

//		    Input:
//			N = 6
//			arr[] = {aaa, bbb, ccc, bbb, aaa, aaa}
//			Output: bbb
//			Explanation: "bbb" is the second most 
//			occurring string with frequency 2.

		String[] arr = { "aaa", "bbb", "ccc", "bbb", "aaa", "aaa" };

//		System.out.println(secFrequent(arr, arr.length));

		System.out.println(secFrequentJava8(arr, arr.length));

	}

}
