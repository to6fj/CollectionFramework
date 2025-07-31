package com.java8.functionalinterface.exercise;

/*
3.  Chain two consumers using `andThen()` to print name and its length.
*/

import java.util.function.Consumer;

public class Question13
{
    public static void main(String[] args) {
        Consumer<String>name=x-> System.out.println(x);
        Consumer<String>lenghtOfNAme=x-> System.out.println(x.length());
        Consumer<String> stringConsumer = name.andThen(lenghtOfNAme);
        stringConsumer.accept("Shubham");
    }
}
