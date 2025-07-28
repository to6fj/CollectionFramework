package com.collection.set;

/*
16. Sort a HashSet using TreeSet.
*/

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Question16 {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<=50;i++)
        {
            set.add(i);
        }
        set.forEach(System.out::println);
        System.out.println("--------------------------------------------");
        Set<Integer>set2=new TreeSet<>(set);
        set2.forEach(System.out::println);
    }
}
