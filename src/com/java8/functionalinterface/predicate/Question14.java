package com.java8.functionalinterface.predicate;

/*
14. Chain multiple predicates to validate a password: not null, > 8 chars, contains digit.
*/


import java.util.function.Predicate;

public class Question14 {
    public static void main(String[] args) {
        Predicate<String>nullCheck=x->x!=null;
        Predicate<String>lengthCheck=x->x.length()>8;
        Predicate<String>matchCheck1=x->x.matches(".*[a-zA-Z0-9].*");
        Predicate<String>matchCheck2=x->x.matches(".*[@$_*].*");
        Predicate<String>startsWithCapital=x->x.charAt(0)>='A'&&x.charAt(0)<='Z';
        Predicate<String>passwordCheck=nullCheck.and(lengthCheck).and(matchCheck1).and(matchCheck2).and(startsWithCapital);
        System.out.println(passwordCheck.test("Shubham@123"));
    }
}
