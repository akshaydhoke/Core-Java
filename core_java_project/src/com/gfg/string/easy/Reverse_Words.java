package com.gfg.string.easy;

public class Reverse_Words {

	static String reverseWords(String S) {

		String result = "";

		String[] str = S.split("\\.");

		int len = str.length - 1;

		while (len > -1) {
			result += str[len] + ".";
			len--;
		}

		return result.substring(0, result.length() - 1);
	}

	public static void main(String[] args) {

		String str = "i.like.this.program.very.much";

		System.out.println(reverseWords(str));
	}
}
