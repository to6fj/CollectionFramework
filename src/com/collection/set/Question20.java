package com.collection.set;

import java.util.HashSet;
import java.util.Set;

public class Question20{
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> set1 = new HashSet<>();
        for(int i=0;i<10;i++){
            set.add(i);
            set1.add(i);
        }
        System.out.println(set.equals(set1));
    }
}
