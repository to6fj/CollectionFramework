package com.java8.functionalinterface.exercise;

/*
26.  Write a BinaryOperator to add two integers.
*/

import java.util.function.BinaryOperator;

public class Question26 {
    public static void main(String[] args) {
        BinaryOperator<Integer>operator=(a,b)->a+b;
        System.out.println(operator.apply(1,2));
    }
}
