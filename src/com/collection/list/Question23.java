package com.collection.list;

/*
23. Auto-SuggesƟon: Suggest names from ArrayList based on prefix.
*/

import java.util.ArrayList;
import java.util.Scanner;



public class Question23 {
    private static ArrayList<String> names=new ArrayList<>();
    public static  void addName(){
        System.out.println("Enter Name:");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        names.add(name);
        System.out.println("Name added successfully");
    }
    public static  void filter(String prefix)
    {
        if(names.isEmpty())
        {
            System.out.println("No Names found");
            return;
        }
        for(String name:names){
            if(name.startsWith(prefix))
            {
                System.out.print(name+",");
            }
        }

    }
    public static void display()
    {
        System.out.println(names);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        while(true){
            System.out.println("Enter Your Choice:");
            System.out.println("1.Add Name");
            System.out.println("2.Filter Records");
            System.out.println("3.Display Records");
            System.out.println("4.Exit");
            int choice=sc.nextInt();
            switch (choice) {
                case 1:
                    addName();
                    break;
                case 2:
                    System.out.println("Enter Prefix");
                    sc.nextLine();
                    String prefix=sc.nextLine();
                    filter(prefix);
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    return;
            }

        }

    }
}
