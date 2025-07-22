package com.collection.list;

import java.util.*;

/*
12.	Transfer all elements from an ArrayList to a LinkedList in reverse order.
*/
public class Question12 {
     public  static <E> LinkedList<E> arrayListToLinkedList(List<E>list)
     {
         LinkedList<E>linkedList = new LinkedList<>();
         Iterator<E> iterator = list.iterator();
         while (iterator.hasNext()) {
             linkedList.addFirst(iterator.next());
         }
         return linkedList;
     }
    public static void main(String[] args) {

         List<Integer>list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
         LinkedList<Integer>linkedList=arrayListToLinkedList(list);
        System.out.println(linkedList);

    }
}
