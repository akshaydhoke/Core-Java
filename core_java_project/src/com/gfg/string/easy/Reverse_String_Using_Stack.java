package com.gfg.string.easy;

import java.util.Stack;

public class Reverse_String_Using_Stack {

	public static String reverse(String S) {

		StringBuilder res = new StringBuilder();

		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < S.length(); i++) {
			stack.push(S.charAt(i));
		}

		while (!stack.isEmpty()) {
			res.append(stack.peek());
			stack.pop();
		}

		return res.toString();
	}

	public static void main(String[] args) {

		String S = "GeeksforGeeks"; // Output: skeeGrofskeeG

		System.out.println(reverse(S));
		
	}
}
