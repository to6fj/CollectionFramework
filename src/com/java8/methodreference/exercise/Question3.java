package com.java8.methodreference.exercise;

/*
3. Use method reference to sort a list of strings in alphabetical order using Collections.sort().
*/

import java.util.Arrays;
import java.util.List;

public class Question3<E> {
    public static void main(String[] args) {
        List<String>list= Arrays.asList("Hello","World","Shubham","Ashish","Puri","Abhay");
        list.sort(String::compareTo);
        list.forEach(System.out::println);
    }

}

