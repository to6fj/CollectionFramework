package com.collection.list;

import java.util.ArrayList;
import java.util.List;

/*
11.	Implement a generic method that takes a List<T> and returns a new list with duplicates removed.
*/
public class Question11 {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(4);
        List<Integer>data=removeDuplicates(list);
        System.out.println(data);
        System.out.println(list);


    }
    public  static <E> List<E> removeDuplicates(List<E>data)
    {
        List<E> unique=new ArrayList<>();
        for(int i = 0; i < data.size(); i++) {
            if(!unique.contains(data.get(i))) {
                unique.add(data.get(i));
            }
        }
        return unique;
    }
//    public  static <E> List<E> removeDuplicates(List<E>data)
//    {
//        List<E> unique=new ArrayList<>();
//        for (int i = 0; i < data.size(); i++) {
//            boolean isDuplicate=false;
//            for (int j = 0; j < i; j++) {
//                if ((data.get(i).equals(dta.get(j)))) {
//                    isDuplicate=true;
//                    break;
//                }
//            }
//            if (!isDuplicate) {
//                unique.add(data.get(i));
//            }
//
//        }
//        return unique;
//    }
}
