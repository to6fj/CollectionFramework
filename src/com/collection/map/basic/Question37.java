package com.collection.map.basic;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class Question37
{
    public static  boolean isAnagram(String a, String b)
    {
        if(a.length()!=b.length()) return false;
        char []array1=a.toLowerCase().toCharArray();
        char []array2=b.toLowerCase().toCharArray();
        Map<Character,Integer> map1=new HashMap<>();
        for(char c:array1){
            map1.put(c,map1.getOrDefault(c,0)+1);
        }
        for(char c:array2){
            if(!map1.containsKey(c)){
                return false;
            }
            map1.put(c,map1.get(c)-1);
            if(map1.get(c)<0){
                return false;
            }
        }
        for(Map.Entry<Character,Integer> entry:map1.entrySet()){
            if(entry.getValue()!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isAnagram2("study","dusty"));
        System.out.println(isAnagram2("Listen", "Silent"));
        System.out.println(isAnagram2("Hello", "World"));
    }
    public static  boolean isAnagram2(String a, String b)
    {
        char[]array1=a.toLowerCase().toCharArray();
        char[]array2=b.toLowerCase().toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);
        return Arrays.equals(array1,array2);
    }
}
