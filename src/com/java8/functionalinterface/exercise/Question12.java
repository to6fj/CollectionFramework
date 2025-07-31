package com.java8.functionalinterface.exercise;
/*
2.  Write a consumer to convert string to uppercase and print it.
*/

import java.util.function.Consumer;

public class Question12
{
    public static void main(String[] args) {
        String name="shubham pandit puri";
        Consumer<String>consume=x->{
            x=x.toUpperCase();
            System.out.println(x);
        };
        consume.accept(name);
    }
}
