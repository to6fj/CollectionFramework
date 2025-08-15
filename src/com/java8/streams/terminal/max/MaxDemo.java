package com.java8.streams.terminal.max;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxDemo
{
    public static void main(String[] args) {

        List<Integer>numbers= Arrays.asList(8,7,19,3,5,6,9,6,3,1);
        Optional<Integer> max = numbers.stream().max((a,b)->a-b);
        System.out.println(max.get());
    }
}
