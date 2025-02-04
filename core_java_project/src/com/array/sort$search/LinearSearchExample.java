package com.array.sort$search;

public class LinearSearchExample {
	public static void main(String[] args) {
		int[] arr = { 12, 34, 54, 2, 3 };
		int target = 54;
		int result = linearSearch(arr, target);

		if (result == -1) {
			System.out.println("Element not found.");
		} else {
			System.out.println("Element found at index: " + result);
		}
	}

	// Linear Search method
	public static int linearSearch(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return i; // Return the index if found
			}
		}
		return -1; // Return -1 if not found
	}
}
