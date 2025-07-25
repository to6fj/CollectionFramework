package com.collection.map.basic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Question40 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "d");
        map.put(5, "e");
        map.put(6, "f");

        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println(entry.getKey() + " " + entry.getValue());

            // Structural change during iteration → triggers fail-fast behavior
            if (entry.getKey() == 4) {
                map.put(14, "a"); // Causes ConcurrentModificationException
            }
        }
    }
}
