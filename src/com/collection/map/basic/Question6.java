package com.collection.map.basic;

/*
6. Find the size of the map and clear all elements.
*/

import java.util.HashMap;
import java.util.Map;

public class Question6 {
    public  static Map<String, Integer> studentMarks = new HashMap<>(Map.ofEntries(
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
    ));
    public static void main(String[] args) {
        System.out.println(size());
        clear();
    }
    public static  void clear()
    {
        studentMarks.clear();
        System.out.println("Map is cleared");
    }
    public static int size()
    {
        return studentMarks.size();
    }
}
