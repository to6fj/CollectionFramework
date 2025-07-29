package com.java8.functionalinterface.function;
import java.util.List;
import java.util.Arrays;
import java.util.function.Function;

/*
11. Use FuncƟon<Employee, String> to extract employee names from a list.
*/

public class Question11
{
    public static void main(String[] args) {
        Employee e1 = new Employee("Sejal Patankar", 101, 50000);
        Employee e2 = new Employee("Shubham Puri", 102, 62000);
        Employee e3 = new Employee("Varsha Raut", 103, 45000);
        Employee e4 = new Employee("Rohit Sharma", 104, 70000);
        Employee e5 = new Employee("Aarti Deshmukh", 105, 55000);
        Employee e6 = new Employee("Milind Godse", 106, 48000);
        Employee e7 = new Employee("Rahul Kharat", 107, 53000);
        Employee e8 = new Employee("Neha Kulkarni", 108, 67000);
        Employee e9 = new Employee("Aman Joshi", 109, 46000);
        Employee e10 = new Employee("Pooja Jadhav", 110, 51000);
        Function<Employee,String>name=e->e.getName();
        System.out.println(name.apply(e1));


    }
}
class Employee{
    private String name;
    private int employeeId;
    private int salary;

    public Employee(String name, int employeeId, int salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee Name:"+name+" Employee Id:"+employeeId+" Salary:"+salary;
    }
}
