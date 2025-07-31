package com.java8.functionalinterface.binaryoperator;

import java.util.function.BinaryOperator;

public class BinaryOperatorDemo {

    /*
     * ✅ BinaryOperator Interface (java.util.function.BinaryOperator<T>)
     * ---------------------------------------------------------------------
     * ➤ Functional interface introduced in Java 8.
     * ➤ Child of BiFunction<T, T, T> — takes 2 inputs of the same type and returns the same type.
     * ➤ Abstract method: T apply(T t1, T t2)
     * ➤ Use when:
     *     - Both inputs and the output are of the same type.
     *     - Performing operations like addition, multiplication, merging, etc.
     */

    public static void main(String[] args) {

        // ✅ BinaryOperator to add two integers
        BinaryOperator<Integer> add = (a, b) -> a + b;

        // ✅ BinaryOperator to find the maximum of two numbers
        BinaryOperator<Integer> max = (a, b) -> (a > b) ? a : b;

        // ✅ Test the operations
        System.out.println("Sum: " + add.apply(10, 20));       // Output: 30
        System.out.println("Max: " + max.apply(10, 20));       // Output: 20
    }
}
