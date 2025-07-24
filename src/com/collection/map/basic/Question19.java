package com.collection.map.basic;

import java.util.LinkedHashMap;
import java.util.Map;

public class Question19 {
    public static void main(String[] args) {
        LRUCache cache=new LRUCache(3);
        cache.put("Banana", 20);
        cache.put("Orange", 30);
        cache.put("Watermelon", 40);
        cache.put("Shailesh", 50);
        cache.forEach((k,v)->{
            System.out.println(k+" "+v);
        });
    }
}

class LRUCache extends LinkedHashMap<String, Integer> {
    private int capacity;
    private String cookieName;
    private int cookieValue;

    public LRUCache( int initialCapacity) {
        super(initialCapacity);

        this.capacity = initialCapacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<String, Integer> eldest) {

        return size() > capacity;
    }
}
