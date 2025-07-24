package com.collection.map.basic;

/*
3. Check if a specific key or value exists in the map.
*/

import java.util.HashMap;
import java.util.Map;

public class Question3 {
    public static Map<Integer, String> map = new HashMap<>();
    public static void main(String[] args) {
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");
        if(isKeyPresent(4))
        {
            System.out.println("key exists");
        }else {
            System.out.println("key not exists");
        }
        if(isValuePresent("One"))
        {
            System.out.println("value exists");
        }else {
            System.out.println("value not exists");
        }
    }
    public static boolean isKeyPresent(Integer key)
    {
        return map.containsKey(key);
    }
    public static boolean isValuePresent(String value)
    {
      return map.containsValue(value);
    }
}
