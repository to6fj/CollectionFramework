package com.collection.list;

/*
19. Use ListIterator to traverse a LinkedList in both forward and backward direcƟons.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Question19 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        ListIterator<Integer> iterator = arrayList.listIterator();


        System.out.println("Forward Direction:");

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("Backward Direction:");
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}
