package com.java8.coding;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// https://javaconceptoftheday.com/java-8-interview-sample-coding-questions/

public class RealTimeExp2 {
	public static void main(String[] args) {
		
		 System.err.println("++++++++++++++++++++++++++++ Real Time Exp +++++++++++++++++++++++++++++++");
		 
//			employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
//			employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
//			employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
//			employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
//			employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
//			employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
//			employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
//			employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
//			employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
//			employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
//			employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
//			employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
//			employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
//			employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
//			employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
//			employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
//			employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
		 
		 
		 List<Employee> empObj= RealTimeExp.employeeList;
		 
		 System.out.println(empObj);
		 
		 
/*		 
		 
		 System.err.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

		
//		1) Given a list of integers, separate odd and even numbers?

        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
        
        Map<Boolean, List<Integer>> listOfEvenOdds=  listOfIntegers.stream().collect(Collectors.partitioningBy(i -> i%2==0));
        Set<Entry<Boolean, List<Integer>>> setOfEvenOdds =  listOfEvenOdds.entrySet();

		for (Entry<Boolean, List<Integer>> elements : setOfEvenOdds) {
			System.out.println("----------------");

			if (elements.getKey()) {
				System.out.println("Even Numbers");
			} else {
				System.out.println("Odd Numbers");
			}

			System.out.println("----------------");

			List<Integer> numbers = elements.getValue();
			for (int number : numbers) {
//				System.out.println(number);
			}
		}
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
//		2) How do you remove duplicate elements from a list using Java 8 streams?

        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");

        List<String> removeDuplicates =  listOfStrings.stream().distinct().toList();
		System.out.println(removeDuplicates);
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

//		3) How do you find frequency of each character in a string using Java 8 streams?

        String inputString = "Java Concept Of The Day";

        Map<Character, Long>  charCountMap =  inputString.replace(" ", "").chars().mapToObj(i ->(char)i).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	    System.out.println(charCountMap);
	    
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
//		6) Given a list of strings, join the strings with ‘[‘ as prefix, ‘]’ as suffix and ‘,’ as delimiter?

        List<String> listOfStrings2 = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");

        String joiningStr = listOfStrings2.stream().collect(Collectors.joining(" , ", "[", "]"));
        System.out.println(joiningStr);
        
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                
//		12) Java 8 program to check if two strings are anagrams or not?

		String s1 = "RaceCar";
		String s2 = "CarRace";

		s1 = Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());

		s2 = Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());

		if (s1.equals(s2)) {
			System.out.println("Two strings are anagrams");
		} else {
			System.out.println("Two strings are not anagrams");
		}
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

//		13) Find sum of all digits of a number in Java 8?

        int i = 15623;

        long digitSum =  Stream.of(String.valueOf(i).split("")).collect(Collectors.summarizingInt(Integer::parseInt)).getSum();
		System.out.println("Total digit sum : " + digitSum);
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

//		14) Find second largest number in an integer array?

        List<Integer> integers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        
       int secondMax = integers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
       System.out.println(secondMax);
       
	   System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
//      15) Given a list of strings, sort them according to increasing order of their length?
       
        List<String> listOfStrings3 = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
        
        listOfStrings3.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);

 	    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

// 	    16) Given an integer array, find sum and average of all elements?

		int[] a = new int[] { 45, 12, 56, 15, 24, 75, 31, 89 };

		int sum = Arrays.stream(a).sum();
		double average = Arrays.stream(a).average().getAsDouble();

		IntSummaryStatistics statistics = Arrays.stream(a).summaryStatistics();

		System.out.println("Average :" + statistics.getAverage());
		System.out.println("Sum :" + statistics.getSum());
        
 	    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

// 	    17) How do you find common elements between two arrays?

        List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);
        List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);
        
        list1.stream().filter(list2::contains).forEach(System.out::println);

 	    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

// 	    18) Reverse each word of a string using Java 8 streams?

        String str = "Java Concept Of The Day";
        
        String reverseOfEachWord = Stream.of(str.split(" ")).map(word -> new StringBuffer(word).reverse()).collect(Collectors.joining(" "));
		System.out.println(reverseOfEachWord);
		
 	    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

// 	   20) Reverse an integer array

        int[] array = new int[] {5, 1, 7, 3, 9, 6};

        int[] reverseArr = IntStream.rangeClosed(1, array.length).map(j -> array[array.length - j]).toArray();
        System.out.println(Arrays.toString(reverseArr));
        
 	    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

// 	    22) How do you find the most repeated element in an array?
 	    
        List<String> listOfStrings4 = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");

        Map<String, Long> list3 = listOfStrings4.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        Entry<String, Long> mostFrequentElement = list3.entrySet().stream().max(Map.Entry.comparingByValue()).get();
        
//        System.out.println("Element Name : " + mostFrequentElement.getKey());
//        System.out.println("Repeated value : " + mostFrequentElement.getValue());

 	    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

// 	    23) Palindrome program using Java 8 streams

		String str3 = "ROTATOR";

		boolean isItPalindrome = IntStream.rangeClosed(0, str3.length()/2).anyMatch(k -> str3.charAt(k)==str3.charAt(str3.length()-k-1));

		if (isItPalindrome) {
			System.out.println(str3 + " is a palindrome");
		} else {
			System.out.println(str3 + " is not a palindrome");
		}
		
 	    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

// 	    24) Given a list of strings, find out those strings which start with a number?

        List<String> digitList = Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "Six");

//        digitList.stream().filter(word -> Character.isDigit(word.charAt(0))).forEach(System.out::println);
        
 	    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

// 	   26) Print duplicate characters in a string?

		String string5 = "Java Concept Of The Day";

		Set<String> uniqueChars = new HashSet<String>();
		Set<String> uniqueCharactors = Arrays.stream(string5.replaceAll("\\s+", "").toLowerCase().split(""))
				.filter(k -> !uniqueChars.add(k)).collect(Collectors.toSet());

//		System.out.println(uniqueCharactors);

	   System.out.println("-------------------------------------------------------");

//	   27) Find first repeated character in a string?

	  Map<String, Long>  mapOfChar = Arrays.stream(string5.replaceAll("\\s+", "").toLowerCase().split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//	  System.out.println(mapOfChar);

	  String repeatedChar = mapOfChar.entrySet().stream().filter(k -> k.getValue()>1).map(k -> k.getKey()).findFirst().get();
//	  System.out.println(repeatedChar);
	  
	  System.out.println("-------------------------------------------------------");

//	  28) Find first non-repeated character in a string?

	 String nonRepeatedChar = mapOfChar.entrySet().stream().filter(k -> k.getValue()==1).map(k -> k.getKey()).findFirst().get();
//	 System.out.println(nonRepeatedChar);
	 
	 System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	 
//	 29) Fibonacci series

//	 Stream.iterate(new int[] {0,1}, f -> new int[] {f[1],f[0]+f[1]}).limit(10).map(f -> f[0]).forEach(k -> System.out.print(k +" "));
	 
	 System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

//	 30) First 10 odd numbers

//	 Stream.iterate(new int[] {1,3}, f -> new int[] {f[1],f[1]+2}).limit(10).map(f -> f[0]).forEach(k -> System.out.print(k +" "));
	 
	 System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");


//	 32) Find the age of a person in years if the birthday has given?

     LocalDate birthDay = LocalDate.of(1985, 01, 23);
     LocalDate today = LocalDate.now();
      
//     System.out.println(ChronoUnit.YEARS.between(birthDay, today));
     
	 
	 
*/

	  
	}
}
