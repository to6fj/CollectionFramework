package com.java8.functionalinterface.exercise;

/*
11.  Write a UnaryOperator to square a number.
*/

import java.util.function.UnaryOperator;

public class Question21 {
    public static void main(String[] args) {
        UnaryOperator<Integer>square = x -> x * x;
        System.out.println(square.apply(10));
    }
}
