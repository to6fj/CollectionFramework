package com.collection.map.basic;
/*
20. Copy all mappings from one map to another using putAll().
*/

import java.util.HashMap;
import java.util.Map;

public class Question20 {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Banana", 20);
        map1.put("Orange", 30);
        map1.put("Watermelon", 40);
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("BlueBerry", 15);
        map2.put("Pineapple", 30);
        map2.put("Apple", 20);

        Map<String, Integer> map3 = new HashMap<>();
        map3.putAll(map1);
        map3.putAll(map2);
    }
}
