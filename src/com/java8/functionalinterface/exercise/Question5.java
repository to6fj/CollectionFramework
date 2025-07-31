package com.java8.functionalinterface.exercise;

/*
5.  Check if all employees in a list have salary > 50,000 using Predicate.
*/

import java.util.Arrays;
import java.util.List;

public class Question5 {
    public static void main(String[] args) {
        // Assuming Employee class has:
// private String name;
// private int empId;
// private double salary;
// and the constructor: public Employee(String name, int empId, double salary)

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

        List<Employee>employees= Arrays.asList(emp1,emp2,emp3,emp4,emp5,emp6,emp7,emp8,emp9,emp10);
        employees.stream()
                .filter(emp->emp.getSalary()>50000)
                .forEach(System.out::println);
    }
}
class Employee
{
    private String name;
    private int empId;
    private double salary;

    public Employee() {
    }

    public Employee(String name, int empId, double salary) {
        this.name = name;
        this.empId = empId;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee Name:"+name+" Employee Id:"+empId+" Salary:"+salary;
    }
}
