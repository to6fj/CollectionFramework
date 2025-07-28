package com.collection.set;

/*
22. Convert a Set to List and vice versa.
*/

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Question22 {
    public static void main(String[] args) {
        List<Integer> list =List.of(1,2,3,4,5,6,7,8,9,10);
        Set<Integer> set = new HashSet<>(list);
        List<Integer> list1 = new ArrayList<>(set);
        set.forEach(System.out::println);
        System.out.println("------------------------------------------------------------");
        list1.forEach(System.out::println);
    }
}
