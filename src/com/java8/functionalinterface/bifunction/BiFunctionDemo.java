package com.java8.functionalinterface.bifunction;

import java.util.function.BiFunction;

public class BiFunctionDemo {

    /*
     * ✅ BiFunction Interface (java.util.function.BiFunction<T, U, R>)
     * ------------------------------------------------------------------
     * ➤ It is a functional interface introduced in Java 8.
     * ➤ Represents a function that takes **two input arguments** and returns a result.
     * ➤ Abstract method: R apply(T t, U u)
     * ➤ Type Parameters:
     *     - T: Type of the first argument
     *     - U: Type of the second argument
     *     - R: Return type of the result
     * ➤ Common use cases:
     *     - Combining or processing two values
     *     - Mathematical operations
     *     - String formatting, data merging
     */

    public static void main(String[] args) {

        // ✅ Define a BiFunction to add two integers
        BiFunction<Integer, Integer, Integer> biFunction = (x, y) -> x + y;

        // ✅ Apply the BiFunction with inputs 3 and 4
        System.out.println("Sum: " + biFunction.apply(3, 4));  // Output: 7
    }
}
