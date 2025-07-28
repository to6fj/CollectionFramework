package com.interview;

import java.util.Arrays;

public class DuplicateArray
{
    public static void main(String[] args) {
        int []arr={8,7,9,3,5,6,9,6,3,1};
        int []arr2=new int[arr.length];
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            boolean flag=false;
            for(int j=0;j<i;j++)
            {
                if(arr[j]==arr[i])
                {
                    flag=true;
                    break;
                }
            }
            if(!flag)
            {
                arr2[count++]=arr[i];
            }
        }
      for(int a:arr2)
      {
          if(a!=0)
          {
              System.out.println(a);
          }
      }
    }
}
