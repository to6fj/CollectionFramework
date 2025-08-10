package com.java8.streams.intermediate.sorted;

import java.util.List;

public class SortedStringLength
{
    public static void main(String[] args) {
        List<String>names=List.of("shubham","pandit","puri","shrikant","navnath","surve");
        List<String> list = names.stream().sorted((a, b) -> a.length() - b.length()).toList();
        list.forEach(System.out::println);
    }
}
