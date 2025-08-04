package com.innerclass.anonymousinnerclass;
abstract class Shape
{
    public abstract void draw();
}
public class AnonymousAbstractDemo
{
    public static void main(String[] args) {
        Shape circle=new Shape() {
            @Override
            public void draw() {
                System.out.println("Circle  shape");
            }
        };
        circle.draw();
    }
}
