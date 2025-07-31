package com.java8.functionalinterface.exercise;
/*
5.  Use BinaryOperator to find the employee with the highest salary from a list.
*/

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class Question30
{
    public static void main(String[] args) {
        BinaryOperator<Employee>highestSalary=(e1,e2)->e1.getSalary()>e2.getSalary()?e1:e2;

        Employee emp1 = new Employee("Alice Johnson", 101, 60000.00);
        Employee emp2 = new Employee("Bob Williams", 102, 75000.50);
        Employee emp3 = new Employee("Charlie Brown", 103, 50000.00);
        Employee emp4 = new Employee("Diana Miller", 104, 90000.75);
        Employee emp5 = new Employee("Eve Davis", 105, 62000.00);
        Employee emp6 = new Employee("Frank White", 106, 81000.20);
        Employee emp7 = new Employee("Grace Taylor", 107, 55000.00);
        Employee emp8 = new Employee("Harry Wilson", 108, 70000.00);
        Employee emp9 = new Employee("Ivy Moore", 109, 95000.00);
        Employee emp10 = new Employee("Jack Green", 110, 68000.00);

        List<Employee> employees= Arrays.asList(emp1,emp2,emp3,emp4,emp5,emp6,emp7,emp8,emp9,emp10);
        Optional<Employee> reduce = employees.stream().reduce(highestSalary);
        System.out.println(reduce.get().getSalary());


    }
}
