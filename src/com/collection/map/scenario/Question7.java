package com.collection.map.scenario;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*Group Students by Class:
        - Map<String, List<String>>: Group names by class.*/
public class Question7
{
    public static void main(String[] args) {
        Map<String, List<String>>siom=new HashMap<>();
        siom.put("A", List.of("Rahul", "Sneha", "Aarav"));
        siom.put("B", List.of("Isha", "Karan", "Meera"));
        siom.put("C", List.of("Rohan", "Neha", "Aditya"));
        siom.put("D", List.of("Tanvi", "Vikram"));

        for(Map.Entry<String,List<String>> entry:siom.entrySet())
        {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
