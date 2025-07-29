package com.java8.functionalinterface.predicate;
/*
13. Write a Predicate to check if a given year is a leap year.
*/

import java.util.function.Predicate;

public class Question13
{

    public static void main(String[] args) {
        Predicate<Integer> divideByFour=x->x%4==0;
        Predicate<Integer> divideByHundread=x->x%100==0;
        Predicate<Integer> divideByFOurHundread=x->x%400==0;
        Predicate<Integer>leapYear=divideByFour.and(divideByHundread.negate()).or(divideByFOurHundread);

        System.out.println(leapYear.test(1900));
    }
    public static boolean isLeapYear(int year) {
        return  (year %4==0 && year%100!=0 ) || (year%400==0);
    }
}
