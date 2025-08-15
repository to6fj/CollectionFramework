package com.java8.streams.terminal.min;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinDemo
{
    public static void main(String[] args) {
        List<Integer>numbers= Arrays.asList(8,7,19,3,5,6,9,6,3,1);
        Optional<Integer> min = numbers.stream().min((a, b) -> a - b);
        System.out.println(min.get());
    }
}
