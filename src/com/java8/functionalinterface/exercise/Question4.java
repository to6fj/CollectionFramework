package com.java8.functionalinterface.exercise;

/*
4.  Filter a list of integers to get only even numbers using Predicate.
*/

import java.util.List;

public class Question4 {
    public static void main(String[] args) {
        List<Integer>numbers=List.of(1, 2, 3, 4, 5, 6, 7, 8, 9,10,11,12);
        List<Integer> list = numbers.stream().filter(x -> x % 2 == 0).toList();
        list.forEach(System.out::println);
    }
}
