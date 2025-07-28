package com.collection.set;

/*
14. Remove all elements of one set from another.
*/

import java.util.HashSet;
import java.util.Set;

public class Question14 {
    public static void main(String[] args) {
        Set<Integer> set1=new  HashSet<>();
        for(int i=1;i<=10;i++)
        {
            set1.add(i);
        }
        Set<Integer> set2=Set.of(2,4,6,8,10);
        set1.removeAll(set2);
        set1.forEach(System.out::println);
    }
}
