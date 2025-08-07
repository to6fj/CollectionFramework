package com.java8.methodreference;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.UnaryOperator;

class  Test
{
    int add(int a,int b)
    {
        return a + b;
    }
}
public class InstanceMethodReferenceDemo {
    public static void main(String[] args) {
        Test test=new Test();

        IntBinaryOperator  add=test::add;
        System.out.println(add.applyAsInt(10,20));

    }
}

