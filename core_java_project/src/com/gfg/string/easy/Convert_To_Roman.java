package com.gfg.string.easy;

public class Convert_To_Roman {

	static String convertToRoman(int n) {

		int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		String[] s = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

		StringBuilder result = new StringBuilder();

		for (int i = 0; i < values.length; i++) { 
			while (n >= values[i]) {
				n = n - values[i];
				result.append(s[i]);
			}
		}

		System.out.println(result.toString());

		return result.toString();
	}

	public static void main(String[] args) {
		int n = 6;

		convertToRoman(n);

	}
}
