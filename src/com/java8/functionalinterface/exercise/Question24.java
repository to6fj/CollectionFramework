package com.java8.functionalinterface.exercise;

/*
24.  Use UnaryOperator with `replaceAll()` to uppercase all elements in a list.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class Question24 {
    public static void main(String[] args) {
        List<String>names=new ArrayList<>(List.of("Shubham","Pandit","Puri","Shrikant","Navnath","Surve"));
        UnaryOperator<String>toUpperCase=name-> name.toUpperCase();
        names.replaceAll(toUpperCase);
        names.forEach(System.out::println);
    }
}
