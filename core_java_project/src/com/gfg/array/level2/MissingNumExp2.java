package com.gfg.array.level2;

import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MissingNumExp2 {

	public static void main(String[] args) {

		int[] arr = { 7, 2, 5, 3, 5, 3 };
		int[] brr = { 7, 2, 5, 4, 6, 3, 5, 3 };

//			Output:
//			Missing numbers: {4, 6}

		int[] ans = missingNumbers(arr, brr);

		System.out.println(Arrays.toString(ans));

	}

	public static int[] missingNumbers(int[] arr, int[] brr) {

		TreeMap<Integer, Integer> integerFreqMap = new TreeMap<>();

		// Add elements of original list
		for (int i : brr) {
			int freq = integerFreqMap.getOrDefault(i, 0);
			freq++;
			integerFreqMap.put(i, freq);
		}

		// Remove elements of new list
		for (int i : arr) {
			int freq = integerFreqMap.get(i);
			freq--;
			if (freq == 0)
				integerFreqMap.remove(i);
			else
				integerFreqMap.put(i, freq);
		}

		// Create the result array
		int[] result = new int[integerFreqMap.size()];
		int i = 0;
		for (Map.Entry<Integer, Integer> integerIntegerEntry : integerFreqMap.entrySet()) {
			result[i++] = integerIntegerEntry.getKey();
		}

		return result;
	}

}