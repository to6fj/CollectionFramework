package com.java8.functionalinterface.predicate;

import java.util.function.Predicate;

// -------------------------------------------------------------------------
//  PREDICATE FUNCTIONAL INTERFACE – Java 8
// -------------------------------------------------------------------------

//  Predicate<T> is a functional interface present in java.util.function package
//  It represents a condition (boolean-valued function) on a single argument
//  It is mostly used for filtering or validating data in Streams, Collections, etc.

//  Functional Interface = Interface with ONLY ONE abstract method
//    (Java 8 allows default/static methods too)

//  @FunctionalInterface annotation (optional but recommended):
//    Ensures the interface conforms to the functional interface rule
//     if more than one abstract method exists, it will give Compile-Time Error

public class PredicateDemo {

    public static void main(String[] args) {

        // -------------------------------------------------------------
        //  Example 1: Check if a number is EVEN using Predicate
        // -------------------------------------------------------------
        Predicate<Integer> isEven = x -> x % 2 == 0;

        // ✅ test(T t) method returns true/false based on condition
        System.out.println(isEven.test(2));   // true (even)
        System.out.println(isEven.test(13));  // false (odd)
    }
}
