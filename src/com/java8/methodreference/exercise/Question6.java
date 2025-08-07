package com.java8.methodreference.exercise;
/*
6. Define a functional interface and use constructor reference to create objects of a class.
*/

public class Question6 {
    public static void main(String[] args) {
        StudentInterface a=Student::new;
        Student shubham = a.add("shubham",26);
        System.out.println(shubham);

    }
}
interface StudentInterface {
    public Student add(String name,int age);
}
class Student{
    private String name;
    private  int age;

    public Student(String name,int age) {
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
        return "Student{" +
                "name='" + name + '\'' +
                "age=" + age+
                '}';
    }
}
