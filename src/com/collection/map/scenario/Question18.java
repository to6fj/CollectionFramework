package com.collection.map.scenario;

import java.util.*;

/*
18. Group Employees by Department:
        - Map<String, List<Employee>>: Grouping & highest salary.
*/
public class Question18 {
    public static void main(String[] args)
    {
        Map<String, List<Employee>>employees=new HashMap<>();
        Employee e1 = new Employee("John", 101, 28, 222500);
        Employee e2 = new Employee("Alice", 102, 31, 58000);
        Employee e3 = new Employee("Bob", 103, 25, 47000);
        Employee e4 = new Employee("Diana", 104, 29, 62000);
        Employee e5 = new Employee("Rahul", 105, 34, 69000);
        Employee e6 = new Employee("Sneha", 106, 27, 53000);
        Employee e7 = new Employee("Amit", 107, 30, 61000);
        Employee e8 = new Employee("Priya", 108, 26, 55000);
        Employee e9 = new Employee("Karan", 109, 32, 67000);
        Employee e10 = new Employee("Neha", 110, 24, 48000);
        employees.put("IT",new ArrayList<>(List.of(e1,e2,e3)));
        employees.put("Networking",new ArrayList<>(List.of(e6)));
        employees.put("Cloud",new  ArrayList<>(List.of(e7,e8,e9,e10,e4,e5)));
        Set<Map.Entry<String, List<Employee>>> entries = employees.entrySet();
        List<Map.Entry<String, List<Employee>>> list = new ArrayList<>(entries);
        double maxSalary=Double.MIN_VALUE;
        for(Map.Entry<String, List<Employee>> entry : list) {

            for(Employee emp:entry.getValue())
            {
                if(emp.getSalary()>maxSalary)
                {
                    maxSalary=emp.getSalary();
                }
            }
        }
        for(Map.Entry<String,List<Employee>> entry : employees.entrySet()) {
            entry.getValue().sort((a,b)->-(Double.compare(a.getSalary(),b.getSalary())));
        }
        list.forEach(entry-> {
            System.out.println(entry.getKey()+" "+entry.getValue());
        });

        System.out.println(maxSalary);
     }

}
