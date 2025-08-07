package com.java8.methodreference.exercise;

/*
10. Create a reference to a method that checks whether a string is empty and use it in a Predicate.
*/

import java.util.function.Predicate;

public class Question10 {
    public static void main(String[] args) {
        Predicate<String>empty=new Question10()::isEmpty;
        System.out.println(empty.test("a"));
        System.out.println(empty.test(""));
    }
    public boolean isEmpty(String s) {
        return s.isEmpty();
    }
}

