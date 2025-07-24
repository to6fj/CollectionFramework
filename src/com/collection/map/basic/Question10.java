package com.collection.map.basic;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Question10
{
    public static void main(String[] args) {
        Map<String, Integer> studentMarks = Map.ofEntries(
                Map.entry("Alice", 85),
                Map.entry("Bob", 78),
                Map.entry("Charlie", 92),
                Map.entry("David", 67),
                Map.entry("Eve", 88),
                Map.entry("Frank", 74),
                Map.entry("Grace", 90),
                Map.entry("Hannah", 80),
                Map.entry("Ian", 76),
                Map.entry("Jack", 89)
        );

        Integer shubhamValue = studentMarks.getOrDefault("Ian", Integer.MIN_VALUE);
        if(shubhamValue != Integer.MIN_VALUE) {
            System.out.println("given key is present and associated value is " + shubhamValue);
        }else {
            System.out.println("Given key is not present default value is " + shubhamValue);
        }
    }
}
