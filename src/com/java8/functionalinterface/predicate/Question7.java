package com.java8.functionalinterface.predicate;
/*
7. Use Predicate.negate() to filter out even numbers from a list.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Question7
{
    public static void main(String[] args) {
        List<Integer> list= Stream.of(1,2,3,4,5,6,7,8,9,10).toList();
        List<Integer>evenNumbers=list.stream().filter(x->x%2==0).toList();
        evenNumbers.forEach(System.out::println);
    }
}
