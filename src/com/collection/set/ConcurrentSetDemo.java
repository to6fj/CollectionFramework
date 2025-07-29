package com.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class ConcurrentSetDemo
{
    public static void main(String[] args) {
        Set<Integer> set = new CopyOnWriteArraySet<Integer>();
        Set<Integer>set1=new ConcurrentSkipListSet<Integer>();

        for (int i = 0; i < 10; i++) {
            set.add(i);
            set1.add(i);
        }
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            set.add(11);
        }

        for(int a:set)
        {
            System.out.println(a);
        }
        System.out.println("----------------------------------------------------");
        for(int a:set1)
        {
            System.out.println(a);
            set1.add(11);
        }
    }
}
