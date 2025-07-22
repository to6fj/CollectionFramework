package com.collection.map.basic;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//1. Create a HashMap to store student names (String) and their marks (Integer). Add 5 entries and print them.
public class Question1
{

    public static void main(String[] args)
    {
        Map<String,Integer>map=new HashMap<>();
        map.put("Shubham Pandit Puri",78);
        map.put("Shubham Balu Chaudhari",98);
        map.put("Shrikant Navnath Surve",100);
        Set<Map.Entry<String,Integer>> entrySet= map.entrySet();
        map.forEach((key,value)-> System.out.println(key+":"+value));
        for(Map.Entry<String,Integer> entry:entrySet)
        {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}
