package com.java8.functionalinterface.function;

/*
9. Parse a list of numeric strings to integers using FuncƟon and Stream API.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Question9
{
    public static void main(String[] args) {
        List<String> numericStrings = Arrays.asList("10","25","300","42","75","88","123","999","0","7");
        List<Integer> list = numericStrings.stream().map(x -> Integer.parseInt(x)).toList();
        list.forEach(System.out::println);


    }
}
