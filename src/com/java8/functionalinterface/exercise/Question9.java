package com.java8.functionalinterface.exercise;

/*
4.  Convert a list of strings to their lengths using Function.
*/

import java.util.List;

public class Question9
{
    public static void main(String[] args) {
        List<String>names=List.of("shubham","shrikant","ajay","dhiraj","akash","akay");
        List<Integer> list = names.stream().map(x -> x.length()).toList();
        list.forEach(System.out::println);
    }
}
