package com.collection.set;

/*
11. Compare two sets and retain common elements.
*/

import java.util.HashSet;

import java.util.Set;

public class Question11 {

    public static void main(String[] args) {

        Set<Integer> set1= new HashSet<Integer>();
        Set<Integer>set2=new HashSet<>();
        set1.add(2);
        set1.add(4);
        set1.add(6);
        set1.add(8);
        set1.add(10);
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);
        set2.add(8);

        Set<Integer>set3=new  HashSet<>(set2);
        set3.retainAll(set1);
        set3.forEach(System.out::println);
    }
}
