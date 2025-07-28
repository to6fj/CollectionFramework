package com.collection.set;

/*
18. Remove duplicate characters from a string using Set.
*/

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class Question18 {

    public static void main(String[] args) {
        String names="Apple";
        Set<Character>set2=new HashSet<>();
        for(char c:names.toCharArray()){
            set2.add(c);
        }
        StringBuilder sbb=new StringBuilder();
        for(char c:set2)
        {
            sbb.append(c);
        }
        System.out.println(sbb);
        System.out.println("-----------------------------------");
        set2.forEach(System.out::println);
    }
}
