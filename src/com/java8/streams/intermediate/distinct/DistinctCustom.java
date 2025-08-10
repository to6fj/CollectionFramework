package com.java8.streams.intermediate.distinct;

import java.util.List;
import java.util.Objects;

public class DistinctCustom {
    public static void main(String[] args) {

        Employee emp1=new Employee("shubham puri",254,75900.00);
        Employee emp2=new Employee("shubham chaudhari",210,45900.00);
        Employee emp3=new Employee("shrikant surve",362,45900.00);
        Employee emp4=new Employee("Ganesh Mote",204,5900.00);
        Employee emp5=new Employee("Omkar Patil",250,7900.00);
        Employee emp6=new Employee("shubham puri",254,75900.00);
        List<Employee>employees=List.of(emp1,emp2,emp3,emp4,emp5,emp6);
        List<Employee> employeesUnique = employees.stream().distinct().toList();
        employeesUnique.forEach(employee -> System.out.println(employee.toString()));
    }
}
class Employee
{
    private String employeeName;
    private int employeeId;
    private double salary;

    public Employee(String employeeName, int employeeId, double salary) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
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
                "employeeName='" + employeeName + '\'' +
                ", employeeId=" + employeeId +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if(obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Employee other = (Employee)obj;
        return Objects.equals(this.employeeId,other.employeeId);
    }
    public int hashCode()
    {
        return Objects.hash(employeeId);
    }

}
