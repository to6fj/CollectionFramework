package com.java8.streams.intermediate.sorted;

import java.util.Comparator;
import java.util.List;

public class SortedString
{
    public static void main(String[] args) {
        List<String>names=List.of("Shubham","sejal","Pandit","Puri","Shrikant","Navnath","Surve");
        List<String> list = names.stream().sorted(Comparator.comparing(String::toLowerCase)).toList();
        list.forEach(System.out::println);
    }
}
