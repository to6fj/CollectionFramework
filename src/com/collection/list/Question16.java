package com.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Question16 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // Insertion at end
        long start = System.nanoTime();
        for (int i = 0; i < 1_000_000; i++) arrayList.add(i);
        long end = System.nanoTime();
        System.out.println("ArrayList end-insert time: " + (end - start) + " ns");

        start = System.nanoTime();
        for (int i = 0; i < 1_000_000; i++) linkedList.add(i);
        end = System.nanoTime();
        System.out.println("LinkedList end-insert time: " + (end - start) + " ns");

        // Access middle
        start = System.nanoTime();
        int val1 = arrayList.get(arrayList.size() / 2);
        end = System.nanoTime();
        System.out.println("ArrayList get() time: " + (end - start) + " ns");

        start = System.nanoTime();
        int val2 = linkedList.get(linkedList.size() / 2);
        end = System.nanoTime();
        System.out.println("LinkedList get() time: " + (end - start) + " ns");

        // Insert at middle
        start = System.nanoTime();
        arrayList.add(arrayList.size() / 2, -1);
        end = System.nanoTime();
        System.out.println("ArrayList insert-middle time: " + (end - start) + " ns");

        start = System.nanoTime();
        linkedList.add(linkedList.size() / 2, -1);
        end = System.nanoTime();
        System.out.println("LinkedList insert-middle time: " + (end - start) + " ns");
    }
}
