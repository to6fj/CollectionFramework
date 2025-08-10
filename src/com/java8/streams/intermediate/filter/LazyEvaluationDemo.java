package com.java8.streams.intermediate.filter;

import java.util.List;

public class LazyEvaluationDemo
{
    public static void main(String[] args) {
        List<String>name=List.of("Shubham","Pandit","Puri","Shrikant","Surve");
        name.stream().filter(x->{
            System.out.println(x);
           return x.length()>5;
        });
        long count = name.stream().filter(x -> {
            System.out.println(x);
            return x.length() > 5;
        }).count();
        System.out.println(count);
        System.out.println("end of main");

    }
}
