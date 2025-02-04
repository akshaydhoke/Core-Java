package com.multi_threading;

import java.util.*;
import java.util.stream.*;

// Parallel Streams are part of the Java 8 Streams API and allow operations on collections to be parallelized.

public class ParallelStreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int sum = numbers.parallelStream()  // Parallel stream
                          .mapToInt(Integer::intValue)
                          .sum();

        System.out.println("Sum of numbers: " + sum);
    }
}
