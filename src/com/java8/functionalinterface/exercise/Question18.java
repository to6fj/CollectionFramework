package com.java8.functionalinterface.exercise;

/*
3.  Write a supplier to return a new Employee object.
*/

import java.util.function.Supplier;

public class Question18 {
    public static void main(String[] args) {
        Supplier<Employee>employeeSupplier=()->new Employee();
        System.out.println(employeeSupplier.get());
    }
}


