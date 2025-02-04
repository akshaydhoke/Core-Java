package com.array.sort$search;

import java.util.Arrays;

public class SelectionSortExample {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6 };

		// Selection Sort
		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			// Swap
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}

		// Print sorted array
		System.out.println("Sorted array (Selection Sort): " + Arrays.toString(arr));
	}
}

/*

Example Walkthrough

Using the array [64, 25, 12, 22, 11]:

    Initial Array: [64, 25, 12, 22, 11]

    First Pass:
        Assume the minimum is at index 0 (value 64).
        Compare with 25, 12, 22, and 11. The minimum found is 11 at index 4.
        Swap 11 with 64 → [11, 25, 12, 22, 64].

    Second Pass:
        Now, consider the sub-array starting from index 1: [25, 12, 22, 64].
        Assume the minimum is 25.
        Compare with 12, 22, and 64. The minimum found is 12 at index 2.
        Swap 12 with 25 → [11, 12, 25, 22, 64].

    Third Pass:
        Consider the sub-array starting from index 2: [25, 22, 64].
        Assume the minimum is 25.
        Compare with 22 and 64. The minimum found is 22 at index 3.
        Swap 22 with 25 → [11, 12, 22, 25, 64].

    Fourth Pass:
        Consider the sub-array starting from index 3: [25, 64].
        Assume the minimum is 25.
        Compare with 64. No change needed.
        No swap is needed → [11, 12, 22, 25, 64].

    Final Pass: The last element is already in place.

Final Sorted Array

After processing all elements, the array is sorted: [11, 12, 22, 25, 64].
Time Complexity

    Best Case: O(n²).
    Average Case: O(n²).
    Worst Case: O(n²) for any initial arrangement of elements.

Space Complexity

    O(1) since it uses a constant amount of additional space for swapping elements.


*/


