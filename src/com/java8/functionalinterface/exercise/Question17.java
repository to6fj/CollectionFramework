package com.java8.functionalinterface.exercise;

/*
17.  Write a supplier to return current date and time.
*/

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.Supplier;

public class Question17
{
    public static void main(String[] args) {
        Supplier<Long>getTime=()->new Date().getTime();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd-MM-yyyy");
        System.out.println(simpleDateFormat.format(new Date()));
        System.out.println(getTime.get());
        System.out.println(getTime.get());
        System.out.println(getTime.get());
        System.out.println(getTime.get());
    }
}
