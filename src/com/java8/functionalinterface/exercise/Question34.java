package com.java8.functionalinterface.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

/*
34.Use BiPredicate to compare age and salary of two employees.
*/
public class Question34 {
    public static void main(String[] args) {
        Employee1 e1 = new Employee1(101, "Alice", 25, 50000);
        Employee1 e2 = new Employee1(102, "Bob", 28, 52000);
        Employee1 e3 = new Employee1(103, "Charlie", 30, 55000);
        Employee1 e4 = new Employee1(104, "David", 27, 51000);
        Employee1 e5 = new Employee1(105, "Eva", 26, 48000);
        Employee1 e6 = new Employee1(106, "Frank", 32, 57000);
        Employee1 e7 = new Employee1(107, "Grace", 29, 53000);
        Employee1 e8 = new Employee1(108, "Hank", 31, 56000);
        Employee1 e9 = new Employee1(109, "Ivy", 24, 47000);
        Employee1 e10 = new Employee1(110, "Jack", 33, 59000);
        BiPredicate<Employee1,Employee1>salary=(e11,e12)->e11.getSalary()> e12.getSalary();
        BiPredicate<Employee1,Employee1>age=(a,b)->a.getAge()>b.getAge();
        BiPredicate<Employee1, Employee1> and = salary.and(age);
        List<Employee1>employee1s= Arrays.asList(e1,e2,e3,e4,e5,e6,e7,e8,e9,e10);
        System.out.println(and.test(e1,e2));

    }
}

class Employee1{
    private int employeeId;
    private String name;
    private int age;
    private double salary;

    public Employee1(int employeeId, String name, int age, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public Employee1() {
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
