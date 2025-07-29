package com.java8.functionalinterface.function;
/*
6.Create a Function<String, Boolean> that returns true if a string contains only digits.

*/

import java.util.function.Function;

public class Question6 {
    public static void main(String[] args) {
        Function<String,Boolean>isDigit=x->x.matches("\\d+");
        System.out.println(isDigit.apply("123"));
    }
}
