package com.java8.functionalinterface.function;

import java.util.function.Function;

/*33. Generate usernames from full names: "Sejal Patankar" → "sejal.p".*/
public class Question31
{
    public static void main(String[] args) {
        Function<String,String>generateUserName=x->{
            String []array=x.split(" ");
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<array.length;i++)
            {
                if(i==0)
                {
                    sb.append(array[i]).append(".");
                }else {
                    sb.append(array[i].charAt(0)).append(".");
                }

            }
            return sb.toString();
        };
        System.out.println(generateUserName.apply("Shubham Pandit Puri Latur Pune Omerga Parbhani Mumbai Delhi"));
    }
}
