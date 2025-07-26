package com.collection.set;

import java.util.HashSet;
import java.util.Set;
/*
4.	Remove a specific element from a HashSet.
*/
public class Question4 {
    public static void main(String[] args) {
        Set<String> colors = new HashSet();
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        colors.add("yellow");
        colors.add("orange");
        colors.add("pink");
        colors.add("gray");

        boolean removedColor=colors.remove("pink");
        if(removedColor)
        {
            System.out.println("colors removed");
        }else {
            System.out.println("colors not removed");
        }
    }
}
