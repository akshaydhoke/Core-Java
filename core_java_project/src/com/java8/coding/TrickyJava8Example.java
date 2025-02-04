package com.java8.coding;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TrickyJava8Example {

    public static void main(String[] args) {

        // Sample list of people
        List<Person> people = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 32),
                new Person("Charlie", 19),
                new Person("David", 45),
                new Person("Eve", 62),
                new Person("Frank", 30),
                new Person("Grace", 29),
                new Person("Hank", 50),
                new Person("Ivy", 70),
                new Person("Jack", 40)
        );

        // Group by age group, count the number of people in each group, and sort by count in descending order
        Map<String, Long> ageGroupCount = people.stream()
                .collect(Collectors.groupingBy(
                        person -> getAgeGroup(person.getAge()),    // Grouping by age group
                        Collectors.counting()                       // Counting the number of people in each group
                ))
                .entrySet().stream()                             // Convert map to stream for sorting
                .sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()))  // Sort by count descending
                .collect(Collectors.toMap(
                        Map.Entry::getKey,                        // Keep the age group name
                        Map.Entry::getValue,                      // Keep the count
                        (e1, e2) -> e1,                           // Merge function (no merge here as keys are unique)
                        LinkedHashMap::new                        // Preserve order of sorted entries
                ));

        // Print the result
        ageGroupCount.forEach((ageGroup, count) -> System.out.println(ageGroup + ": " + count));
    }

    // Helper function to return the age group based on the age
    public static String getAgeGroup(int age) {
        if (age >= 18 && age <= 30) {
            return "18-30";
        } else if (age >= 31 && age <= 50) {
            return "31-50";
        } else {
            return "51+";
        }
    }
}

// Person class to represent a person
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

