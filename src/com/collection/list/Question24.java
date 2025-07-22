package com.collection.list;

/*
24. Train Bogie SimulaƟon: Add/remove bogies at front/back.
*/

import java.util.LinkedList;
import java.util.Scanner;

public class Question24 {

    public static LinkedList<String>train=new LinkedList();
    public static void addBogie(String bogieName)
    {
        train.addLast(bogieName);
        System.out.println("Bogie added successfully");
    }
    public static void removeBogie()
    {
        if(train.isEmpty())
        {
            System.out.println("No Bogie attached to train");
            return;
        }
        train.removeFirst();
        System.out.println("Bogie removed successfully");
    }
    public static void showTrain()
    {
        System.out.println(train);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            System.out.println("Enter Your Choice:");
            System.out.println("1.Add Bogie");
            System.out.println("2.Remove Bogie");
            System.out.println("3.Show Train");
            System.out.println("4.Exit");
            int choice=sc.nextInt();
            switch(choice) {

                case 1 :
                    System.out.println("Enter Bogie Name:");
                    String bogieName=sc.next();
                    addBogie(bogieName);
                    break;
               case 2 :
                   removeBogie();
                   break;
               case 3 :
                   showTrain();
                   break;
               case 4 :
                   return;
            }
        }
    }
}
