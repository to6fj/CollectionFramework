package com.interview;

import java.util.HashMap;
import java.util.Map;

public class AnagramString
{
    public static boolean isAnagram(String a, String b)
    {
        char []array1=a.toLowerCase().toCharArray();
        char []array2=b.toLowerCase().toCharArray();
        if(array1.length!=array2.length)
            return false;
        Map<Character,Integer> map=new HashMap<Character,Integer>();
        for(char c:array1)
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c:array2)
        {
            if(!map.containsKey(c))
            {
             return false;
            }
            map.put(c,map.get(c)-1);
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet())
        {
            if(entry.getValue()!=0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isAnagram2("medical","decimal"));
    }
    public  static  boolean isAnagram2(String a, String b)
    {
        char []array1=a.toLowerCase().toCharArray();
        char []array2=b.toLowerCase().toCharArray();
        int sum1,sum2=0;
        sum1=0;
        for(char c:array1)
        {
            sum1+=(int)c;
        }
        for(char c:array2)
        {
            sum2+=(int)c;
        }

        return sum1==sum2;

    }
}
