package com.java8.streams.basic;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreatingWays
{
    /*
     * 📌 Notes on Java 8 Streams:
     * 1. A Stream is a group of elements used for processing, **not for storing** like collections.
     * 2. Streams **support functional-style operations** (map, filter, reduce) using **lambda expressions**.
     * 3. Streams are **immutable** — they don't change the original data source.
     * 4. Java streams can be **sequential** or **parallel** (using `parallelStream()`).
     * 5. Streams are **lazy**, meaning operations are only executed when a terminal operation is called.
     * 6. Stream operations are of two types:
     *    - **Intermediate**: map(), filter(), sorted() – return a stream.
     *    - **Terminal**: forEach(), collect(), reduce() – produce a result or side-effect.
     */

    public static void main(String[] args) {

        // 1️⃣ Creating Stream from Integer Array (non-primitive)
        // Arrays.stream(Integer[]) creates a Stream<Integer>
        Integer[] nums = {8, 7, 9, 3, 5, 6, 9, 6, 3, 1};
        Stream<Integer> numsStream = Arrays.stream(nums);
        System.out.println("Integer Array To Stream");
        numsStream.forEach(System.out::println);
        System.out.println("-------------------------------------------------------------------------");

        // 2️⃣ Creating Stream from primitive int array
        // Arrays.stream(int[]) returns IntStream, not Stream<Integer>
        int[] num1 = {8, 7, 9, 3, 5, 6, 9, 6, 3, 1};
        IntStream intStream = Arrays.stream(num1);
        System.out.println("int array to stream");
        intStream.forEach(System.out::println);
        System.out.println("-------------------------------------------------------------------------");

        // 3️⃣ Creating Stream from List
        // List.stream() creates a Stream<T>
        List<String> names = List.of("Shubham", "Pandit", "Puri");
        Stream<String> stringStream = names.stream();
        System.out.println("List of String to Stream");
        stringStream.forEach(System.out::println);
        System.out.println("-------------------------------------------------------------------------");

        // 4️⃣ Creating Stream from Set
        // Set.stream() creates a Stream<T>
        Set<Integer> set = Set.of(8, 7, 9, 3, 5, 6, 1);
        System.out.println("Set of Integer to Stream");
        Stream<Integer> setStream = set.stream();
        setStream.forEach(System.out::println);
        System.out.println("-------------------------------------------------------------------------");

        // 5️⃣ Creating Infinite Stream using Stream.iterate()
        // Used to create a stream with a seed value and a function to compute next value
        System.out.println("Using Stream.iterate()");
        Stream<Integer> limit = Stream.iterate(0, i -> i + 1).limit(10); // generates 0 to 9
        limit.forEach(System.out::println);
        System.out.println("----------------------------------------------------------------------------");

        // 6️⃣ Creating Infinite Stream using Stream.generate()
        // Used to create an infinite stream of random numbers or constant values
        System.out.println("using Stream.generate()");
        Stream<Integer> generate = Stream.generate(() -> (int) (Math.random() * 100)).limit(10);
        generate.forEach(System.out::println);
        System.out.println("--------------------------------------------------------------------------------");

        // 7️⃣ Creating Stream using Stream.builder()
        // Best for manually building a stream step-by-step
        System.out.println("Using Stream.builder");
        Stream<String> builderStream = Stream.<String>builder()
                .add("shubham")
                .add("pandit")
                .add("puri")
                .add("pune")
                .build();
        builderStream.forEach(System.out::println);
        System.out.println("-----------------------------------------------------------");
    }
}
