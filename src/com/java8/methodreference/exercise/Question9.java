package com.java8.methodreference.exercise;
/*
9. Use method reference to filter a list of integers and print only even numbers.
*/

import java.util.List;

public class Question9
{
    public static void main(String[] args) {
        List<Integer>list=List.of(8,7,9,3,5,6,9,6,3,1);
        List<Integer> evenList = list.stream().filter(new Question9()::isEven).toList();
        evenList.forEach(System.out::println);
    }
    public  boolean isEven(int num) {
        return num % 2 == 0;
    }
}
