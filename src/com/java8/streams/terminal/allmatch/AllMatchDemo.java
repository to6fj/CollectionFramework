package com.java8.streams.terminal.allmatch;

import java.util.ArrayList;
import java.util.List;

public class AllMatchDemo
{
    public static void main(String[] args) {
        List<Integer>numbers=List.of(8,7,9,3,5,6,9,6,3,1);
        boolean isEven=numbers.stream()
                .allMatch(x->x%2==0);
        System.out.println(isEven);
        boolean isPositive = numbers.stream().allMatch(x -> x > 0);
        System.out.println(isPositive);
    }
}
