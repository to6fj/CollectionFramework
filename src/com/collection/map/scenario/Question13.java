package com.collection.map.scenario;

/*
13. Custom Sorting - Comparator-based sorting of employees by salary/name.
*/

import java.util.*;

public class Question13 {
    public static void main(String[] args) {
//        Map<Employee,String> employees = new TreeMap<>(new EmployeeNameComparator());
//        Map<Employee,String> employees = new TreeMap<>(new EmployeeSalaryComparator());
//        Map<Employee,String> employees = new TreeMap<>((o1, o2) -> o1.getName().compareTo(o2.getName()));
        Map<Employee,String> employees = new TreeMap<>((o1, o2) -> Double.compare(o1.getSalary(), o2.getSalary()));
//        Map<Employee,String> employees = new TreeMap<>((o1, o2) -> -Double.compare(o1.getSalary(), o2.getSalary()));
        employees.put(new Employee("John", 1, 25, 50000), "IT");
        employees.put(new Employee("Emma", 2, 28, 52000), "HR");
        employees.put(new Employee("Raj", 3, 30, 60000), "Finance");
        employees.put(new Employee("Priya", 4, 27, 48000), "Sales");
        employees.put(new Employee("Michael", 5, 35, 75000), "Marketing");
        employees.put(new Employee("Sophia", 6, 26, 51000), "Support");
        employees.put(new Employee("Amit", 7, 32, 67000), "Admin");
        employees.put(new Employee("Neha", 8, 24, 47000), "Legal");
        employees.put(new Employee("David", 9, 29, 55000), "Research");
        employees.put(new Employee("Anjali", 10, 31, 69000), "Operations");
        employees.forEach((key,value) -> System.out.println(key+":"+value));

        List<Map.Entry<Employee,String>>empList=new ArrayList<>(employees.entrySet());
        empList.sort((a,b)->a.getValue().compareTo(b.getValue()));
        System.out.println("------------------------------------------------------------------------------");
        empList.forEach(entry -> System.out.println(entry.getKey()+":"+entry.getValue()));
    }
}
class EmployeeNameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
class EmployeeSalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return Double.compare(o1.getSalary(), o2.getSalary());
    }
}
class Employee {
    private int employeeId;
private String name;
private int age;
private double salary;

    public Employee() {

    }

    public Employee(String name,int employeeId, int age, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.age = age;
        this.salary = salary;
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
    public boolean equals(Object obj) {
        if(obj==null) return false;
        if(this==obj) return true;
        if(obj.getClass()!=this.getClass()) return false;
        Employee employee = (Employee)obj;
        return employee.getEmployeeId()==this.getEmployeeId() && Objects.equals(employee.getName(), this.getName());
    }
    public int hashCode() {
        return Objects.hash(employeeId, name);
    }
    public  String toString() {
        return "Employee Id: "+this.employeeId+" Employee Name:"+this.name+" Age:"+this.age+" Salary:"+this.salary;
    }
}