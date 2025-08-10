package com.java8.streams.terminal.reduction.collect;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsToListDemo {
    public static void main(String[] args) {

        // ===== Mutable List Example =====
        // Collectors.toList() (Java 8+) returns a MUTABLE list (usually ArrayList)
        // You can add, remove, or update elements after creation
        List<Integer> mutableList = Stream.iterate(1, x -> x + 1)
                .limit(10) // generates 1 to 10
                .collect(Collectors.toList()); // mutable list

        mutableList.add(11); // ✅ Works, because list is mutable
        mutableList.forEach(System.out::println); // prints 1..10 and then 11


        // ===== Immutable List Example =====
        // Stream.toList() (Java 16+) returns an UNMODIFIABLE list
        // Any attempt to modify it will throw UnsupportedOperationException
        List<Integer> immutableList = Stream.of(1, 2, 3, 4, 5)
                .toList(); // immutable list

        immutableList.add(10); // ❌ Throws UnsupportedOperationException
        // This line will cause runtime error and stop execution
    }
}
