package com.collection.set;
/*
8. Create a TreeSet to store 10 integers and display them in sorted order.
*/

import java.util.Set;
import java.util.TreeSet;

public class Question8
{
    public static void main(String[] args) {
        Set<Integer>set = new TreeSet<Integer>();
        set.add(1111);
        set.add(2);
        set.add(3);
        set.add(-4);
        set.add(-5);
        set.add(-100);
        set.add(200);
        System.out.println(set);
    }
}
