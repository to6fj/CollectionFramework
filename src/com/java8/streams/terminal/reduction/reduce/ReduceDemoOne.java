package com.java8.streams.terminal.reduction.reduce;

import java.util.List;
public class ReduceDemoOne
{
    /*
     * ============================= reduce() in Java Streams =============================
     *
     * Method Signature (1st Overload):
     *     public T reduce(T identity, BinaryOperator<T> accumulator)
     *
     * PARAMETERS:
     *  1. identity:
     *     - Initial value (seed) for the reduction.
     *     - If the stream is empty, this identity value is returned directly.
     *     - Acts as a starting point for the accumulation process.
     *
     *  2. accumulator:
     *     - A **BinaryOperator<T>** functional interface.
     *     - Functional method: apply(T t1, T t2) → combines two elements into one.
     *     - Defines how two elements are combined to form the result.
     *
     * WORKING:
     *  - Stream elements are processed one by one, starting with the identity value.
     *  - For each element, accumulator is applied: result = accumulator.apply(result, element).
     *
     * CHARACTERISTICS:
     *  - This is a **terminal operation** (consumes the stream).
     *  - Returns the reduced result directly (not wrapped in Optional for this overload).
     *  - Works in both sequential and parallel streams.
     *
     * USE CASES:
     *  - Summation, multiplication, finding max/min, concatenating strings, etc.
     *
     * OTHER OVERLOADS:
     *  1) Optional<T> reduce(BinaryOperator<T> accumulator) → no identity, returns Optional.
     *  2) <U> U reduce(U identity, BiFunction<U, ? super T, U> accumulator, BinaryOperator<U> combiner)
     *
     * ================================================================================
     */

    public static void main(String[] args) {

        List<Integer> mobileNumber = List.of(8, 7, 9, 3, 5, 6, 9, 6, 3, 1);

        // Example: Sum of all digits in the mobile number
        Integer sumOfMobileNumber = mobileNumber.stream()
                .reduce(0, (x, y) -> x + y);

        System.out.println("Sum of Mobile Number Digits: " + sumOfMobileNumber);
    }
}
