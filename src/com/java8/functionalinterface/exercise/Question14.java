package com.java8.functionalinterface.exercise;

/*
4.  Write a consumer that updates the price of all products in a list by 10%.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Question14 {
    public static void main(String[] args) {
        List<Double> productPrices =new ArrayList<>(List.of(
                19.99,
                25.50,
                12.00,
                5.75,
                100.00,
                49.95,
                7.20,
                30.15,
                8.99,
                65.40));

        Consumer<List<Double>>l1=(l)->{
            for(int i=0;i<l.size();i++)
            {
                l.set(i,l.get(i)+(l.get(i)*0.10));
            }
            for(Double d:l)
                System.out.println(d);
        };
        l1.accept(productPrices);

    }
}
