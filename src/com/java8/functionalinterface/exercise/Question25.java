package com.java8.functionalinterface.exercise;

import java.util.function.UnaryOperator;

/*
5.  Write a UnaryOperator to remove all vowels from a string.
*/
public class Question25{
     public static void main(String[] args) {
         UnaryOperator<String>operator=x->{
             StringBuilder sb=new StringBuilder();
             for(char c:x.toLowerCase().toCharArray()){
                 if(!(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')){
                     sb.append(c);
                 }
             }
             return sb.toString();
         };
         System.out.println(operator.apply("hello"));
    }
}
