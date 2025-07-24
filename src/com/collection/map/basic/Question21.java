package com.collection.map.basic;
/*
21. Use compute(), computeIfAbsent(), and computeIfPresent() on a map.
*/

import java.util.HashMap;
import java.util.Map;

public class Question21 {
    public static void main(String[] args) {
        Map<String, Integer> stockMap = new HashMap<>();
        stockMap.put("Apple", 50);
        stockMap.put("Banana", 30);
        stockMap.compute("Apple1",(key,value)->value==null?0:value+20);
        stockMap.computeIfAbsent("Blueberry",(key)->20);
        stockMap.computeIfPresent("Apple",(key,value)->200);
        System.out.println(stockMap);
    }
}
