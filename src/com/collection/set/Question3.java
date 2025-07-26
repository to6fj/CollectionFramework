package com.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
3.	Iterate over a HashSet using iterator and for-each loop.
*/
public class Question3 {
    public static void main(String[] args) {
        Set<Integer> marks=new HashSet<>();
        marks.add(80);
        marks.add(76);
        marks.add(66);
        marks.add(96);
        marks.add(86);
        marks.add(98);
        Iterator<Integer> iterator=marks.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("---------------------------------------------------");
        for(Integer mark:marks) {
            System.out.println(mark);
        }
        System.out.println("---------------------------------------------------");
        marks.forEach(System.out::println);
    }
}
