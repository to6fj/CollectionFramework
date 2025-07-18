package com.collection.list;

import java.util.*;

/*
 8.	Reverse a LinkedList without using Collections.reverse().
*/
public class Question8
{
    public static void main(String[] args) {
        List<Integer>numList=List.of(1,2,3,4,5,6,7,8,9,10);
        List<Integer>list=new LinkedList<>(numList);
        for(int i=list.size()-1;i>=0;i--)
        {
            System.out.println(list.get(i));
        }
        System.out.println("-------------------------------------------------------------");
        ListIterator<Integer> itr=list.listIterator();
        while (itr.hasNext()) {
            itr.next();
        }
        while (itr.hasPrevious())
        {
            System.out.println(itr.previous());
        }
        System.out.println("----------------------------------------------------------------");


    }
}
