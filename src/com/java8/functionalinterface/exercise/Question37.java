package com.java8.functionalinterface.exercise;

/*
    37.  Write a BiConsumer to concatenate and print two strings.
*/

import java.util.function.BiConsumer;

public class Question37 {
    public static void main(String[] args) {

        BiConsumer<String,String> biConsumer = (a,b)->{
            System.out.println(a+b);
        };
        biConsumer.accept("shubham"," Puri");
    }
}
