package com.java8.functionalinterface.predicate;
/*
2. Use Predicate to check if a string is non-empty and starts with a specific letter.
*/

import java.util.function.Predicate;

public class Question2 {
    public static void main(String[] args) {
        Predicate<String>isEmpty=x->!x.isEmpty();
        Predicate<String> startsWithS=x->x.toLowerCase().startsWith("s");
        Predicate<String>combine=isEmpty.and(startsWithS);
        System.out.println(combine.test("Shubham"));
        System.out.println(combine.test(""));
        System.out.println(combine.test("Akshay"));
    }
}
