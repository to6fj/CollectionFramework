package com.java8.functionalinterface.exercise;

/*
4.  Write a supplier to generate OTP (6-digit random number).
*/

import java.util.function.Supplier;

public class Question19 {
    public static void main(String[] args) {
        Supplier<Integer>OTP=()->{
            return (int)((Math.random()*1000000)+1);
        };
        System.out.println(OTP.get());
        System.out.println(OTP.get());
        System.out.println(OTP.get());
        System.out.println(OTP.get());
        System.out.println(OTP.get());
        System.out.println(OTP.get());
    }
}
