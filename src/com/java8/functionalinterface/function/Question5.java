package com.java8.functionalinterface.function;
/*
5.Create a function that converts INR to USD (using a fixed rate).
*/

import java.util.function.Function;

public class Question5 {
    public static void main(String[] args) {
        Function<Double,Double>inrToDollar=x->x*84.80;
        System.out.println(inrToDollar.apply(8.80));
    }
}
