package com.collection.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
21. Remove duplicate integers from a List using HashSet.*/
public class Question21 {
    public static void main(String[] args) {
        List<Integer> list =List.of(1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10);
        Set<Integer> set = new HashSet<>(list);
        set.forEach(System.out::println);
    }
}
