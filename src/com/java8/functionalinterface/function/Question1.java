package com.java8.functionalinterface.function;

/*
1.Write a Function<String, Integer> that returns the length of a given string.
*/

import java.util.function.Function;

public class Question1 {
    public static void main(String[] args) {
        Function<String,Integer>len=x->x.length();
        System.out.println(len.apply("shubham"));
    }
}
