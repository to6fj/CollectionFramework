package com.collection.map.scenario;

/*
 17. Identity Comparison - Show difference using new String("Java").
*/

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class Question17 {
    public static void main(String[] args) {
//        Map<String,String> map=new HashMap<>();
        Map<String,String> map=new IdentityHashMap<>();
        String s1=new String("Shubham");
        String s2=new String("Shubham");
        map.put(s1,"Puri");
        map.put(s2,"Chaudhari");
        System.out.println(map);

    }
}
