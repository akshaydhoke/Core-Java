package com.array.level1;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SiftNumbers {

	public static void main(String[] args) {

		long num = 123456789;

		// Extract the last digit and the remaining number
		long lastDigit = num % 10; // This gives 9
		long remainingNumber = num / 10; // This gives 12345678

		// Form the new number by adding the last digit at the front
		long result = lastDigit * (long) Math.pow(10, String.valueOf(remainingNumber).length()) + remainingNumber;

		// Print the result
		System.out.println(result);
		
	}

}
