package com.array.sort$search;

public class BinarySearchExample {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 12, 34, 54 }; // Must be sorted
		int target = 34;
		int result = binarySearch(arr, target);

		if (result == -1) {
			System.out.println("Element not found.");
		} else {
			System.out.println("Element found at index: " + result);
		}
	}

	// Binary Search method
	public static int binarySearch(int[] arr, int target) {
		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2; // Calculate the mid index

			// Check if target is present at mid
			if (arr[mid] == target) {
				return mid; // Return the index if found
			}

			// If target is greater, ignore left half
			if (arr[mid] < target) {
				left = mid + 1;
			} else {
				// If target is smaller, ignore right half
				right = mid - 1;
			}
		}

		return -1; // Return -1 if not found
	}
}
