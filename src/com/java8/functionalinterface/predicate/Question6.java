package com.java8.functionalinterface.predicate;
/*
6. Use Predicate.or() to check if a string starts with "A" OR ends with "Z".
*/

import java.util.function.Predicate;

public class Question6 {
    public static void main(String[] args) {
        Predicate<String>startsWIthA=x->x.toLowerCase().startsWith("a");
        Predicate<String>endsWithZ=x->x.toLowerCase().endsWith("z");
        Predicate<String>orConditionn=startsWIthA.or(endsWithZ);
        System.out.println(orConditionn.test("zbhay"));
    }
}
