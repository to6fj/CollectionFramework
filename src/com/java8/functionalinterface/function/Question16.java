package com.java8.functionalinterface.function;
/*
16. Write a funcƟon to count vowels in a string.
*/

import java.util.function.Function;

public class Question16
{
    public static void main(String[] args) {
        Function<String,Integer>countVowels=x->{
            int count=0;
            for(char c:x.toLowerCase().toCharArray())
            {
                if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
                    count++;
            }
            return count;
        };
        System.out.println(countVowels.apply("Shubham Pandit Puri"));
    }
}
