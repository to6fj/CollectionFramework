package com.collection.set;

/*
28. Group email addresses and print only unique domain names.
*/


import java.util.*;

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
                "judy@protonmail.com",
                "shubhampuri1998@gmail.com"
        };
        Map<String,List<String>> map = new HashMap<>();
        for(String email : emails) {
            int index = email.indexOf('@');
            String domain=email.substring(index);
            if(!map.containsKey(domain)) {
                map.put(domain, new ArrayList<>());
            }
            map.get(domain).add(email);


        }
        map.forEach( (k,v) -> {
            System.out.println(k+" "+v);
        });

    }
}
