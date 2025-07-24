package com.collection.map.basic;

/*
14. Find the key with the maximum value in a map.
*/

import java.util.HashMap;
import java.util.Map;

public class Question14 {

    public  static  Integer maximumValue(Map<String, Integer> map) {

        Integer maximumValue=Integer.MIN_VALUE;
        String name="";
        for(Map.Entry<String,Integer>entry:map.entrySet()) {
            if(entry.getValue()>maximumValue) {
                name = entry.getKey();
                maximumValue=entry.getValue();
            }
        }
        System.out.println("Name:"+name);
        System.out.println("Maximum Value:"+maximumValue);
        return maximumValue;
    }

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Math", 88);
        map.put("Science", 99);
        map.put("English", 85);
        map.put("History", 79);
        map.put("Computer", 95);
        Integer maximumValue = maximumValue(map);
        System.out.println(maximumValue);

    }
}
