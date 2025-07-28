package com.collection.set;

/*
36. TCS – Remove duplicates from an array without using collecƟon.
*/

import java.util.Arrays;

public class Question36 {
    public static void main(String[] args) {
        int[]array={1,2,3,4,5,1,2,3,4,5};
        int []array2=new int[array.length];
        for(int i=0;i<array.length;i++)
        {
            boolean flag=false;
            for(int j=0;j<i;j++)
            {
                if(array[i]==array[j])
                {
                    flag=true;
                    break;
                }
            }
            if(flag)
            {
                array2[i]=array[i];
            }
        }
        for(int a:array2)
        {
            if(a!=0)
            {
                System.out.println(a);
            }
        }
    }
}
