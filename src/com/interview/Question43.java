package com.interview;


import java.util.LinkedHashMap;
import java.util.Map;

/*43. Persistent – Count the frequency of each word and remove duplicates from a sentence.*/
public class Question43
{
    public static void main(String[] args) {
        String para="Java is a high-level programming language. Java is widely used for building enterprise-level applications. Learning Java helps in understanding object-oriented programming.";
        Map<String,Integer> map=new LinkedHashMap<>();
        para=para.toLowerCase();
        String []array=para.split("\\W+");
        for(String word:array){
            map.put(word,map.getOrDefault(word,0)+1);
        }
        map.forEach((k,v)->{
            System.out.println(k+" "+v);
        });
        StringBuilder sb=new StringBuilder();
        for(String key:map.keySet()){
            sb.append(key+" ");
        }
        System.out.println(sb);
    }

}
