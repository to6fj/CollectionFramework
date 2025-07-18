package com.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
1.	Create a program using ArrayList to store and display 5 student names.
*/
public class Question1 {
    public static void main(String[] args) {
        List<String>list = new ArrayList<String>();
        list.add("Shubham Pandit Puri");
        list.add("Shrikant Navnath Surve");
        list.add("Shubham Balu Chaudhari");
        list.add("Sejal Pravin Patankar");
        list.add("Vaishnavi Shriniwas Hankare");
        for(String name:list)
        {
            System.out.println(name);
        }
        System.out.println("--------------------------------------------------------------");
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
        System.out.println("--------------------------------------------------------------");

        System.out.println(list);
        System.out.println("--------------------------------------------------------------");

        list.forEach(System.out::println);
        System.out.println("----------------------------------------------------------------");
        Iterator<String>iterator=list.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
