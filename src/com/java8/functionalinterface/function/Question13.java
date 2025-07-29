package com.java8.functionalinterface.function;

import java.util.function.Function;

/*
13. Chain funcƟons to:
o Trim a string
o Convert to lowercase
*//*
o Add "-done"*/
public class Question13 {
    public static void main(String[] args) {
        Function<String,String>trim=s->s.trim();
        Function<String,String>lowerCase=s->s.toLowerCase();
        Function<String,String>append=s->s+" Done";
        Function<String, String> chainFunction = trim.andThen(lowerCase).andThen(append);
        System.out.println(chainFunction.apply("John"));


    }
}
