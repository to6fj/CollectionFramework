package com.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/*
2.	Add 10 integers to a LinkedList and print only the even numbers.
*/
public class Question2 {
    public static void main(String[] args) {
        List<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        List<Integer>list2 = Arrays.asList(6,7,8,9,10,11,12,13,14,15);
        list.addAll(list2);

        for(int i=0;i<list.size();i++) {
            if(list.get(i)%2==0)
            {
                System.out.println(list.get(i));
            }
        }
        System.out.println("--------------------------------------------------------------");
        for(int a:list)
        {
            if (a%2==0)
                System.out.println(a);
        }
        System.out.println("--------------------------------------------------------------");

        list.stream().filter(a->a%2==0).forEach(System.out::println);
        System.out.println("--------------------------------------------------------------");

        Iterator<Integer>  iterator = list.iterator();
        while (iterator.hasNext())
        {
            int num=iterator.next();
            if(num%2==0)
                System.out.println(num);
        }
    }
}
