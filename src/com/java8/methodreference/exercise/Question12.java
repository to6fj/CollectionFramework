package com.java8.methodreference.exercise;

/*
12. Create a list of employees and use method references to map names and sort by salary.
*/

import java.util.*;
import java.util.stream.Collectors;

public class Question12 {
    static class Employee{
        private String name;
        private int age;
        private double salary;
        public Employee(String name, int age, double salary) {
            this.name = name;
            this.age = age;
            this.salary = salary;
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
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", salary=" + salary +
                    '}';
        }
        public boolean equals(Object o)
        {
            if (this == o) return true;
            if(o==null) return false;
            if(getClass()!=o.getClass()) return false;
            Employee employee = (Employee)o;
            return Objects.equals(this.name, employee.name);
        }
    }

    public static void main(String[] args) {
        Employee emp1=new Employee("shubham",26,98768.98);
        Employee emp2=new Employee("shrikant",21,68768.98);
        Employee emp3=new Employee("Dhiraj",26,98768.98);
        Employee emp4=new Employee("Akashh",24,28768.98);
        Employee emp5=new Employee("Omkar",23,18768.98);
        Employee emp6=new Employee("Omkar",23,18768.98);
        List<Employee> list= Arrays.asList(emp1,emp2,emp3,emp4,emp5,emp6);
        List<String> employeeNames = list.stream().map(Employee::getName).toList();
        employeeNames.forEach(System.out::println);
        System.out.println("===================================================");
        list.sort(Comparator.comparingDouble(Employee::getSalary).reversed());
        list.forEach(System.out::println);
        System.out.println("----------------------------------------------------------------------------");
        Map<String, Double> employees = list.stream().collect(Collectors.toMap(Employee::getName, Employee::getSalary,(existing,replace)->existing));
        employees.forEach((a,b)-> System.out.println(a+" "+b));
    }
}

