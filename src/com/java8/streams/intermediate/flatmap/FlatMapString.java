package com.java8.streams.intermediate.flatmap;

import java.util.Arrays;
import java.util.List;
//split sentence into words and combine all into single list of words
public class FlatMapString
{
    public static void main(String[] args) {
        List<String>list=List.of("Java is powerful","Java is high level language","Java supports multithreading environment");
        List<String> flatList = list.stream().flatMap(x -> Arrays.stream(x.split(" "))).toList();
        flatList.forEach(System.out::println);
    }
}
