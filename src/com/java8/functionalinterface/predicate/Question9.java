package com.java8.functionalinterface.predicate;
    /*
    9. Filter a list of employee objects where salary > 50000 using Predicate.
    */
import java.util.List;

public class Question9 {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Shubham Pandit", 55000);
        Employee e2 = new Employee(102, "Sejal Patankar", 48000);
        Employee e3 = new Employee(103, "Ravi Kumar", 62000);
        Employee e4 = new Employee(104, "Priya Sharma", 51000);
        Employee e5 = new Employee(105, "Aman Verma", 45000);
        Employee e6 = new Employee(106, "Nikita Joshi", 70000);
        Employee e7 = new Employee(107, "Rahul Deshmukh", 39000);
        Employee e8 = new Employee(108, "Sneha Kulkarni", 52000);
        Employee e9 = new Employee(109, "Aditya Mehta", 61000);
        Employee e10 = new Employee(110, "Tanvi Rane", 47000);

        List<Employee> employees=List.of(e1,e2,e3,e4,e5,e6,e7,e8,e9,e10);
        List<Employee> list = employees.stream().filter(x -> x.getSalary() > 50000.00).toList();
        list.forEach(System.out::println);

    }
}
class Employee
{
    private int empId;
    private String empName;
    private double salary;

    public Employee(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
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
        return "Employee Name:"+empName+" Employee Id:"+empId+" Employee Salary:"+salary;
    }
}
