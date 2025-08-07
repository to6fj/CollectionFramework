package com.java8.methodreference.exercise;
/*
8. Use BiFunction to refer to a static method that adds two numbers.
*/

import java.util.function.BiFunction;

public class Question8 {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer>sum=Question8::add;
        System.out.println(sum.apply(10,20));
    }
    public static  int add(int a, int b) {
        return a + b;
    }
}
