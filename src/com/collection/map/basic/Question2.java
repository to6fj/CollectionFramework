package com.collection.map.basic;

import java.util.HashMap;
import java.util.Map;

/*
2. Retrieve a value from the map using a given key.
*/
public class Question2
{
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"One");
        map.put(2,"Two");
        map.put(3,"Three");
        map.put(4,"Four");
        if(map.containsKey(1)){
            System.out.println(map.get(1));
        }
        if(map.containsValue("One"))
        {
            System.out.println("value exists");
        }
    }
}
