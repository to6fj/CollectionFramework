package com.java8.streams.terminal.count;

import java.util.Arrays;
import java.util.List;

public class CountDemo
{
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(8,7,19,3,5,6,9,6,3,1);

        long count=numbers.stream().count();
        System.out.println(count);
    }
}
