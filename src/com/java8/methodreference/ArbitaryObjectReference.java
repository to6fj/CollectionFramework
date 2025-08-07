package com.java8.methodreference;

import java.util.ArrayList;
import java.util.List;

public class ArbitaryObjectReference
{
    public static void main(String[] args) {
        List<String> list=List.of("a", "b", "c");
        list.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
