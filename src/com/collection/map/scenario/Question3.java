package com.collection.map.scenario;

/*
3. Character Frequency Counter:
        - Map<Character, Integer>
 - Input: "banana" -> Output: {b=1, a=3, n=2}
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question3 {
    public static void characterFrequency(String word)
    {
        Map<Character,Integer> map = new HashMap<>();
        char []characters = word.toCharArray();
        for(char c:characters){
            if(c==32)
            {
                continue;
            }
            int count=1;
            if(map.containsKey(c))
            {
                count=map.get(c);
                map.put(c,++count);
            }
            else {
                map.put(c,count);
            }
        }
        System.out.println(map);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Word to count its frequency!!!!!!!!!!!!!!!!!");
        String word = sc.nextLine();
        characterFrequency(word);

    }
}
