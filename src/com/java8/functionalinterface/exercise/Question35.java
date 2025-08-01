package com.java8.functionalinterface.exercise;

/*
    35.  Filter pairs from two lists where the first number is divisible by the second.
*/

import java.util.function.BiPredicate;

public class Question35 {
    public static void main(String[] args) {
        BiPredicate<Integer,Integer>condition=(a,b)->a%b==0;
        System.out.println(condition.test(1,2));
        System.out.println(condition.test(10,2));
    }
}
