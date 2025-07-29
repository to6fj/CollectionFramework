package com.java8.functionalinterface.function;

/*
19. Remove all whitespaces from a string.
*/

import java.util.function.Function;

public class Question19 {
    public static void main(String[] args) {
        String name="Shubham Pandit Puri";
        Function<String,String>removeSpaces=x->{
            StringBuilder sb2=new StringBuilder();
            for(char c:x.toLowerCase().toCharArray()){
                if(c!=32){
                    sb2.append(c);
                }
            }
            return sb2.toString();
        };
        System.out.println(removeSpaces.apply("Shubham Pandit Puri     "));
    }
}
