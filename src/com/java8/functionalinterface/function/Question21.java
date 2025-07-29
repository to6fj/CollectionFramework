package com.java8.functionalinterface.function;
/*
21. Convert a list of names to iniƟals using FuncƟon with Stream API.
*/

import java.util.Arrays;
import java.util.List;

public class Question21 {
    public static void main(String[] args) {
        List<String>names= Arrays.asList("shubham","pandit","puri");
        List<Character> list = names.stream().map(c -> c.toUpperCase().charAt(0)).toList();
        System.out.println(list);
    }
}
