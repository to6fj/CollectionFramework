package com.collection.list;

/*
39. IniƟalize a list of months using Arrays.asList(). Replace an item and print.
*/

import java.util.Arrays;
import java.util.List;

public class Question39 {
    public static void main(String[] args) {
        List<String>months= Arrays.asList("January","February","August","April","May","June","July");
        System.out.println("Before Updating");
        System.out.println(months);
        months.set(2,"March");
        System.out.println("After Updating");
        System.out.println(months);

    }
}
