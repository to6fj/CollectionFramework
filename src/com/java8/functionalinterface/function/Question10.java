package com.java8.functionalinterface.function;

/*
10. Combine two funcƟons: mulƟply a number by 10, then add 5. Use andThen().
*/

import java.util.function.Function;

public class Question10 {
    public static void main(String[] args) {

        Function<Integer,Integer>multiplyByTen=x->x*10;
        Function<Integer,Integer>addFive=x->x+5;
        Function<Integer,Integer>combine=multiplyByTen.andThen(addFive);
        System.out.println(combine.apply(10));
    }
}
