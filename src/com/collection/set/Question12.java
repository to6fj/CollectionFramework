package com.collection.set;
/*
12. Create a union of two HashSets.
*/

import java.util.HashSet;
import java.util.Set;

public class Question12
{
    public static void main(String[] args) {
        Set<Integer> set=Set.of(1,2,3,4,5,6,7,8,9,10);
        Set<Integer>set2=Set.of(11,12,13,14,15,16,17,18,19,20,21,22);
        Set<Integer>set3=new HashSet<>(set);
        set3.addAll(set2);
        set3.forEach(System.out::println);
    }
}
