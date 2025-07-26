package com.collection.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/*
7.	Convert a HashSet to an array.
*/
public class Question7 {
 
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(9);
        set.add(10);
        Object[] array = set.toArray();
        for(Object x:array)
        {
            Integer x1 = (Integer)x;
            System.out.println(x1);
        }
    }
}
