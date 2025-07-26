package com.collection.set;

/*
2. Check if a specific element exists in a HashSet.
*/

import java.util.HashSet;
import java.util.Set;

public class Question2<E>{
    public Set<E>set;
    public boolean contains(E element) {
        return set.contains(element);
    }
     public static void main(String[] args) {
        Question2 question2=new Question2();
        question2.set=new HashSet<Integer>();
        question2.set.add(1);
        question2.set.add(11);
        question2.set.add(111);
        question2.set.add(1111);
         System.out.println(question2.contains(11));
     }
}
