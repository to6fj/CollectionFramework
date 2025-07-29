package com.interview;
/*
40. Accenture – Write a funcƟon to check if all characters in a string are unique.
*/

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Question40 {
    public static void main(String[] args) {
        String name="abcde";
        Map<Character,Integer> map=new HashMap<>();
        for(char c:name.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()!=1)
            {
                System.out.println("Given String does not have unique characters");
                return;
            }
        }
        System.out.println("Given string have all unique characters");
    }
}
