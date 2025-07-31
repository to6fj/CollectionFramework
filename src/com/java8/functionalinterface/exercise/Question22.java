package com.java8.functionalinterface.exercise;

/*
22.  Write a UnaryOperator to reverse a string.
*/

import java.util.function.UnaryOperator;

public class Question22 {
    public static void main(String[] args) {
        UnaryOperator<String>reverse=x->{
            StringBuilder builder=new StringBuilder();
            for(int i=x.length()-1;i>=0;i--){
                builder.append(x.charAt(i));
            }
            return builder.toString();
        };
        System.out.println(reverse.apply("madam1"));
    }
}
