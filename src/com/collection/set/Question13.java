package com.collection.set;

/*
13. Create an intersecƟon of two HashSets.
*/

import java.util.*;

public class Question13 {
    public static void main(String[] args) {
        Set<Integer> set=Set.of(1,2,3,4,5,6,7,8,9,10);
        Set<Integer>set2=Set.of(2,4,6,8,10);
        Set<Integer>set3=new HashSet<>(set);
        set3.retainAll(set2);
        set3.forEach(System.out::println);
    }
}
