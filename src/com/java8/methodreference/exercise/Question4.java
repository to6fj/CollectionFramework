package com.java8.methodreference.exercise;

/*
4. Use method reference to convert a list of strings to uppercase using List.forEach().
*/

import java.util.List;

public class Question4 {
    public static void main(String[] args) {
        List<String>list=List.of("shubham","pandit","puri","shrikant","surve");
        List<String> upperCaseList = list.stream().map(String::toUpperCase).toList();
        upperCaseList.forEach(System.out::println);
    }
}
