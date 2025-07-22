package com.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
37. Convert an array of integers to a List using Arrays.asList(). Sort and display it.*/
public class Question37
{
    public static void main(String[] args) {
        Integer []numbers={8,7,9,3,5,6,9,6,3,1};
        List<Integer> list= Arrays.asList(numbers);
        numbers[0]=9;
        // We have updated value in array but it will also reflect in list
        //In Arrays.asList() method we can update the values but we cant remove
        System.out.println("Before Sorting");
        list.forEach(System.out::println);
        list.sort((a,b)->b-a);
        System.out.println("After Sorting");
        list.forEach(System.out::println);

    }
}
