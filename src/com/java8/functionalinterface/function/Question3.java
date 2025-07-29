package com.java8.functionalinterface.function;

import java.util.function.Function;

/*
Convert a Function<String, String> to return the string in uppercase.
*/
public class Question3
{
    public static void main(String[] args) {
        Function<String,String>uppercase=x->x.toUpperCase();
        System.out.println(uppercase.apply("shubham"));
    }
}
