package com.collection.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/*6.	Check if the HashSet is empty.*/
public class Question6 {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        if(set.isEmpty())
        {
            System.out.println("Set is empty");
        }else {
            System.out.println("Set is not empty");
        }
    }
}
