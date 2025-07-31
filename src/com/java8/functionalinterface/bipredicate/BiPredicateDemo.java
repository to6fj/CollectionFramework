package com.java8.functionalinterface.bipredicate;

import java.util.function.BiPredicate;

public class BiPredicateDemo {

    /*
     * ✅ BiPredicate Interface (java.util.function.BiPredicate<T, U>)
     * ----------------------------------------------------------------
     * ➤ It is a functional interface introduced in Java 8.
     * ➤ Represents a predicate (boolean-valued function) with **two input parameters**.
     * ➤ Abstract method: boolean test(T t, U u)
     * ➤ Common use cases:
     *     - Comparing two values
     *     - Validating two inputs
     *     - Conditional checks based on two arguments
     */

    public static void main(String[] args) {

        // ✅ BiPredicate to check if the sum of two numbers is even
        BiPredicate<Integer, Integer> isEvenSum = (a, b) -> (a + b) % 2 == 0;

        // ✅ Test the predicate with input values 1 and 5
        System.out.println("Is sum even? " + isEvenSum.test(1, 5));  // Output: true
    }
}
