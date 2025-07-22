package com.collection.list;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

/*
14. Measure Ɵme taken to insert 100 elements in the middle of ArrayList vs. LinkedList.

*/
public class Question14 {
    public static void main(String[] args) {
        ArrayList<Integer>arrayList=new ArrayList<>();
        LinkedList<Integer>linkedList=new LinkedList<>();
        for(int i=0;i<1000;i++)
        {
            arrayList.add(i);
            linkedList.add(i);
        }
        long curTime=System.currentTimeMillis();
        for(int i=0;i<100;i++)
        {
            arrayList.add(arrayList.size()/2,0);
        }
        System.out.println("Total Time required for arraylist is "+(System.currentTimeMillis()-curTime));
        curTime=System.currentTimeMillis();
        for(int i=0;i<100;i++)
        {
            linkedList.add(linkedList.size()/2,0);
        }
        System.out.println("Total Time required for Linkedlist is "+(System.currentTimeMillis()-curTime));

    }
}
