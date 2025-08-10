package com.java8.streams.intermediate.sorted;

import java.util.List;

public class SortedDemo
{
    public static void main(String[] args) {
        List<Integer>mobileNum=List.of(8,7,9,3,5,6,9,6,3,1);
        List<Integer> sortedList = mobileNum.stream().sorted().toList();
        sortedList.forEach(System.out::println);
    }
}
