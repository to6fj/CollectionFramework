package com.collection.list;

/*
44. Use Collections.frequency() to count how many Ɵmes a number appears in a list.
*/

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Question44
{
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(List.of(1,2,3,4,5,6,1,8,1,1));
        int frequency = Collections.frequency(list, 1);
        System.out.println(frequency);
    }
}
