package com.java8.streams.terminal.nonematch;

import java.util.List;

public class NoneMatchDemo
{
    public static void main(String[] args) {
        List<Integer>numbers=List.of(1,2,3,4,5,6,7,8,9);

        boolean result = numbers.stream().noneMatch(x -> x == 21);
        System.out.println(result);
    }
}
