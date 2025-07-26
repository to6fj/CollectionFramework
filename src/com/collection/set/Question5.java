package com.collection.set;

import java.util.HashSet;
import java.util.Set;

/*
5.	Clear a HashSet.
*/
public class Question5 {
    public static void main(String[] args) {

        Set<Integer> marks = new HashSet<>();
        marks.add(1);
        marks.add(2);
        marks.add(3);
        marks.add(4);
        marks.add(5);
        marks.add(6);
        marks.forEach(System.out::println);
        marks.clear();
        if(marks.isEmpty()) {
            System.out.println("Set is cleared now");
        }else {
            System.out.println("Set is not cleared ");
        }
    }
}
