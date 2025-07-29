package com.interview;
/*
38. Infosys – IdenƟfy duplicate numbers in an array using Set.
*/

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Question38 {

    public static void main(String[] args) {
        Integer []array={8,7,9,3,5,6,9,6,3,1};
        Set<Integer>uniqueSet=new LinkedHashSet<Integer>();
        Set<Integer>duplicateSet=new LinkedHashSet<>();
        for(int a:array)
        {
            if(!uniqueSet.add(a))
            {
                duplicateSet.add(a);
            }
        }
        System.out.println(duplicateSet);
    }
}
