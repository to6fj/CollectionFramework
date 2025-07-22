package com.collection.map.scenario;

/*
6. Product Price Mapping:
        - Map<String, Double>: sort by price.
*/

import java.util.*;
import java.util.stream.Stream;

public class Question6 {
    public static void main(String[] args) {
        Map<String,Double> productMap=new HashMap<String,Double>();
        productMap.put("Iphone",99000.00);
        productMap.put("Samsung",88000.00);
        productMap.put("Realme",18000.00);
        productMap.put("MI",28000.00);
        productMap.put("OnePlus",38000.00);
        Set<Map.Entry<String,Double>> entrySet=productMap.entrySet();
        List<Map.Entry<String,Double>> list=new ArrayList<>(entrySet);
        list.sort((a,b)->-Double.compare(a.getValue(),b.getValue()));
        System.out.println(list);
    }
}
