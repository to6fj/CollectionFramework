package com.java8.streams.intermediate.limit;

import java.util.List;
import java.util.stream.Stream;

public class LimitDemo
{
    public static void main(String[] args) {
        List<Integer> integers = Stream.iterate(1, x -> x + 1).limit(100).toList();
        integers.forEach(System.out::println);
    }
}
