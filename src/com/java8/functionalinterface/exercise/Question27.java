package com.java8.functionalinterface.exercise;

/*
27.  Write a BinaryOperator to find the maximum of two numbers.
*/

import java.util.function.BinaryOperator;

public class Question27 {
    public static void main(String[] args) {
        BinaryOperator<Integer>maxOfTwo=(a,b)->a>b?a:b;
        System.out.println(maxOfTwo.apply(111,22));
    }
}
