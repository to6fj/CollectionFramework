package com.java8.streams.terminal.reduction.collect;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsToSetDemo
{
    public static void main(String[] args) {
        Set<Integer>nums= Stream.of(1,2,3,4,5,6,7,8)
                .collect(Collectors.toSet());
        nums.add(9);
        nums.forEach(System.out::println);
    }
}
