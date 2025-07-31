package com.java8.functionalinterface.consumer;

import java.util.Map;
import java.util.function.Consumer;

public class ConsumerDemo {
    /*
     * ✅ Consumer Interface (java.util.function.Consumer<T>)
     * --------------------------------------------------------
     * ➤ It is a functional interface introduced in Java 8.
     * ➤ Represents an operation that takes a single input and returns no result.
     * ➤ Abstract method: void accept(T t)
     * ➤ It is mainly used for:
     *      - Iterating over collections
     *      - Printing values
     *      - Updating objects in-place
     * ➤ Commonly used with forEach() in streams or collections.
     */

    public static void main(String[] args) {

        // ✅ Define a Consumer to print key-value pairs from a Map
        Consumer<Map<String, String>> consumer = x -> {
            for (Map.Entry<String, String> entry : x.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        };

        // ✅ Create a Map to supply to the consumer
        Map<String, String> map = Map.of(
                "1", "One",
                "2", "Two",
                "3", "Three"
        );

        // ✅ Apply the consumer to print the map entries
        consumer.accept(map);
    }
}
