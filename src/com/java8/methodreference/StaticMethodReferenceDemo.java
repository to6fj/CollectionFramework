package com.java8.methodreference;


import java.util.Arrays;
import java.util.List;

public class StaticMethodReferenceDemo
{
    public static void main(String[] args) {
        List<String>names= Arrays.asList("Shubham","Pandit","Puri");
        names.forEach(StaticMethodReferenceDemo::display);
    }
    public static void  display(String name)
    {
        System.out.println(name);
    }
}
