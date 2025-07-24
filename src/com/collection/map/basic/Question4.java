package com.collection.map.basic;
/*
4. Remove an entry from the map using the key.
*/

import java.util.HashMap;
import java.util.Map;

public  class Question4 {
    public  static  Map map=new HashMap<>();
    public static void main(String[] args) {
        map.put(1,"One");
        map.put(1,"One");
        map.put(2,"Two");
        map.put(3,"Three");
        map.put(4,"Four");
        map.put(5,"Five");
        map.put(6,"Six");
        map.put(7,"Seven");
        map.put(8,"Eight");
        if(removeEntry(7))
        {
            System.out.println("Entry is removed");
        }else {
            System.out.println("Entry is not removed");
        }

    }
    public static  boolean removeEntry(Integer key)
    {
        if(map.containsKey(key)){
            map.remove(key);
            return true;
        }
        return false;
    }
}
