package com.collection.set;

/*
19. Find the first duplicate word in a sentence.
*/

import java.util.HashSet;
import java.util.Set;

public class Question19 {
    public static void main(String[] args) {
        String sentence="This is a test. This test is simple";
        String[] a=sentence.toLowerCase().split(" ");
        Set<String> set=new HashSet<>();
        for(String s:a){
            if(set.contains(s)){
                System.out.println("first duplicate word is "+s);
                break;
            }
            set.add(s);
        }

    }
}
