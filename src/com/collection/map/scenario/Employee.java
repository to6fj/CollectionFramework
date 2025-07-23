package com.collection.map.scenario;

import java.util.Objects;

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
        return "Employee Id: "+this.employeeId+" Employee Name:"+this.name+" Age:"+this.age+" Salary:"+this.salary+"\n";
    }
}