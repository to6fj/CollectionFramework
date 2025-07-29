package com.java8.functionalinterface.function;

/*
22. Apply 10% discount to a list of product prices.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Question22 {

    public static void main(String[] args) {
        List<Double> productPrice = List.of(499.0, 1299.0, 999.0, 1999.0, 749.0, 850.0, 650.0, 1799.0, 300.0, 1050.0);
        Function<Double,Double>discountByTen=x->{
            return x-(x*0.1);
        };
        List<Double> list = productPrice.stream().map(discountByTen).toList();
        list.forEach(System.out::println);
    }
}
