package com.java8.functionalinterface.exercise;
/*
5.  Create a function that extracts domain name from an email address.
*/

import java.util.List;

public class Question10 {
    public static void main(String[] args) {
        List<String> employeeEmails = List.of(
                "alice.johnson@company.com",
                "bob.williams@company.com",
                "charlie.brown@company.com",
                "diana.miller@company.com",
                "eve.davis@company.com",
                "frank.white@company.com",
                "grace.taylor@company.com",
                "harry.wilson@company.com",
                "ivy.moore@company.com",
                "jack.green@company.com"
        );
        List<String> employeeNames = employeeEmails.stream().map(x -> {
            int index = x.indexOf('@');
            return x.substring(0, index).replace("."," ").toUpperCase();
        }).toList();
        employeeNames.forEach(System.out::println);
    }
}
