package com.java8.functionalinterface.function;
/*
20. Implement a FuncƟon<List<String>, Integer> that returns total character count.
*/

import java.util.List;
import java.util.function.Function;

public class Question20
{
    public static void main(String[] args) {
        Function<List<String>,Integer>charctersCount=x->{
            int sum=0;
            for(String a:x){
                sum+=a.length();
            }
            return sum;
        };
        System.out.println(charctersCount.apply(List.of("shubham","pandit","puri")));
    }
}
