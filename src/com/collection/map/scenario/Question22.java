package com.collection.map.scenario;

/*
27. Convert Map to two Lists (keys and values).
*/

import java.util.*;

public class Question22 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("One",1);
        map.put("Two",2);
        map.put("Three",3);
        map.put("Four",4);
        map.put("Five",5);
        map.put("Six",6);
        map.put("Seven",7);
        map.put("Eight",8);
        List<String> list = map.keySet().stream().toList();
        List<Integer> list1 = map.values().stream().toList();

        List<String>keys=new ArrayList<>(map.keySet());
        List<Integer>values=new ArrayList<>(map.values());
        keys.forEach(System.out::println);
        values.forEach(System.out::println);
    }
}
