package com.java8.streams.intermediate.distinct;

import java.util.List;

public class DistinctDemo
{
    public static void main(String[] args) {
        List<Integer>list=List.of(1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6);
        List<Integer> uniqueList = list.stream().distinct().toList();
        uniqueList.forEach(System.out::println);
    }
}

