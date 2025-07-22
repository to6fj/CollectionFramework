package com.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*20. Create a List<Object> and store different data types (Integer, String, custom object).*/
public class Question20 {
    public static void main(String[] args) {
        List<Object>arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add("Shubham");
        arrayList.add(new Thread(Thread.currentThread().getName()));
        arrayList.add(24.22);
        arrayList.add(new LinkedList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10)));
        System.out.println(arrayList);

    }
}
