package com.java8.streams.intermediate.filter;

import java.util.List;

public class FilterDemo
{
    public static void main(String[] args) {
        List<Integer>nums=List.of(8,7,9,3,5,6,9,6,3,1);
        List<Integer> evenList = nums.stream()
                .filter(x -> x % 2 == 0)
                .toList();
        evenList.forEach(System.out::println);
    }
}
