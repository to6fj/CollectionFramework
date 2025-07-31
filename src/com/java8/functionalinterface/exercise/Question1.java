package com.java8.functionalinterface.exercise;
/*
1.  Write a predicate to check if a number is even.
*/

import java.util.function.Predicate;

public class Question1 {
    public static void main(String[] args) {
        Predicate<Integer>isEven=x->x%2==0;
        System.out.println(isEven.test(4));
    }
}
