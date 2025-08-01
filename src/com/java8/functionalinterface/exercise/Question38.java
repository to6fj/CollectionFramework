package com.java8.functionalinterface.exercise;

/*
    38.  Write a BiConsumer to add a key-value pair to a map.
*/

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class Question38 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        BiConsumer<Integer, String> biConsumer = (a,b)->{
            map.put(a,b);
            System.out.println("added sucessfully");
        };
        biConsumer.accept(1,"shubham");
        biConsumer.accept(2,"shrikant");
        biConsumer.accept(3,"ajay");
        map.forEach((k,v)->{
            System.out.println(k+":"+v);
        });
    }
}
