package com.java8.streams.intermediate.flatmap;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Demonstration of flatMap() in Java Streams
 *
 * flatMap(Function<T, R>):
 * -------------------------------------------------
 * - Purpose: Used to "flatten" nested collections or streams into a single stream.
 * - Works by:
 *      1. Taking each element (which itself may be a collection/stream)
 *      2. Converting it into a stream using the function provided
 *      3. Merging (flattening) all resulting streams into one continuous stream
 *
 * Why flatMap() instead of map():
 * - map() will give a Stream<Stream<T>> when dealing with nested collections, which is not directly useful.
 * - flatMap() removes the extra nesting and produces a single Stream<T>.
 *
 * Example scenario:
 * Nested list: [[1,2,3], [4,5,6], [7,8,9]]
 * After flatMap: [1,2,3,4,5,6,7,8,9]
 */
public class FlatMapDemo {
    public static void main(String[] args) {

        // 1. Create a nested list of integers (List of Lists)
        List<List<Integer>> nestedList = List.of(
                List.of(1, 2, 3),
                List.of(4, 5, 6),
                List.of(7, 8, 9)
        );

        /**
         * 2. Processing steps using flatMap:
         *    a) nestedList.stream() → Creates a Stream<List<Integer>>
         *    b) flatMap(x -> x.stream()) →
         *         - For each List<Integer> in the stream, create a Stream<Integer>
         *         - Flatten all these small streams into one Stream<Integer>
         *    c) collect(Collectors.toList()) →
         *         - Terminal operation to gather all flattened elements into a List<Integer>
         */
        List<Integer> flatList = nestedList.stream()
                .flatMap(x -> x.stream())
                .collect(Collectors.toList());

        // 3. Print each element of the flattened list
        flatList.forEach(System.out::println);
    }
}
