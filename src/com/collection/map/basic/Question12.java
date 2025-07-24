package com.collection.map.basic;

import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

/*
12. Create a TreeMap and store employee names in sorted order of keys.
*/

public class Question12 {
    public static void main(String[] args) {
        Map<Employee,Department>employeeDepartmentMap=employeeDepartmentMap();
        System.out.println(employeeDepartmentMap);

    }

    public static Map<Employee, Department> employeeDepartmentMap() {
        Employee e1 = new Employee(101, "Alice", 55000, "9876543210", "alice@example.com", "Pune");
        Employee e2 = new Employee(102, "Bob", 62000, "9876543211", "bob@example.com", "Mumbai");
        Employee e3 = new Employee(103, "Charlie", 48000, "9876543212", "charlie@example.com", "Nagpur");
        Employee e4 = new Employee(104, "David", 73000, "9876543213", "david@example.com", "Nashik");
        Employee e5 = new Employee(105, "Eve", 67000, "9876543214", "eve@example.com", "Pune");
        Employee e6 = new Employee(106, "Frank", 59000, "9876543215", "frank@example.com", "Mumbai");
        Employee e7 = new Employee(107, "Grace", 75000, "9876543216", "grace@example.com", "Pune");
        Employee e8 = new Employee(108, "Heidi", 62000, "9876543217", "heidi@example.com", "Aurangabad");
        Employee e9 = new Employee(109, "Ivan", 54000, "9876543218", "ivan@example.com", "Kolhapur");
        Employee e10 = new Employee(110, "Judy", 80000, "9876543219", "judy@example.com", "Pune");

        Department d1 = new Department(1, "HR");
        Department d2 = new Department(2, "Finance");
        Department d3 = new Department(3, "IT");
        Department d4 = new Department(4, "Sales");
        Department d5 = new Department(5, "Marketing");

        Map<Employee, Department> employeeDepartmentMap = new TreeMap<>(
                (a, b) -> a.getName().compareToIgnoreCase(b.getName())
        );

        employeeDepartmentMap.put(e1, d1);
        employeeDepartmentMap.put(e2, d2);
        employeeDepartmentMap.put(e3, d3);
        employeeDepartmentMap.put(e4, d1);
        employeeDepartmentMap.put(e5, d2);
        employeeDepartmentMap.put(e6, d4);
        employeeDepartmentMap.put(e7, d3);
        employeeDepartmentMap.put(e8, d5);
        employeeDepartmentMap.put(e9, d4);
        employeeDepartmentMap.put(e10, d2);
        return employeeDepartmentMap;
    }

}
class Employee {
    private int employeeId;
    private String name;
    private double salary;

    private String mobileNumber;
    private String email;
    private String address;

    public Employee(int employeeId, String name, double salary,  String mobileNumber, String email, String address) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;

        this.mobileNumber = mobileNumber;
        this.email = email;
        this.address = address;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }



    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if(o==null)
            return false;
        if(this == o)
            return true;
        if(getClass()!=o.getClass())
            return false;
        Employee employee = (Employee)o;
       return Objects.equals(this.employeeId, employee.employeeId) && Objects.equals(this.name,employee.name) && Objects.equals(this
               .mobileNumber , employee.mobileNumber);
    }


    @Override
    public int hashCode() {
        return Objects.hash(employeeId, name, mobileNumber);
    }
    public String toString()
    {
        return "Employee Name:"+name+" Employee Id:"+employeeId+" Employee Salary"+salary+" Employee Mobile:"+mobileNumber+" Employee Address:"+address+"\n";
    }
}
class Department{
    private int departmentId;
    private String name;

    public Department(int departmentId, String name) {
        this.departmentId = departmentId;
        this.name = name;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null)
            return false;
        if(this == obj)
            return true;
        if(getClass()!=obj.getClass())
            return false;
        Department department = (Department)obj;
        return Objects.equals(this.departmentId, department.departmentId) && Objects.equals(this.name, department.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departmentId, name);
    }

    @Override
    public String toString() {
        return  "Department Id:"+departmentId+" Department Name:"+name+"\n";
    }
}

