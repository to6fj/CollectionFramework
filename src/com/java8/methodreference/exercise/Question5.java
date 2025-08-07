package com.java8.methodreference.exercise;

import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

/*5. Create a method that returns the square of a number. Use method reference to refer to this
method using Function.*/
public class Question5 {
    public static void main(String[] args) {
        IntUnaryOperator power=Question5::square;
        System.out.println(power.applyAsInt(10));
    }
    public static  int square(int num) {
        return num * num;
    }
}
