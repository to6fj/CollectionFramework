package com.java8.functionalinterface.exercise;

/*
    36.  Write a BiConsumer to print key-value pairs of a map.
*/

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class Question36 {
    public static void main(String[] args) {

        Map<Integer,String> map = Map.of(1,"One",2,"Two",3,"Three",4,"Four",5,"Five",6,"Six");
        BiConsumer<Integer,String>biConsumer=(a,b)->{
            System.out.println(a+"  "+b);
        };
        map.forEach(biConsumer);
    }
}
