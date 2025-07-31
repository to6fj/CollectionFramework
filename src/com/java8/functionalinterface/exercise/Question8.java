package com.java8.functionalinterface.exercise;

/*
3.  Chain functions using `andThen()` and `compose()` to calculate square and then double the value.
*/

import java.util.function.Function;

public class Question8 {
    public static void main(String[] args) {
        Function<Integer,Integer>square=x->x*x;
        Function<Integer,Integer>doubleValue=x->2*x;
        Function<Integer, Integer> andThen = square.andThen(doubleValue);
        Function<Integer,Integer>compose=square.compose(doubleValue);
        System.out.println(andThen.apply(2));//8
        System.out.println(compose.apply(2));//16
    }
}
