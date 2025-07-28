package com.collection.set;

/*
28. Group email addresses and print only unique domain names.
*/

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Question28 {
    public static void main(String[] args) {
        String[] emails = {
                "alice@gmail.com",
                "bob@yahoo.com",
                "charlie@gmail.com",
                "david@outlook.com",
                "eve@yahoo.com",
                "frank@protonmail.com",
                "grace@outlook.com",
                "heidi@icloud.com",
                "ivan@gmail.com",
                "judy@protonmail.com"
        };
        Set<String> set = new HashSet<>();
        for (String email : emails) {
            if(email.contains("@gmail.com")) {
                set.add(email);
            }
        }
        set.forEach(System.out::println);

    }
}
