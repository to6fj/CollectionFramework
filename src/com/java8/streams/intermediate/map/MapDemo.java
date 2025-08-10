package com.java8.streams.intermediate.map;

import java.util.List;

//map(): it will take function as an argument we can pass lambda rxpression also
//it is used to configure data of collection
//it will take one by one element from collection and perform operation
//provided in function
public class MapDemo
{
    public static void main(String[] args) {
        List<Integer>nums=List.of(8,7,9,3,5,6,9,6,3,1);
        List<Integer> oddNums = nums.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x + 1)
                .toList();
        oddNums.forEach(System.out::println);
    }
}
