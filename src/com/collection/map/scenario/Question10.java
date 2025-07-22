package com.collection.map.scenario;
/*
    10. Browser History - Track visited URLs in order.
*/

import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;

public class Question10 {
    public static void main(String[] args) {
        LinkedHashMap<String, Long> map = new LinkedHashMap<>(16, 0.75f, true);
        map.put("www.google.com", System.currentTimeMillis());
        map.put("www.facebook.com", System.currentTimeMillis());
        map.put("www.instagram.com", System.currentTimeMillis());
        map.forEach((key,value)-> System.out.println(key+":"+value));
        long timeUnit = map.get("www.google.com");
        System.out.println(timeUnit);
        System.out.println("-------------------------------------------------------------\n");
        map.forEach((key,value)-> System.out.println(key+":"+value));

    }
}

