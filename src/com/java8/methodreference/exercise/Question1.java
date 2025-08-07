package com.java8.methodreference.exercise;

/*
1. Create a functional interface named Printable with a method print(). Use method reference to
refer to a static method that prints a message.
*/

import java.util.function.Consumer;

public class Question1
{
    public static void main(String[] args) {
       Printable <String>print=Question1::print;
        print.print("Hello");

    }
    public static  void print(String s)
    {
        System.out.println(s);
    }
}
@FunctionalInterface
interface  Printable <E>{
void print(E s);
}
