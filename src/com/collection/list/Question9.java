package com.collection.list;

import java.util.Scanner;
import java.util.Vector;

/*
    9.	Use a Vector to manage a dynamic list of tasks (add, remove, list all).
*/


public class Question9 {
    public static <E> boolean add(Vector<E> v, E e) {
        return v.add(e);
    }
    public  static <E> boolean remove(Vector<E> v, E e) {
        return v.remove(e);
    }
    public static <E> void remove(Vector<E>v,int index) {
        v.remove(index);
    }
    public static void main(String[] args) {

        Vector<String> v=new Vector<>();
        Scanner sc=new Scanner(System.in);

        while (true)
        {
            System.out.println("Enter Your Choice");
            System.out.println("1.Add");
            System.out.println("2.Remove By Object");
            System.out.println("3.Remove By Index");
            System.out.println("4.Display");
            System.out.println("5.Exit");
            int choice=sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter data:");
                    String data=sc.next();
                    add(v,data);
                    break;
                case 2:
                    System.out.println("Enter data to be removed:");
                    String data2=sc.next();
                    remove(v,data2);
                    break;
                case 3:
                    System.out.println("Enter data to be removed by index:");
                    int index=sc.nextInt();
                    remove(v,index);
                    break;
                 case 4:
                     v.forEach(System.out::println);
                     break;
                 case 5:
                     return;
            }

        }
    }
}
