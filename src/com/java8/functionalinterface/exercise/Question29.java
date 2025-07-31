package com.java8.functionalinterface.exercise;
/*
29.  Concatenate two strings using BinaryOperator.
*/

import java.util.function.BinaryOperator;

public class Question29
{
    public static void main(String[] args) {
        BinaryOperator<String>concat=(a,b)->a+b;
        System.out.println(concat.apply("a"," b"));

    }
}
