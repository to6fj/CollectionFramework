package com.java8.functionalinterface.predicate;

/*
1. Write a Predicate to check if a number is even.
*/

import java.util.function.Predicate;

public class Question1 {
    public static void main(String[] args) {
        Predicate<Integer>isEven=x->x%2==0;
        System.out.println(isEven.test(12));
        System.out.println(isEven.test(11));
    }
}
