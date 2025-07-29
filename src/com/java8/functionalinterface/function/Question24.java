package com.java8.functionalinterface.function;

/*
24. Sort a list of strings by length using FuncƟon and Comparator.
*/


import java.util.Arrays;
import java.util.List;

public class Question24 {
    public static void main(String[] args) {
        List<String>names= Arrays.asList("shubham","pandit","purishubham");
        List<String> list = names.stream().sorted((a, b) -> -(a.length() - b.length())).toList();
        list.forEach(System.out::println);
    }
}
