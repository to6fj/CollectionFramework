package com.java8.streams.terminal.reduction.collect.toMap;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsToMapOne
{
    public static void main(String[] args) {
        Map<String, Integer> map = Stream.of("Java", "Python", "Scala", "Ruby").collect(
                Collectors.toMap(x -> x, String::length)
        );
        map.forEach((key,value) -> System.out.println(key + ":" + value));
    }
}
