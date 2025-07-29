package com.java8.functionalinterface.predicate;

import java.util.Arrays;
import java.util.List;
/*
3. Filter a list of integers to keep only positive numbers using Predicate and Streams.
*/

public class Question3
{
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(1,2,3,4,5,6,7,8,9,10,-1,-12,-23,23,345,-40);
        List<Integer> list1 = list.stream().filter(x -> x > 0).toList();
        list1.forEach(System.out::println);
    }
}
