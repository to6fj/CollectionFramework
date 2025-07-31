package com.java8.functionalinterface.exercise;

/*
23.  Apply UnaryOperator on each element of a list to double the value.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class Question23 {
    public static void main(String[] args) {

        UnaryOperator<Integer>op=x->x*2;
        List<Integer>numbers=new ArrayList<>(List.of(8,7,9,3,5,6,9,6,3,1));
        numbers.stream().map(op).forEach(s->System.out.println(s));
    }
}
