package com.array.sort$search;

import java.util.Arrays;

public class BubbleSortExample {

	public static void main(String[] args) {
		int arr[] = {5, 3, 8, 4, 2 };

		// Bubble Sort
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					// Swap
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		// Print sorted array
		System.out.println("Sorted array (Bubble Sort): " + Arrays.toString(arr));
	}
}

/*

Example Walkthrough

Using the array [5, 3, 8, 4, 2]:

    First Pass:
        Compare 5 and 3: swap → [3, 5, 8, 4, 2]
        Compare 5 and 8: no swap → [3, 5, 8, 4, 2]
        Compare 8 and 4: swap → [3, 5, 4, 8, 2]
        Compare 8 and 2: swap → [3, 5, 4, 2, 8]

    (Largest element 8 is now in its correct position.)

    Second Pass:
        Compare 3 and 5: no swap → [3, 5, 4, 2, 8]
        Compare 5 and 4: swap → [3, 4, 5, 2, 8]
        Compare 5 and 2: swap → [3, 4, 2, 5, 8]

    (Next largest element 5 is now in its correct position.)

    Third Pass:
        Compare 3 and 4: no swap → [3, 4, 2, 5, 8]
        Compare 4 and 2: swap → [3, 2, 4, 5, 8]

    Fourth Pass:
        Compare 3 and 2: swap → [2, 3, 4, 5, 8]

At this point, the array is sorted, and the algorithm can terminate.
Time Complexity

    Best Case: O(n) when the array is already sorted.
    Average Case: O(n²).
    Worst Case: O(n²) when the array is sorted in reverse order.

Space Complexity

    O(1) since it uses only a constant amount of extra space for swapping elements.   */

