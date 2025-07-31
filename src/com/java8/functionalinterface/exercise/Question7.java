package com.java8.functionalinterface.exercise;

/*
2.  Write a function to convert Celsius to Fahrenheit.
*/

import java.util.function.Function;

public class Question7 {
    public static void main(String[] args) {
        Function<Double,Double>celciusToFarheneit=x->{
            double f=(x*(5/9))+32;
            return f;
        };
        System.out.println(celciusToFarheneit.apply(13.2));
    }
}
