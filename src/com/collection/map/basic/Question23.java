package com.collection.map.basic;

/*
23. Detect duplicate entries across two maps.
*/

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Question23 {
    public static void main(String[] args) {
        Map<String, Integer> stockMap = new HashMap<>();
        stockMap.put("Apple",20);
        stockMap.put("Blueberry",20);
        stockMap.put("Banana",20);
        stockMap.put("Orange",20);
        Map<String, Integer> stockMap2 = new HashMap<>();
        stockMap2.put("Nokia",20);
        stockMap2.put("Pear",20);
        stockMap2.put("Grapes",20);
        stockMap2.put("Iphone",20);
        Map<String, Integer> stockMap3 = new HashMap<>();
        stockMap3.putAll(stockMap);
        stockMap3.putAll(stockMap2);
        stockMap.forEach( (k,v)->{
            System.out.println(k+" "+v);
        });
    }
}
