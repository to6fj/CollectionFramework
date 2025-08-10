package com.java8.streams.terminal.reduction.reduce;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public class ReduceMethodTwo
{
    /*
     * ======================== reduce(BinaryOperator<T> accumulator) ========================
     *
     * Method Signature:
     *     Optional<T> reduce(BinaryOperator<T> accumulator)
     *
     * PARAMETERS:
     *  - accumulator:
     *      Functional interface: BinaryOperator<T> (extends BiFunction<T,T,T>)
     *      Method: apply(T t1, T t2) → combines two elements into one.
     *
     * CHARACTERISTICS:
     *  1. No identity value is provided.
     *  2. If the stream is empty → returns **Optional.empty()** (no value present).
     *  3. If the stream has only one element → returns that element wrapped in Optional.
     *  4. If the stream has multiple elements → accumulator is applied in sequence to reduce to one value.
     *
     * WHY Optional<T>?
     *  - Without identity, there's a chance of no result (empty stream), so Java wraps the result in Optional to avoid NullPointerException.
     *
     * COMMON USE CASES:
     *  - Finding sum, product, max, min, or concatenating strings when identity is not required.
     *
     * =========================================================================================
     */

    public static void main(String[] args) {

        // Example list with values
        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Example empty list
        List<Integer> nums2 = new ArrayList<>();

        // Multiplication of all numbers in nums
        Optional<Integer> multiplication = nums.stream()
                .reduce((x, y) -> x * y);

        // Using Optional.get() directly (safe here because stream is non-empty)
        System.out.println("Product of nums: " + multiplication.get());

        // Handling empty list safely
        try {
            Optional<Integer> res = nums2.stream()
                    .reduce((x, y) -> x * y);

            if (res.isPresent()) {
                System.out.println("Product of nums2: " + res.get());
            } else {
                System.out.println("Result is empty: " + res.isEmpty());
                System.out.println("List is empty");
            }
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }
}
