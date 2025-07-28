package com.collection.set;
import java.util.Set;
import java.util.TreeSet;

public class Question29
{
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>((a,b)->-(a.length()-b.length()));
        set.add("a");
        set.add("abc");
        set.add("abcd");
        set.add("abcde");
        set.add("abcdef");
        set.add("abcdefg");
        set.forEach(System.out::println);
    }
}
