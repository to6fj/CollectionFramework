package com.collection.map.scenario;
/*
11. LRU Cache Simulation - Maintain max 5 entries using removeEldestEntry().
*/

import java.util.LinkedHashMap;
import java.util.Map;

public class Question11 {
    public static void main(String[] args) {
        LRUCache cache=new LRUCache(4,0.75f,true);
        cache.put("www.google.com","google website");
        cache.put("www.facebook.com","facebook website");
        cache.put("www.yahoo.com","yahoo website");
        cache.put("www.instagram.com","instagram website");
        cache.forEach((key,value)-> System.out.println(key+":"+value));
        cache.put("www.chatgpt.com","chatgpt website");
        System.out.println("-----------------------------------------------------------------------");
        cache.forEach((key,value)-> System.out.println(key+":"+value));


    }
}
class LRUCache extends LinkedHashMap<String ,String>
{
    private int maxCapacity;
    public LRUCache(int initialCapacity, float loadFactor, boolean accessOrder) {
        super(initialCapacity, loadFactor, accessOrder);
        this.maxCapacity = initialCapacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<String, String> eldest) {
        return size() > maxCapacity;
    }
}
