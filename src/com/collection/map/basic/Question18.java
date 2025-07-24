package com.collection.map.basic;

/*
18. Merge two maps. If a key exists in both, sum the values.
*/

import java.util.HashMap;
import java.util.Map;

public class Question18 {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Apple", 10);
        map1.put("Banana", 20);
        map1.put("Orange", 30);
        map1.put("Watermelon", 40);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("Banana", 15);
        map2.put("BlackBerry", 120);
        map2.put("Orange", 25);
        map2.put("Grapes", 40);
        for(Map.Entry<String,Integer> entry:map1.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();
            if(map2.containsKey(key)){
                map2.put(key, map2.get(key) + value);
            }else {
                map2.put(key, value);
            }
        }
        map2.forEach((k,v)->{
            System.out.println(k+" "+v);
        });

    }
}
