package com.java8.streams.terminal.findany;

import java.util.List;
import java.util.Optional;

public class FindAnyDemo
{
    public static void main(String[] args) {
        List<Integer> numbers=List.of(1,2,3,4,5,6,7,8,9);
        Optional<Integer> findAny = numbers.parallelStream().findAny();
        System.out.println(findAny.get());
    }
}
