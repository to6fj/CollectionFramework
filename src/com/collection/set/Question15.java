package com.collection.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Question15
{
    public static void main(String[] args) {
        Integer []array={1,2,3,4,5,6,7,8,9,10};
        List<Integer> list=Arrays.asList(array);
        Set<Integer> set=new  HashSet<>(list);
        System.out.println(set);
        set.forEach(System.out::println);
    }
}
