package com.java8.functionalinterface.biconsumer;

import java.util.function.BiConsumer;

public class BiConsumerDemo {

    /*
     * ✅ BiConsumer Interface (java.util.function.BiConsumer<T, U>)
     * -----------------------------------------------------------------
     * ➤ It is a functional interface introduced in Java 8.
     * ➤ Represents an operation that takes **two input arguments** and returns nothing.
     * ➤ Abstract method: void accept(T t, U u)
     * ➤ Common use cases:
     *     - Printing or logging two related values (e.g., key-value)
     *     - Modifying two inputs
     *     - Working with Map.forEach()
     */

    public static void main(String[] args) {

        // ✅ Define a BiConsumer to print two strings with a space
        BiConsumer<String, String> biConsumer = (a, b) -> System.out.println(a + " " + b);

        // ✅ Apply the BiConsumer with two string inputs
        biConsumer.accept("Shubham", "Puri");  // Output: Shubham Puri
    }
}
