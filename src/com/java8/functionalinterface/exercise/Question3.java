package com.java8.functionalinterface.exercise;

/*
3.  Combine two predicates using `and()`, `or()`, and `negate()`.
*/

import java.util.function.Predicate;

public class Question3
{
    public static void main(String[] args) {
        Predicate<Integer>numDivideByTwo=x->x%2==0;
        Predicate<Integer>numDivideByFive=x->x%5==0;
        Predicate<Integer>andCheck=numDivideByTwo.and(numDivideByFive);
        System.out.println(andCheck.test(10));//true as 10 is divided by both 2 and 5
        System.out.println(andCheck.test(8));//false 8 is divided by 2 but not divided by 5

        Predicate<Integer>orCheck=numDivideByTwo.or(numDivideByFive);
        System.out.println(orCheck.test(8));//true as one condition is true so it returns true
        System.out.println(orCheck.test(7));//false both conditions are false

        Predicate<Integer>negateCheck=numDivideByFive.negate();
        System.out.println(negateCheck.test(8));//true as 8 is not divided by 5 so opposite result of false is true

    }
}
