package com.java8.streams.terminal.findfirst;

import java.util.List;
import java.util.Optional;

public class FindFirstDemo
{
    public static void main(String[] args) {
        List<Integer> numbers=List.of(2,3,4,5,6,7,8,9);
        Optional<Integer> first = numbers.stream().findFirst();
        System.out.println(first.get()  );
    }
}
