package com.collection;

import java.util.TreeMap;
import java.util.TreeSet;

public class TreeSetMapExp {
	public static void main(String[] args) {
		
//		TreeSet:  The TreeSet object doesn't allows null values but, If you try to add them, a runtime exception will be generated at.
//		Reason: This internally compares the elements with each other using the compareTo (or compare) method.
//		If you try to compare any object with a null value using one of these methods, a NullPointerException will be thrown. Therefore, if you try to add null values to a TreeSet it generates a NullPointerException at the run time.
		
		TreeSet<String> set = new TreeSet<>();
//		set.add(null);
		set.add("Akshay");
		
		System.out.println(set);
		
//		TreeMap : TreeMap doesn't allow a null key but may contain many null values
//		Reason :  If we're using a TreeMap with a user-defined Comparator, then it depends on the implementation of the compare() method how null values get handled.

		TreeMap<Integer, Integer> map=new TreeMap<>();
		
		map.put(1, 100);
//		map.put(null, 100);
		map.put(2, null);
		map.put(3, null);
		map.put(3, null);

		
		System.out.println(map);
	}
}
