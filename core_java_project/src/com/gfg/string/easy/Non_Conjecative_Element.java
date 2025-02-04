package com.gfg.string.easy;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Non_Conjecative_Element {

	public static void main(String[] args) {

		String str = "aaabacdll"; // bcg
		
		
	  List<Entry<Character, Long>>  map =  str.chars().mapToObj(i ->(char)i).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
			  .entrySet().stream().filter(i -> i.getValue()!=2).collect(Collectors.toList());
	   
		
	   System.out.println(map);
	   
	   
	   
	}

}
