package com.java8.functionalinterface.function;

/*
23. Convert a list of Employee to a list of salaries using FuncƟon<Employee, Double>.
*/

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Question23 {
    public static void main(String[] args) {
        Emp e1 = new Emp(101, "Sejal Patankar", 52000.0);
        Emp e2 = new Emp(102, "Shubham Puri", 61000.0);
        Emp e3 = new Emp(103, "Varsha Raut", 48000.0);
        Emp e4 = new Emp(104, "Rohit Sharma", 75000.0);
        Emp e5 = new Emp(105, "Aarti Deshmukh", 56000.0);
        Emp e6 = new Emp(106, "Milind Godse", 47000.0);
        Emp e7 = new Emp(107, "Rahul Kharat", 53000.0);
        Emp e8 = new Emp(108, "Neha Kulkarni", 68000.0);
        Emp e9 = new Emp(109, "Aman Joshi", 45000.0);
        Emp e10 = new Emp(110, "Pooja Jadhav", 51000.0);
        List<Emp>emps= Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10);
        Function<Emp,Double>salaries=emp->  emp.getSalary();
        List<Double> list = emps.stream().map(salaries).toList();
        list.forEach(System.out::println);


    }
}
class Emp{
    private int  empId;
    private String  empName;
    private double   salary;

    public Emp(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    public Emp() {
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee Id=" + empId + ", Employee Name=" + empName + ", Employee salary="+salary;
    }
}
