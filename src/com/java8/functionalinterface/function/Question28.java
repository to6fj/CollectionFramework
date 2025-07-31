package com.java8.functionalinterface.function;

import java.util.function.Function;

/*
28. Trim, lowercase, and remove digits from a string using a func on chain.*/
public class Question28 {
    public static void main(String[] args) {
        Function<String,String>trimString=x->x.trim();
        Function<String,String>lowerString=x->x.toLowerCase();
        Function<String,String>removeDigits=x->{
            StringBuilder builder=new StringBuilder();
            for(char c:x.toCharArray()){
                if(!Character.isDigit(c)){
                    builder.append(c);
                }
            }
            return builder.toString();

        };
        Function<String,String>result=trimString.andThen(lowerString).andThen(removeDigits);
        System.out.println(result.apply("  Shubham 123"));
    }
}
