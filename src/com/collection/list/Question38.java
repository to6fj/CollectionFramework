package com.collection.list;

/*
38. Demonstrate mutability difference between List.of() and Arrays.asList().
*/

import java.util.Arrays;
import java.util.List;

public class Question38 {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer>numbers2=List.of(1,2,3,4,5,6,7,8,9,10);
        /*
        1.In Both methods after creating list we can not remove data from list
        2.in Arrays.asList() we can update the data but in List.of() we can not update also
        3.If we are created Arrays.asList() using array then if we make any changes in array that will aslo reflects in List
        */

        try
        {
            numbers.add(2);
        }catch (UnsupportedOperationException e)
        {
            System.out.println("We can not add any data if we are created list using Arrays.asList()");
        }
        try {
            numbers2.add(3);
        }catch (UnsupportedOperationException e)
        {
            System.out.println("We can not add any data if we are created list using List.of(.....)");
        }
        try {
            numbers.remove(1);
        }catch (UnsupportedOperationException e)
        {
            System.out.println("We can not remove any data if we are created list using Arrays.asList(.....)");

        }
        try {
            numbers2.remove(2);
        }catch (UnsupportedOperationException e)
        {
            System.out.println("We can not remove any data if we are created list using List.of(.....)");

        }
        try {
            numbers.set(0,1000);
            System.out.println("We can only update existing list when we are created list using Arrays.asList(.....)");
            System.out.println("List Updated sucessfully");
        }catch (UnsupportedOperationException e)
        {
            System.out.println("Exception occured");
        }
        try {
            numbers2.set(0,20000);
        }catch (UnsupportedOperationException e)
        {
            System.out.println("We can not update any data if we are created list using List.of(.........) ");
        }
        numbers.forEach(System.out::println);
        System.out.println("---------------------------------------------------------------------------------");
        numbers2.forEach(System.out::println);
    }
}
