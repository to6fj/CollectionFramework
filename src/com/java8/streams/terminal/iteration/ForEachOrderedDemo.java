package com.java8.streams.terminal.iteration;

import java.util.List;

public class ForEachOrderedDemo
{
    public static void main(String[] args) {
        List<Integer>nums=List.of(8,7,9,3,5,6,9,6,3,1);
        //parallelStream() with forEach() does not assure ordered output
        nums.parallelStream().forEach(System.out::println);
        System.out.println("------------------------------------------------------");
        //parallelStream() with forEachOrdered() assured ordered output
        nums.parallelStream().forEachOrdered(System.out::println);

    }
}
