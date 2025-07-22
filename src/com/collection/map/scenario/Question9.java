package com.collection.map.scenario;

/*
9. Word Count from File - Map<String, Integer>: Read file, count words.
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question9
{
    public static void countWords(String []array)
    {
        Map<String,Integer> map = new HashMap<>();
        for(String word:array)
        {
            int count=1;
            if(map.containsKey(word))
            {
                count=map.get(word);
                map.put(word,++count);
            }
            else {
                map.put(word,count);
            }
        }
        for(Map.Entry<String,Integer> entry:map.entrySet())
        {
            if(entry.getValue()>1)
            {
                System.out.println(entry.getKey()+":"+entry.getValue());
            }
        }
    }
    public static void main(String[] args) {
        try (FileInputStream inputStream=new FileInputStream("E:\\IntelliJ\\CollectionFramework\\src\\com\\collection\\map\\scenario\\abc.txt"))
        {
            String para="";
            Scanner scanner=new Scanner(inputStream);
            while (scanner.hasNextLine()) {
                para+=(scanner.nextLine().toLowerCase());
            }
           String[]array=para.split(" ");
            countWords(array);
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
