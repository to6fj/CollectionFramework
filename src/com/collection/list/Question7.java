package com.collection.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*
7.	Sort a list of custom Employee objects using ArrayList based on salary.
*/
class Employee{
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
        return "Name:"+this.name+" Employee No:"+this.empId+" Salary:"+this.salary+"\n";
    }
}
public class Question7 {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Alice", 55000.0);
        Employee e2 = new Employee(102, "Bob", 60000.0);
        Employee e3 = new Employee(103, "Charlie", 52000.0);
        Employee e4 = new Employee(104, "David", 75000.0);
        Employee e5 = new Employee(105, "Eve", 68000.0);
        Employee e6 = new Employee(106, "Frank", 72000.0);
        Employee e7 = new Employee(107, "Grace", 58000.0);
        Employee e8 = new Employee(108, "Heidi", 64000.0);
        Employee e9 = new Employee(109, "Ivan", 71000.0);
        Employee e10 = new Employee(110, "Judy", 67000.0);
        List<Employee>employees=new ArrayList<Employee>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
        employees.add(e6);
        employees.add(e7);
        employees.add(e8);
        employees.add(e9);
        employees.add(e10);
//      employees.sort(new SalaryComparator());
//      employees.sort((a,b)->Double.compare(b.getSalary(),a.getSalary()));
        Comparator<Employee>salaryComparator=Comparator.comparing(Employee::getSalary).reversed();
        employees.sort(salaryComparator);
        employees.forEach(System.out::println);
    }
}
class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return Double.compare(o2.getSalary(), o1.getSalary());
    }
}
