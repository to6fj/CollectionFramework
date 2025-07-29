package com.java8.functionalinterface.predicate;

import java.util.LinkedList;
import java.util.List;
/*
12. Use Predicate in removeIf() to remove elements shorter than 5 characters.
*/

public class Question12
{
    public static void main(String[] args) {
        List<String>list=new LinkedList<>(List.of("Shubham","shrikant","sejal","akash","zayen","ajay","akay","abc"));
         list.removeIf(x -> x.length() < 5);
         list.forEach(System.out::println);
    }
}
