package com.collection.map.basic;
/*
7. Replace a value associated with a given key.
*/

import java.util.HashMap;
import java.util.Map;

public class Question7
{
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
        replace("Jack",89,100);
        studentMarks.forEach((key, value) -> System.out.println(key + ":" + value));
    }
    public static  void replace(String key,int oldValue,int newValue)
    {
        if(!studentMarks.containsKey(key))
        {
            System.out.println("key is not present inside map");
            return;
        }
        if(oldValue == newValue)
        {
            System.out.println("new value is same as old value");
            return;
        }
        boolean replace = studentMarks.replace(key, oldValue, newValue);
        if(replace)
        {
            System.out.println("replace successfully");
        }else {
            System.out.println("replace failed");
        }
    }
}
