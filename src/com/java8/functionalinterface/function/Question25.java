package com.java8.functionalinterface.function;
/*
14. Create a Function that takes an integer and returns true if it's a palindrome (as string).
*/

import java.util.function.Function;

public class Question25 {
    public static void main(String[] args) {
        Function<Integer,Boolean>isPalindromeNumber=x->{
            int temp=x;
            int rem=0;
            int rev=0;
            while (temp!=0)
            {
                rem=temp%10;
                rev=rev*10+rem;
                temp/=10;
            }
            return rev==x;
        };
        System.out.println(isPalindromeNumber.apply(1011));
        Function<String,Boolean>isPalindromeString=x->{
            StringBuilder sb=new StringBuilder(x.toLowerCase());
            sb.reverse();
            return sb.toString().equals(x.toLowerCase());
        };
        System.out.println(isPalindromeString.apply("asa"));
    }
}
