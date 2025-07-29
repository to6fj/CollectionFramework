package com.java8.functionalinterface.predicate;

/*
5. Combine two predicates: number should be even AND greater than 10.
*/

import java.util.function.Predicate;

public class Question5
{
    public static void main(String[] args) {
        Predicate<Integer>isEven=x->x%2==0;
        Predicate<Integer>greaterThan10=x->x>10;
        Predicate<Integer>combine=isEven.and(greaterThan10);
        System.out.println(combine.test(20));//true as both condition satisfies x is even and x is greater than 10
        System.out.println(combine.test(10));//false as one codition is false x is event but x is not greater than 10
    }
}
