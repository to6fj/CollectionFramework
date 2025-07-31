package com.java8.functionalinterface.function;

import java.util.function.Function;

/*
31. Mask an email address:
        "sejal123@gmail.com" → "sej****@gmail.com"*/
public class Question29
{
    public static void main(String[] args) {
        Function<String,String>emailHide=s->{

            int index=s.indexOf("@");
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<s.length();i++)
            {
                if(i>1 && i<index)
                {
                    sb.append("*");
                }
                else {

                    sb.append(s.charAt(i));
                }
            }
            return sb.toString();
        };
        System.out.println(emailHide.apply("shubhampuri1998@gmail.com"));
    }
}
