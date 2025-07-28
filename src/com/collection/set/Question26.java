package com.collection.set;

/*
26. Remove duplicates from a list of employees based on id using Set.
*/

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Question26 {

    public static void main(String[] args) {
        Employee employee1 = new Employee(121,"Shubham",154094);
        Employee employee2 = new Employee(131,"Shrikant",44094);
        Employee employee3 = new Employee(141,"Akshay",24094);
        Employee employee4 = new Employee(151,"Ajay",44094);
        Employee employee5= new Employee(161,"Avinash",14094);
        Employee employee6= new Employee(161,"Avinash",14094);
        Employee employee7= new Employee(161,"Avinash",14094);
        Set<Employee> set = new HashSet<>();
        set.add(employee1);
        set.add(employee2);
        set.add(employee3);
        set.add(employee4);
        set.add(employee5);
        set.add(employee6);
        set.add(employee7);
        set.forEach(System.out::println);

    }
}
class Employee
{
    private int empId;
    private String name;
    private double salary;

    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    public Employee() {
    }

    public int getEmpId() {

        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee Id:"+empId+" Name:"+name+" Salary:"+salary;
    }
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null) return false;
        if(o.getClass()!=getClass())
            return false;
        Employee employee = (Employee)o;
        return empId==employee.empId;
    }
    public int hashCode() {
        return Objects.hash(empId);
    }
}
