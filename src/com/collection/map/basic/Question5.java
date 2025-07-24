package com.collection.map.basic;

/*
5. Iterate over keys, values, and key-value pairs in a map.
*/

import java.util.Map;

public class Question5 {

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

        for(Map.Entry<String,Integer>entry:studentMarks.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
        studentMarks.forEach((k,v)->{
            System.out.println(k+":"+v);
        });
    }
}
