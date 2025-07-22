package com.collection.list;

//40. Merge two lists using addAll() and print merged result.

import java.util.ArrayList;
import java.util.List;

public class Question40 {
    public static void main(String[] args) {
        List<Integer>nums=new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        List<Integer>nums2=new ArrayList<>();
        nums2.add(4);
        nums2.add(5);
        nums2.add(6);
        nums2.add(7);
        nums2.add(8);
        nums2.add(9);
        nums2.add(10);
        nums.addAll(nums2);
        nums.forEach(System.out::println);

    }
}
