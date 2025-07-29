package com.interview;
/*
37. Capgemini – Find the first non-repeaƟng character in a string using Set and Map.
*/

import java.util.LinkedHashMap;
import java.util.Map;

public class Question37
{
    public static void main(String[] args) {
        String name="shubham";
        Map<Character,Integer> map=new LinkedHashMap<>();
        for(char c:name.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet())
        {
            if(entry.getValue()==1)
            {
                System.out.println(entry.getKey()+" Is First Not Repeating character");
                break;
            }
        }
        System.out.println(map);
    }
}
