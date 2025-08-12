package com.java8.streams.terminal.reduction.collect;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsToSetDemo {
    public static void main(String[] args) {

        // ===== Mutable Set Example =====
        // Collectors.toSet() (Java 8+)
        // - Returns a MUTABLE Set (usually a HashSet)
        // - Elements are unique (duplicates removed automatically)
        // - You can add/remove elements after creation
        Set<Integer> nums = Stream.of(1, 2, 3, 4, 5, 6, 7, 8)
                .collect(Collectors.toSet()); // mutable set

        nums.add(9); // ✅ Works, set is mutable
        nums.forEach(System.out::println);


        // ===== Immutable (Unmodifiable) Set Example =====
        // Collectors.toUnmodifiableSet() (Java 10+)
        // - Returns an IMMUTABLE set
        // - No modification allowed after creation
        // - Attempting add/remove/update will throw UnsupportedOperationException
        Set<Integer> unmodifiableSet = Stream.of(1, 2, 3, 4, 5, 6, 7, 8)
                .collect(Collectors.toUnmodifiableSet()); // immutable set

        unmodifiableSet.forEach(System.out::println);

        // ❌ This will cause runtime error:
        // unmodifiableSet.add(9);
    }
}
