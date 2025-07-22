package com.collection.list;

/*
45. Find the second-largest number in a given List of integers.
*/

import java.util.ArrayList;
import java.util.List;

public class Question45 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(List.of(1,2,3,4,5,6,7,8,11,211));
        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        for(int i:list){
            if(i>max)
            {
                secondMax=max;
                max=i;
            }else if(i>secondMax && i!=max){
                secondMax=i;
            }
        }
        System.out.println(max);
        System.out.println(secondMax);

    }
}
