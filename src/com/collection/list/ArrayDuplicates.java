package com.collection.list;

import java.util.Arrays;

public class ArrayDuplicates
{
    public static void main(String[] args) {
        int []arr=new int[]{1,2,3,2,1};
        int []unique=remove(arr);
        System.out.println(Arrays.toString(unique));
    }
    public static  int[] remove(int []a)
    {
        int []unique=new int[a.length];
        for(int i=0;i<a.length;i++)
        {
            boolean flag=false;
            for(int j=0;j<i;j++)
            {
                if(a[i]==a[j])
                {
                    flag=true;
                    break;
                }
            }
            if(!flag)
            {
                unique[i]=a[i];
            }
        }
        return unique;
    }
}
