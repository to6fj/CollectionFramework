package com.java8.methodreference.exercise;

import java.util.Arrays;
import java.util.List;

/*7. Sort a list of objects (e.g., students by age) using a method reference to an instance method of
an arbitrary object.*/
public class Question7 {
    public static void main(String[] args) {
        StudentInterface a=Student::new;
        Student shubham = a.add("shubham",26);
        Student shriknant=a.add("shriknant",22);
        Student ajay=a.add("ajay",20);
        Student vijay=a.add("vijay",10);
        List<Student>students= Arrays.asList(shubham,shriknant,ajay,vijay);
        students.sort(Question7::compareByAge);
        students.forEach(System.out::println);

    }
    public static  int compareByAge(Student s1, Student s2) {
        return -Integer.compare(s1.getAge(),s2.getAge());
    }
}

