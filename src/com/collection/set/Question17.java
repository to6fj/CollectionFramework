package com.collection.set;
/*
17. Count unique characters in a string using Set.
*/

import java.util.HashSet;
import java.util.Set;

public class Question17
{
    public static void main(String[] args) {
        String name="Banana";
        char []arr=name.toCharArray();
        Set<Character>set=new HashSet<>();
        for(char c:arr)
        {
            set.add(c);
        }
        System.out.println(set.size());
        set.forEach(System.out::println);
    }
}
