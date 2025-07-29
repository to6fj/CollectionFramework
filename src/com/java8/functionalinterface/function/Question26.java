package com.java8.functionalinterface.function;

/*
    26. Write a Function that calculates the ASCII sum of all characters in a string.
*/

import java.util.function.Function;

public class Question26 {
    public static void main(String[] args) {
        String name="shubham";
        Function<String,Integer>ascii=x->{
            int sum=0;
            for(char c:x.toCharArray()){
                sum+=(int)c;
            }
            return sum;
        };
        System.out.println(ascii.apply("shubham"));
    }
}
