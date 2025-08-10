package com.java8.streams.intermediate.skip;

import java.util.List;
import java.util.stream.Stream;

public class SkipDemo {
    public static void main(String[] args) {
        List<Integer>nums= Stream.iterate(1,x->x+1).skip(10).map(x->x*x).limit(10).toList();
        nums.forEach(System.out::println);
    }
}
