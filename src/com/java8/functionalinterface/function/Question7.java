package com.java8.functionalinterface.function;
/*
7.Convert a full name "First Last" into initials using Function<String, String>.
*/

import java.util.function.Function;

public class Question7
{
    public static void main(String[] args) {
        Function<String,String>firstLastName=x->{
            StringBuilder sb=new StringBuilder();
            String []arr=x.split("\\W+");
            for(String s:arr)
            {
                sb.append(s.toUpperCase().charAt(0)).append(".");
            }
            return sb.toString();
        };
        System.out.println(firstLastName.apply("Shubham pandit puri"));
    }
}
