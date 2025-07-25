package com.interview;

import java.util.*;

public class PanagramString
{
    public static boolean isPanagram(String sentence)
    {
        sentence=sentence.toLowerCase().replaceAll("\\s+","");
        String[] split = sentence.split("");
        Map<Character,Integer> map=new HashMap<Character,Integer>();
        for(int i=97;i<=122;i++) {
            map.put((char) i, 0);
        }
        for(String s:split) {
            char ch=s.charAt(0);
            if(map.containsKey(ch)) {
                map.put(ch, map.get(ch)+1);
            }
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet()) {
            if(entry.getValue()==0) {
                return false;
            }
        }
        return  true;
    }
    public static void main(String[] args) {
        System.out.println(isPanagram2("The quick brown fox jumps over the lazy dog"));
        System.out.println(isPanagram2("The quick brown fox jumps over the lazy dog"));
    }

    public static boolean isPanagram2(String sentence) {
        char[] array1=sentence.toLowerCase().toCharArray();
        Set<Character>set=new HashSet<Character>();
        for(char c:array1) {
            if(c>='a' && c<='z') {
                set.add(c);
            }
        }
        return  set.size()==26;
    }

}
