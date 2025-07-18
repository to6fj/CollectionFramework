package com.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
6.	Compare the performance of ArrayList and LinkedList when inserting elements at the beginning.
*/
public class Question6 {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<Integer>();
        List<Integer>list1=new LinkedList<Integer>();
        long startTime=System.currentTimeMillis();
        for(int i=0;i<100000;i++) {
            list.add(0,i);
        }
        System.out.println("Time Required for inserting element in Arraylist "+(System.currentTimeMillis()-startTime));
        startTime = System.currentTimeMillis();
        for(int i=0;i<100000;i++) {
            list1.add(0,i);
        }
        System.out.println("Time Required for inserting element in Linkedlist "+(System.currentTimeMillis()-startTime));
        startTime = System.currentTimeMillis();
        for(int i=0;i<100000;i++) {
            list.get(i);
        }
        System.out.println("Time Required for retriving element in ArrayList "+(System.currentTimeMillis()-startTime));
        startTime = System.currentTimeMillis();
        for(int i=0;i<100000;i++) {
            list1.get(i);
        }
        System.out.println("Time Required for retriving element in Linkedlist "+(System.currentTimeMillis()-startTime));
        startTime = System.currentTimeMillis();
        for(int i=0;i<1000;i++) {
            list.remove(i);
        }
        System.out.println("Time Required for removing element from ArrayList is "+(System.currentTimeMillis()-startTime));
        startTime = System.currentTimeMillis();
        for(int i=0;i<1000;i++) {
            list1.remove(i);
        }
        System.out.println("Time Required for removing element from Linkedlist is "+(System.currentTimeMillis()-startTime));
    }
}
