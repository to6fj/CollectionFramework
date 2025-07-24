package com.collection.map.basic;
/*
8. Create a LinkedHashMap and observe the insertion order of elements.
*/

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Question8 {
    public static void main(String[] args) {
        Map<String,Integer> map=new LinkedHashMap<>();
        map.put("Alice",85);
        map.put("Bob",78);
        map.put("Jack",89);
        map.put("Alex",98);
        System.out.println(map);
    }
}
