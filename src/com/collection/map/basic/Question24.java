package com.collection.map.basic;

/*
24. Create a TreeMap to represent a leaderboard, with scores sorted in descending order.
*/

import java.util.*;

public class Question24 {
    public static void main(String[] args) {
        Map<String,Integer> stockMap = new TreeMap();
        stockMap.put("Virat Kohli", 123);
        stockMap.put("Rohit Sharma", 121);
        stockMap.put("Shubman Gill", 98);
        stockMap.put("KL Rahul", 110);
        stockMap.put("Hardik Pandya", 65);
        stockMap.put("Ravindra Jadeja", 45);
        stockMap.put("Shreyas Iyer", 88);
        stockMap.put("Suryakumar Yadav", 77);
        stockMap.put("Rishabh Pant", 90);
        stockMap.put("Jasprit Bumrah", 22);
        stockMap.put("Mohammed Shami", 30);
        Set<Map.Entry<String, Integer>> entrySet = stockMap.entrySet();
        List<Map.Entry<String, Integer>> list = new ArrayList<>(entrySet);
        list.sort((a,b)->-(Integer.compare(a.getValue(),b.getValue())));

//
        Map<String,Integer> stockMap2 = new LinkedHashMap<>();
        for(Map.Entry<String, Integer> entry:list){
            stockMap2.put(entry.getKey(),entry.getValue());
        }
        stockMap2.forEach((k,v)->{
            System.out.println(k+" "+v);
        });
    }
}
