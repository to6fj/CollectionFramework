package com.collection.map.basic;

/*
9. Demonstrate the use of putIfAbsent() method.
*/

import java.util.HashMap;
import java.util.Map;

public class Question9 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Amey",89);
        map.put("Alex",98);
        map.put("James",89);
        map.put("Shrikant",99);
        map.put("Shubham Chaudhari",100);

        //if the given key is not present inside map already then this method will return null
        //if key is associated with some value then it will return old value that is associated with key and does not update it
        Integer alex = map.putIfAbsent("Alex1", 98);
        System.out.println(alex);
    }
}
