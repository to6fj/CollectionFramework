package com.collection.map.basic;

/*
13. Sort a HashMap by keys and by values (ascending/descending).
*/

import java.util.*;

public class Question13 {

    public static  Map<String,Integer> sortByKeyAscending(Map<String, Integer> map) {
        List<Map.Entry<String,Integer>>list=new ArrayList<>(map.entrySet());
        list.sort((a,b)->a.getKey().compareTo(b.getKey()));

        Map<String,Integer> sortedMap=new LinkedHashMap<>();
        for(Map.Entry<String,Integer> entry:list){
            sortedMap.put(entry.getKey(),entry.getValue());
        }
        return sortedMap;
    }

    public static  Map<String,Integer> sortByKeyDescending(Map<String, Integer> map) {
        List<Map.Entry<String,Integer>>list=new ArrayList<>(map.entrySet());
        list.sort((a,b)->(-a.getKey().compareTo(b.getKey())));
        Map<String,Integer> sortedMap=new LinkedHashMap<>();
        for(Map.Entry<String,Integer> entry:list){
            sortedMap.put(entry.getKey(),entry.getValue());
        }
        return sortedMap;
    }
    public static  Map<String,Integer> sortByValueDescending(Map<String, Integer> map) {
        List<Map.Entry<String,Integer>>list=new ArrayList<>(map.entrySet());
        list.sort((a,b)->(-Integer.compare(a.getValue(),b.getValue())));
        Map<String,Integer> sortedMap=new LinkedHashMap<>();
        for(Map.Entry<String,Integer> entry:list){
            sortedMap.put(entry.getKey(),entry.getValue());
        }
        return sortedMap;
    }
    public static  Map<String,Integer> sortByValueAscending(Map<String, Integer> map) {
        List<Map.Entry<String,Integer>>list=new ArrayList<>(map.entrySet());
        list.sort((a,b)->(Integer.compare(a.getValue(),b.getValue())));
        Map<String,Integer> sortedMap=new LinkedHashMap<>();
        for(Map.Entry<String,Integer> entry:list){
            sortedMap.put(entry.getKey(),entry.getValue());
        }
        return sortedMap;
    }


    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Charlie", 85);
        map.put("Alice", 92);
        map.put("Bob", 78);
        map.put("Eve", 90);
        map.put("David", 88);

       Map<String,Integer>ascendingKey= sortByKeyAscending(map);
       Map<String,Integer>descendingKey= sortByKeyDescending(map);
       Map<String,Integer>ascendingValue= sortByValueAscending(map);
       Map<String,Integer>descendingValue= sortByValueDescending(map);
        System.out.println("Ascending key:");
       ascendingKey.forEach((key, value) -> System.out.println(key+":"+value));
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Descending key:");
        descendingKey.forEach((key, value) -> System.out.println(key+":"+value));
        System.out.println("---------------------------------------------------------------------");

        System.out.println("Ascending Value:");
        ascendingValue.forEach((key, value) -> System.out.println(key+":"+value));
        System.out.println("---------------------------------------------------------------------");

        System.out.println("Descending Value:");
        descendingValue.forEach((key, value) -> System.out.println(key+":"+value));

//


    }
}
