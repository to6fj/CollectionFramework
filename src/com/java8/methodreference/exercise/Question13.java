package com.java8.methodreference.exercise;

/*
13. Use a constructor reference with a Supplier to instantiate objects.
*/

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class Question13 {
    public static void main(String[] args) {
        BiFunction<String, Integer, StudentMCA> supplier=StudentMCA::new;
        StudentMCA studentMCA = supplier.apply("shubham",22);
        System.out.println(studentMCA);
    }
}
class StudentMCA {
    public StudentMCA() {
    }

    private String name;
private int age;

    public StudentMCA(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "StudentMCA{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}

