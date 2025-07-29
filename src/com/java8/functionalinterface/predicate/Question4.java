package com.java8.functionalinterface.predicate;
/*
4. Write a Predicate to validate an email string (contains "@" and ".").
*/

import java.util.function.Predicate;

public class Question4 {
    public static void main(String[] args) {
        Predicate<String>emailTest=x->x.contains("@");
        Predicate<String> emailTest1=x->x.contains(".");
        Predicate<String> email=emailTest.and(emailTest1);
        System.out.println(email.test("shubhampuri1998@gmail.com"));
        System.out.println(email.test("shubhampuri1998@gmailcom"));
    }
}
