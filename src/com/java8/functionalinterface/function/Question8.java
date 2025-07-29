package com.java8.functionalinterface.function;

import java.util.function.Function;

/*
Create a generic method: and use it to convert strings to uppercase.*/
public class Question8
{
    public static void main(String[] args) {
        String shubham = apply("shubham", x -> x.toUpperCase());
        System.out.println(shubham);
    }
    public static <T,R> R apply(T t, Function<T,R> f) {
        return f.apply(t);
    }
}
