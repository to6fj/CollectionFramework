package com.java8.functionalinterface.function;

/*
15. Count the number of words in a sentence using FuncƟon<String, Integer>.
*/

import java.util.function.Function;

public class Question15{
    public static void main(String[] args) {
        Function<String,Integer>noOfWords=x->x.split("\\W+").length;
        System.out.println(noOfWords.apply("Shubham Pandit Puri"));
    }
}
