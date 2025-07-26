package com.collection.set;

/*
10. Clone a HashSet.
*/

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Question10{
    public static void main(String[] args){

        HashSet<Integer> set = new HashSet<>();
        set.add(-100);
        set.add(200);
        set.add(100);
        set.add(2300);
        Set<Integer>set1= (Set<Integer>) set.clone();
        System.out.println(set.hashCode());
        System.out.println(set1.hashCode());
//        System.out.println(System.identityHashCode(set1));
//        System.out.println(System.identityHashCode(set));
    }
}
