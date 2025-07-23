package com.collection.map.scenario;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
28. Remove duplicates using HashMap.
*/
public class Question23 {
    public static void main(String[] args) {
        List<String>names=List.of("shubham","shrikant","shubham","shrikant","Ajay","Ajay");

        Map<String,Integer> map=new HashMap<>();
        for(String s:names){
            map.put(s,0);
        }
        map.forEach( (k,v)->{
            System.out.println(k);
        });
    }
}
