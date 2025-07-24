package com.collection.map.basic;

/*
17. Group a list of words by their first letter using a Map<Character, List<String>>.
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question17 {

    public static void main(String[] args) {
        String []names={"Shubham","Ashish","Bhavarth","Pravin","Mangesh","Shailesh","Ajay","Balaji","Patil"};
        Map<Character, List<String>>map=new HashMap<>();
        for(String name:names){
            char ch=name.toLowerCase().charAt(0);
            if(map.containsKey(ch)){
                List<String>namesList=map.get(ch);
                namesList.add(name);
            }
            else {
                List<String> namesList=new ArrayList<>();
                namesList.add(name);
                map.put(ch,namesList);
            }
        }
        map.forEach((k,v)-> System.out.println(k+" = "+v));
    }
}
