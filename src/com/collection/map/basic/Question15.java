package com.collection.map.basic;
/*
15. Count the frequency of each character in a string using a HashMap.
*/

import java.util.HashMap;
import java.util.Map;

public class Question15
{

    public static void main(String[] args) {

        String name = "banana";
        char[]chars=name.toCharArray();
        Map<Character,Integer>frequnecy=new HashMap<Character,Integer>();
        for(char c:chars){
            int count=1;
            if(!frequnecy.containsKey(c)){
                frequnecy.put(c,count);
            }
            else {
                count = frequnecy.get(c);
                frequnecy.put(c,count+1);
            }
        }
        System.out.println(frequnecy);
    }
}
