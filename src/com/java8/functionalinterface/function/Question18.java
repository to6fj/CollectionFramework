package com.java8.functionalinterface.function;

/*
18. Remove all non-alphabeƟc characters from a string.
*/

import java.util.function.Function;

public class Question18 {

    public static void main(String[] args) {
        String name="Shubham@123";
        StringBuilder sb=new StringBuilder();
        for(char c:name.toLowerCase().toCharArray())
        {
            if(c>='a' && c<='z')
            {
                sb.append(c);
            }
        }
        System.out.println(sb);

        Function<String,String>removeNonAlphabates=x->{
            StringBuilder sb2=new StringBuilder();
            for(char c:x.toLowerCase().toCharArray())
            {
                if(c>='a' && c<='z')
                 sb2.append(c);
            }
            return sb2.toString();
        };
        System.out.println(removeNonAlphabates.apply("Shubham@1234Puri__Dell157570Inspiron"));
    }
}
