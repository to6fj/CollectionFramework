package com.java8.functionalinterface.function;

/*
4.Write a function that takes a string and returns its reversed version.

*/

import java.util.function.Function;

public class Question4
{
    public static void main(String[] args) {
        Function<String,String>reverse=x->{
            StringBuilder sb=new StringBuilder();
            for(int i=x.length()-1;i>=0;i--)
            {
                sb.append(x.charAt(i));
            }
            return sb.toString();
        };
        System.out.println(reverse.apply("and"));
    }
}
