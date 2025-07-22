package com.collection.map.scenario;

/*
12. Sorted Dictionary - TreeMap<String, String>: Alphabetical ordering.
*/

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Question12 {
    public static void main(String[] args) {
        Map<String, String> dictionary = new TreeMap<>();
        dictionary.put("Apple", "A fruit that is red or green in color and sweet in taste.");
        dictionary.put("Banana", "A long yellow fruit with a soft inside.");
        dictionary.put("Computer", "An electronic device for storing and processing data.");
        dictionary.put("Dog", "A domestic animal known for loyalty.");
        dictionary.put("Elephant", "A large mammal with a trunk.");
        dictionary.put("Fish", "An aquatic animal that swims.");
        dictionary.put("Guitar", "A musical instrument with strings.");
        dictionary.put("House", "A building for human habitation.");
        dictionary.put("Icecream", "A frozen dessert made from cream.");
        dictionary.put("Jungle", "A dense forest rich in biodiversity.");
        for(Map.Entry<String, String> entry : dictionary.entrySet()) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
        System.out.println("------------------------------------------------");
        dictionary.forEach((key,value)-> System.out.println(key+":"+value));
    }
}
