package com.java8.functionalinterface.exercise;

/*
28.Reduce a list of integers to their sum using BinaryOperator.
*/

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Question28 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        BinaryOperator<Integer>sumRes=(a,b)->a+b;
        Integer reduce = list.stream().reduce(0, sumRes);
        System.out.println(reduce);
    }
}
