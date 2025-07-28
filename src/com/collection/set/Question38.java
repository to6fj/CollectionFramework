package com.collection.set;

/*
38. Infosys – IdenƟfy duplicate numbers in an array using Set.
*/
import java.util.HashSet;
import java.util.Set;

public class Question38 {

    public static void main(String[] args) {
        Integer []array={1,2,3,4,5,6,7,8,9,10,1,2,3,4};
        Set<Integer> uniqueSet=new HashSet<Integer>( );
        Set<Integer>duplicateSet=new HashSet<>();
        for(int a:array)
        {
            if(!uniqueSet.add(a))
            {
                duplicateSet.add(a);
            }
        }
        duplicateSet.forEach(System.out::println);
        System.out.println("-------------------------------------------------");
        uniqueSet.forEach(System.out::println);
    }
}
