package com.java8.functionalinterface.exercise;

/*
16.  Write a supplier to return a random number.
*/

import java.util.function.Supplier;

public class Question16 {
    public static void main(String[] args) {
        Supplier<Integer>randomNumber=()->{
            return (int)((Math.random()*100)+1);
        };
        System.out.println(randomNumber.get());
        System.out.println(randomNumber.get());
        System.out.println(randomNumber.get());
        System.out.println(randomNumber.get());
    }
}
