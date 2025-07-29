package com.java8.functionalinterface.function;

import java.util.function.Function;

/*
17. Capitalize the first leƩer of each word in a sentence.*/
public class Question17 {
    public static void main(String[] args) {
        String sen="shubham pandit puri";
        Function<String,String>capitalize=x->{
            String []words=x.split("\\W+");
            StringBuilder sb=new StringBuilder();
            for(String word:words)
            {
                sb.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
            }
            return sb.toString().trim();
        };
        System.out.println(capitalize.apply(sen));
    }
}
