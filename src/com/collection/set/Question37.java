package com.collection.set;

/*
37. Capgemini – Find the first non-repeaƟng character in a string using Set and Map.
*/

import java.util.*;

public class Question37 {
    public static void main(String[] args) {
        String name="banana";
        Map<Character,Integer> map=new LinkedHashMap<Character,Integer>();
        for(char c:name.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
         for(Map.Entry<Character,Integer> e:map.entrySet())
         {
             if(e.getValue()==1)
             {
                 System.out.println(e.getKey()+" "+e.getValue());
             }
         }
        }
}
