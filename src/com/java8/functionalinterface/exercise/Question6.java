package com.java8.functionalinterface.exercise;

import java.util.function.Function;

/*
6.  Write a function that returns the length of a string.*/
public class Question6 {
    public static void main(String[] args) {
        Function<String,Integer>length=s->s.length();
        System.out.println(length.apply("shubham pandit puri"));
    }
}
