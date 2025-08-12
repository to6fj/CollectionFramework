package com.java8.streams.terminal.reduction.collect.toMap;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectToMapTwo
{
    public static void main(String[] args) {
        Stream.of("Java", "Python", "Scala", "Ruby","Kotlin").collect(
                Collectors.toMap(String::length, x -> x,(oldKey,newKey) ->"("+oldKey+","+newKey+")")
        ).forEach((key,value) -> System.out.println(key + ":" + value));
    }
}
