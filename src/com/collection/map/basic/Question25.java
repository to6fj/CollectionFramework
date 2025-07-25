package com.collection.map.basic;

/*
25. Implement a word count program that takes multiple strings and returns the top 5 most frequent
words.
*/

import java.util.*;

public class Question25 {

    public static void main(String[] args) {


        String s ="Java is a versatile programming language. Java is used for building web applications, mobile apps, and enterprise software. Many developers prefer Java because it is platform-independent, robust, and secure. Learning Java can open up many opportunities in the software development industry.\n";
        String [] words = s.split(" ");
        Map<String,Integer>wordCount=new HashMap<>();
        for(String word:words){
            word=word.toLowerCase();
            wordCount.put(word,wordCount.getOrDefault(word,0)+1);
        }
        Map<String,Integer>res=sortByValues(wordCount);
        int i=0;
        for(Map.Entry<String, Integer> entry:res.entrySet()){
            if(i==5)
                break;
            System.out.println(entry.getKey()+":"+entry.getValue());
            i++;
        }
    }
    public static Map<String,Integer>sortByValues(Map<String,Integer> map) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        Comparator<Map.Entry<String,Integer>>comparator=Comparator.comparing(Map.Entry::getValue);
//        list.sort((a,b)->-(Integer.compare(a.getValue(),b.getValue())));
        list.sort(comparator.reversed());
        Map<String,Integer> sortedMap=new LinkedHashMap<>();
        for(Map.Entry<String, Integer> entry:list){
            sortedMap.put(entry.getKey(),entry.getValue());
        }
        return sortedMap;
    }
}

