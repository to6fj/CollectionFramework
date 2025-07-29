package com.java8.functionalinterface.predicate;
/*
11. Use Predicate.isEqual() to compare a string with a constant.
*/

import java.util.function.Predicate;

public class Question11
{
    public static void main(String[] args) {
        Predicate<String>p=Predicate.isEqual("shubham");
        System.out.println(p.test("shubham"));
        System.out.println(p.test("shrikant"));
    }
}
