package com.collection.list;

/*
41. Remove duplicates from a List using Set or Java Streams.
*/

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class Question41
{
    public static<E> List<E>removeDuplicates(List<E> list)
    {
        List<E>uniqueList=new ArrayList<>();
        for(int i=0;i<list.size();i++)
        {
            boolean flag=false;
            for(int j=0;j<i;j++)
            {

                if(list.get(i).equals(list.get(j)))
                {
                    flag=true;
                    break;
                }
            }
            if(!flag)
            {
                uniqueList.add(list.get(i));
            }
        }
        return uniqueList;
    }

    public static void main(String[] args) {
        List<String> list=new ArrayList<>(List.of("Shubham","Shrikant","Shubham","Shrikant","Shailesh","Patil"));
        Set<String>names=new HashSet<>(list);
        System.out.println(names);
        list.stream().distinct().forEach(System.out::println);
    }
}
