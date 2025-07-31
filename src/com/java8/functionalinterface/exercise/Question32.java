package com.java8.functionalinterface.exercise;

/*
32.  Check if one string is a prefix of another using BiPredicate.
*/

import java.util.function.BiPredicate;

public class Question32 {
    public static void main(String[] args) {
        BiPredicate<String,String>match=(name,prefix)->name.startsWith(prefix);
        System.out.println(match.test("johnWick","john"));
    }
}
