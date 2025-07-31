package com.java8.functionalinterface.exercise;

/*
1.  Write a consumer to print each element of a list.
*/

import java.util.List;
import java.util.function.Consumer;

public class Question11
{
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
        Consumer<List<String>>consumer=x->{
            for(String email:x){
                System.out.println(email);
            }
        };
        consumer.accept(employeeEmails);

    }
}
