package com.java8.functionalinterface.exercise;

/*
31.  Write a BiPredicate to check if sum of two numbers is even.
*/

import java.util.function.BiPredicate;

public class Question31 {
    public static void main(String[] args) {
        BiPredicate<Integer,Integer>isSumEven=(a,b)->(a+b)%2==0;
        System.out.println(isSumEven.test(1,223));
        System.out.println(isSumEven.test(2,223));
    }
}
