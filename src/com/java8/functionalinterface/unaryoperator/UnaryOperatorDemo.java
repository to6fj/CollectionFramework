package com.java8.functionalinterface.unaryoperator;

import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {

    /*
     * ✅ UnaryOperator Interface (java.util.function.UnaryOperator<T>)
     * ---------------------------------------------------------------------
     * ➤ It is a functional interface introduced in Java 8.
     * ➤ Child of the Function<T, R> interface where T = R.
     * ➤ Abstract method: T apply(T t)
     * ➤ It takes one input of type T and returns the same type T**.
     *
     * 🔄 Common Use Cases:
     *  - Perform transformation or operation on a single value.
     *  - Useful for simple calculations (e.g., square, increment).
     *  - Perfect for chaining in streams and pipelines.
     */

    public static void main(String[] args) {

        // ✅ Define UnaryOperator to square a number
        UnaryOperator<Integer> unaryOperator = i -> i * i;

        // ✅ Apply the operator to the value 14
        System.out.println("Square of 14 is: " + unaryOperator.apply(14));  // Output: 196
    }
}
