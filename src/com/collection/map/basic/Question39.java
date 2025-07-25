package com.collection.map.basic;

import java.util.HashMap;
import java.util.Map;

/*
39. Create a frequency counter for any data type using Generics and Map<K, Integer>.
*/
public class Question39 {
    public static <K>Map<K,Integer>frequnecyCounter(K []array){
        Map<K,Integer> map=new HashMap<>();
        for(K word:array){
            map.put(word,map.getOrDefault(word,0)+1);
        }
        return map;
    }
    public static void main(String[] args) {
        Map<Integer, Integer> integerIntegerMap = frequnecyCounter(new Integer[]{1,1,1,1, 2, 3, 4, 5, 1, 2, 3, 4, 5});
        System.out.println(integerIntegerMap);
    }
}
