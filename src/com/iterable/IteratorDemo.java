package com.iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo
{
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<Integer>(List.of(8,7,9,3,5,6,9,6,3,1));
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int data=iterator.next();
            if(data%2==0)
            {
                iterator.remove();
            }
        }
        list.forEach(System.out::println);
    }
}
