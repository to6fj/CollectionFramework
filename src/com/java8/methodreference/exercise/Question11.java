package com.java8.methodreference.exercise;
/*
11. Use method reference inside a Stream API pipeline to transform and filter data.
*/

import java.util.List;

public class Question11
{
    public boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static void main(String[] args) {
        List<Integer> list=List.of(8,7,9,3,5,6,9,6,3,1);
        List<Integer> evenList = list.stream().filter(new Question11()::isEven).toList();
        evenList.forEach(System.out::println);
    }

}
