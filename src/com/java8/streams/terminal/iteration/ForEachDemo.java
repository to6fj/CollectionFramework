package com.java8.streams.terminal.iteration;

import java.util.Arrays;
import java.util.List;

public class ForEachDemo
{
    /*
     * ========================= forEach() in Java Streams =========================
     *
     * 1. Definition:
     *    - forEach(Consumer<T> action) is a **terminal operation** in the Stream API.
     *    - It is used to **iterate** over each element of the stream and perform some action.
     *
     * 2. Functional Interface Used:
     *    - It accepts a **Consumer<T>** functional interface.
     *      Functional method: accept(T t) → takes one argument and returns nothing.
     *
     * 3. Key Points:
     *    - Since it's a terminal operation, after calling forEach(), the stream is consumed and cannot be reused.
     *    - The order of iteration depends on the type of stream:
     *         a) sequential stream → preserves encounter order.
     *         b) parallel stream → does NOT guarantee order.
     *
     * 4. Syntax:
     *      stream.forEach(element -> {
     *          // action for each element
     *      });
     *
     * 5. When to Use:
     *    - Useful for printing, logging, or performing side effects on elements.
     *    - Not recommended for modifying the original collection (can cause ConcurrentModificationException).
     *
     * 6. Difference from forEachOrdered():
     *    - forEachOrdered() preserves the order even in parallel streams.
     *    - forEach() may process elements in any order in parallel mode for performance gain.
     *
     * ==============================================================================
     */

    public static void main(String[] args) {
        List<String>names=List.of("shubham","pandit","puri","shrikant","navnath","surve");
        names.stream().forEach(System.out::println);
        System.out.println("-----------------------------------");
        //In parallelStream() with forEach() we can not assure ordered output
        names.parallelStream().forEach(System.out::println);
    }
}
