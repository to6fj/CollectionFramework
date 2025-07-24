package com.collection.map.basic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/*
22. Create a case-insensitive word counter using TreeMap with custom Comparator.
*/
public class Question22 {
    public static void main(String[] args) {
        Map<String,Integer> map1 = new TreeMap<>();
        String text = "This is a Sample sentence. This sample is just for testing!";
        String[] words = text.split("\\W+");
        for(String word:words){
            int count=1;
            word=word.toLowerCase();
            if(map1.containsKey(word)){
                count=map1.get(word);
                map1.put(word,count+1);
            }else {
                map1.put(word,count);
            }
        }
        map1.forEach((k,v)->{
            System.out.println(k+" "+v);
        });
    }
}
