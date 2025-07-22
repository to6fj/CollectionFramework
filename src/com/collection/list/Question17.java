package com.collection.list;


/*
17. Demonstrate thread-safety difference between Vector and ArrayList.\
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Question17 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer>vector=new Vector<>();
        Runnable task = () -> {
            for(int i=0;i<1000;i++)
            {
                arrayList.add(i);
            }
        };
        Runnable task2 = () -> {
            for(int i=0;i<1000;i++)
            {
                vector.add(i);
            }
        };
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        Thread thread3 = new Thread(task2);
        Thread thread4 = new Thread(task2);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
        System.out.println("ArrayList Size:"+arrayList.size());
        System.out.println("Vector size:"+vector.size());
    }
}
