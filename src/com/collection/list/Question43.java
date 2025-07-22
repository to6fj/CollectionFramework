package com.collection.list;

/*
43. Use subList() on a list and observe how modifying it affects the original list.
*/

import java.util.ArrayList;
import java.util.List;

public class Question43 {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));
        List<Integer>subList=list.subList(0,3);
        System.out.println(subList);
        System.out.println(list);
        subList.set(0,11);
        System.out.println(subList);
        System.out.println(list);
        subList.remove(0);
        System.out.println(subList);
        System.out.println(list);

        // if we make any changes on sublist that changes will also affects on orignal list

    }
}
