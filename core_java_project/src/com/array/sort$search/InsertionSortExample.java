package com.array.sort$search;

import java.util.Arrays;

public class InsertionSortExample {
	public static void main(String[] args) {
		int arr[] = { 5, 3, 8, 4, 2 };

		// Insertion Sort
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;

			// Move elements greater than key to one position ahead
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}

		// Print sorted array
		System.out.println("Sorted array (Insertion Sort): " + Arrays.toString(arr));
	}
}

/*

Example Walkthrough

Using the array [5, 3, 8, 4, 2]:

    Initial Array: [5, 3, 8, 4, 2]

    Sorted Portion: Start with the first element [5].

    First Key (3):
        Compare 3 with 5: 3 < 5, so shift 5 right → [5, 5, 8, 4, 2]
        Insert 3 → [3, 5, 8, 4, 2]

    Second Key (8):
        Compare 8 with 5: 8 >= 5, so no shifts needed.
        Insert 8 → [3, 5, 8, 4, 2]

    Third Key (4):
        Compare 4 with 8: 4 < 8, shift 8 right → [3, 5, 8, 8, 2]
        Compare 4 with 5: 4 < 5, shift 5 right → [3, 5, 5, 8, 2]
        Compare 4 with 3: 4 >= 3, insert 4 → [3, 4, 5, 8, 2]

    Fourth Key (2):
        Compare 2 with 8: 2 < 8, shift 8 right → [3, 4, 5, 8, 8]
        Compare 2 with 5: 2 < 5, shift 5 right → [3, 4, 5, 5, 8]
        Compare 2 with 4: 2 < 4, shift 4 right → [3, 4, 4, 5, 8]
        Compare 2 with 3: 2 < 3, shift 3 right → [3, 3, 4, 5, 8]
        Insert 2 → [2, 3, 4, 5, 8]

Final Sorted Array

After processing all elements, the array is sorted: [2, 3, 4, 5, 8].
Time Complexity

    Best Case: O(n) when the array is already sorted (minimal shifts).
    Average Case: O(n²).
    Worst Case: O(n²) when the array is sorted in reverse order.

Space Complexity

    O(1) since it uses a constant amount of additional space for temporary variables (like the key). 

*/

