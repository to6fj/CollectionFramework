package com.java8.functionalinterface.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/*
32. Convert a comma-separated string to a list of uppercase words.*/
public class Question30 {
    public static void main(String[] args) {
        Function<String,List<String>>stringListFunction=x->{
            String[] split = x.split(",");
            return Arrays.asList(split);
        };
        Function<String,String>upperCase=x->x.toUpperCase();
        Function<String, List<String>> compose = stringListFunction.compose(upperCase);
        List<String> apply = compose.apply("s,h,u,b,h,a,m");
        apply.forEach(System.out::println);

    }


}
