package com.java8.functionalinterface.function;

import java.util.function.Function;

/*Create a Function<Integer, Integer> that returns the square of a number.*/
public class Question2 {
    public static void main(String[] args) {
        Function<Integer,Integer>square=x->x*x;
        System.out.println(square.apply(5));
    }
}
