package com.java8.streams.intermediate.peek;

import java.util.List;

public class PeekDemo
{
    public static void main(String[] args) {
        List<Integer>list=List.of(1,2,3,4,5,6,7,8,9,10);

        List<Integer> squareList = list.stream().peek(x -> System.out.println("Seen:" + x))
                .map(x -> x * x)
                .toList();
        squareList.forEach(System.out::println);
    }
}
