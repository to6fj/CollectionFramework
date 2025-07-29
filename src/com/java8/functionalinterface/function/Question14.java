package com.java8.functionalinterface.function;

/*
14. Convert a list of salaries to net values (aŌer 10% tax).
*/


import java.util.List;


public class Question14
{
    public static void main(String[] args) {
        List<Double> list = List.of(1200.00,3450.99,12345.56,98748.99);
        List<Integer> list1 = list.stream().map(x -> {
            return(int)(x - (x * 0.1));
        }).toList();
        list1.forEach(System.out::println);
    }
}
