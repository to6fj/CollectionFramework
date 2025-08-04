package com.innerclass.anonymousinnerclass;

class Animal
{
    public void sound()
    {
        System.out.println("Animal class");
    }
}
public class ConcreteClassDemo
{
    public static void main(String[] args) {
        Animal dog=new Animal(){
            @Override
            public void sound() {
                System.out.println("Dog sound");
            }
        };
        dog.sound();
    }
}
