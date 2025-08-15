package com.java8.streams.terminal.anymatch;

import java.util.Arrays;
import java.util.List;

public class AnyMatchDemo
{
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(8,7,19,3,5,6,9,6,3,1);

        boolean isNegative = numbers.stream().anyMatch(x -> x < 0);
        System.out.println(isNegative);
        boolean isPositive=numbers.stream().anyMatch(x -> x > 0);
        System.out.println(isPositive);
    }
}
