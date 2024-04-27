package com.array.level3;

import java.util.HashMap;
import java.util.Map;

public class PrintOneOccurenceElement {
	public static void main(String[] args) {
		
		String str="aabcccdf";
		
		Map<Character, Integer> map=new HashMap<>();
		
		int counter=0;
		
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				
				if(str.charAt(i)==str.charAt(j)) {
					map.put(str.charAt(i), counter++);
				}
			}
		}
		
		System.out.println(map);
		
	}

}
