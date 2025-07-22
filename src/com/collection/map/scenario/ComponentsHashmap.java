package com.collection.map.scenario;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ComponentsHashmap
{
    public static void main(String[] args) {

        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Map is an interface");
        System.out.println("Map is an interface which can store key-value pair");
        System.out.println("Map does not belong to collection hierarchy");
        System.out.println("HashMap is implementation class of Map(I)");
        System.out.println("In Map keys are always unique and value can be duplicated");
        System.out.println("Null insertion is allowed");
        System.out.println("1.Only one null value is allowed for key");
        System.out.println("multiple null value can have for values in map");
        System.out.println("Basic Components of HashMap ");
        System.out.println("1.key:The identifier used for retrieve values");
        System.out.println("2.value:The data associated with the key is value");
        System.out.println("3.bucket:A place where key-value pair is stored(array)");
        System.out.println("4.hashfunction:convert key into an index bucket location storage");

    }
}
