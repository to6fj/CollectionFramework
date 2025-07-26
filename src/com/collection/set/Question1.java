package com.collection.set;
/*
1. Create a HashSet and add 5 student names.
*/

import java.util.HashSet;
import java.util.Set;

public class Question1 {
    public static void main(String[] args) {
        Set<String> studentNames=new HashSet<>();
        studentNames.add("Vaishnavi Hankare");
        studentNames.add("Shubham Puri");
        studentNames.add("Shubham Chaudhari");
        studentNames.add("Shrikant Surve");
        studentNames.add("Omkar Patil");
        System.out.println(studentNames);
    }
}
