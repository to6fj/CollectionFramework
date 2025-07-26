package com.collection.set;
/*
9. Create a LinkedHashSet to preserve inserƟon order of ciƟes.
*/

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Question9
{
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<String>();
        set.add("Pune");
        set.add("Latur");
        set.add("Mumbai");
        set.add("Parbhani");
        System.out.println(set);
    }
}
