package com.collection.list;

/*
42. Filter names starƟng with 'A' using Java Streams.
*/

import java.util.ArrayList;
import java.util.List;

public class Question42 {
    public static void main(String[] args) {
        List<String>names=new ArrayList<>(List.of("Akash","Ashish","Shubham","Sejal","Vikas","Ganesh"));
        System.out.println("-------------With stream------------------------------------------------------");
        names.stream().filter(a->a.startsWith("A")).forEach(System.out::println);
        System.out.println("---------------------------Without stream--------------------------------------------------------");
        for(String name:names){
            if(name.startsWith("A")){
                System.out.println(name);
            }
        }

    }
}
