package com.array.level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// https://www.geeksforgeeks.org/top-50-array-coding-problems-for-interviews/
// https://www.geeksforgeeks.org/count-number-of-occurrences-or-frequency-in-a-sorted-array/

public class FindOccurencesInArray {
	public static void main(String[] args) {

		int arr[] = { 1, 2, 2, 2, 2, 3, 4, 7, 8, 8 };
		int arrLen = arr.length;
		int x = 2;
		
        // way 1 :         
		int count = 0;
		for (int i=0;i<arrLen;i++) {
			if (x == arr[i]) {
				count++;
			}
		}
		System.out.println(x + " occurance is : " + count);
		
       // way2 : 
		List<Integer> cList=new ArrayList<>();
        
		for(int j:arr) {
			cList.add(j);
		}
		
		int occurance=Collections.frequency(cList, x);
		System.out.println( x +" Repeated elements : " + occurance);
		
		
		// way 3: 
		
        int[] array = {1, 2, 3, 4, 2, 3, 1, 5, 6, 7, 1, 3, 2};

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Iterate through the array to count frequencies
        for (int element : array) {
            if (frequencyMap.containsKey(element)) {
                // If element is already present, increment its count
                frequencyMap.put(element, frequencyMap.get(element) + 1);
            } else {
                // If element is encountered for the first time, add it with count 1
                frequencyMap.put(element, 1);
            }
        }

        // Print frequencies of each element
        System.out.println("Element : Frequency");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
		
        
	}
}
