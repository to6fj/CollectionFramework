package com.java8.functionalinterface.exercise;

import java.util.function.Predicate;

/*
2.  Write a predicate to test if a string is empty or null.*/
public class Question2 {
    public static void main(String[] args) {
        Predicate<String>isEmpty=x->x.isEmpty();
        Predicate<String>isNull=x->x==null;
        Predicate<String>combineCheck=isEmpty.or(isNull);
        System.out.println(combineCheck.test(""));

    }
}
