package com.java8.functionalinterface.function;

import java.util.function.Function;

/*
26. Chain 3 func ons: Add 2 → Mul ply by 3 → Append " Rs".*/
public class Question27
{
    public static void main(String[] args) {
        Function<Integer,Integer>addTwo=x->x+2;
        Function<Integer,Integer>multiplyThree=x->x*3;
        Function<Integer,String>append=x->String.valueOf(x)+" Rs";

        Function<Integer, String> integerStringFunction = addTwo.andThen(multiplyThree).andThen(append);
        System.out.println(integerStringFunction.apply(10));
    }
}
