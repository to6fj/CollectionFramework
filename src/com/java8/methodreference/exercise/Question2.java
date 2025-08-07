package com.java8.methodreference.exercise;

import java.util.function.Consumer;

/*2. Define a class with an instance method show(). Use method reference to refer to this method via
an object.*/
public class Question2 {
    public static void main(String[] args) {
        Consumer<String>consumer=new Demo()::show;
        consumer.accept("Hello");
        consumer.accept("World");
    }
}
class Demo{
    public void show(String s)
    {
        System.out.println(s);
    }
}
