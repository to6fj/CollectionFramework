package com.collection.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

/*
5.	Create a menu-driven program that allows the user to perform CRUD operations on a List of strings.
*/
public class Question5 {

    public static <E> boolean add(List<E>list,E value)
    {
        return list.add(value);
    }
    public static <E> void add(List<E>list,int index,E value)
    {
        list.add(index, value);
    }
    public static <E>  boolean addAll(List<E>list, Collection<E> collection)
    {
        return list.addAll(collection);
    }
    public  static  <E> boolean remove(List<E> list,E value)
    {
        return  list.remove(value);
    }
    public static  <E> boolean removeAll(List<E> list, Collection<E> collection)
    {
        return  list.removeAll(collection);
    }
    public static <E> E remove(List<E>list,int index)
    {
        return list.remove(index);
    }
    public static <E> E set(List<E> list,int index,E value)
    {
        return list.set(index, value);
    }

    public static  void main(String[] args) {
        List<String>list = new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println("Enter Your Choice");

            System.out.println("1.Add Element At The End of the List");
            System.out.println("2.Add Element at given index  of list");
            System.out.println("3.Add Collection to the end of the list");
            System.out.println("4.Remove Element from the list");
            System.out.println("5.Remove Element from the list using index");
            System.out.println("6.Remove given collection form the list");
            System.out.println("7.Update the element from the list using index");
            System.out.println("8.Display the list");
            System.out.println("9.Exit");
            int choice=scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Data to add:");
                    String data=scanner.next();
                    if(add(list,data))
                    {
                        System.out.println("Element added successfully");
                    }else
                    {
                        System.out.println("Element not added");
                    }
                    break;
                case 2:
                    System.out.println("Enter Data to add:");
                    String data2=scanner.next();
                    System.out.println("Enter Index at which we want to add");
                    int index=scanner.nextInt();
                    add(list,index,data2);
                    break;
                case 3:
                    List<String >list1=List.of("BCA","MCA","MCS","MBA");
                    addAll(list,list1);
                    break;
                case 4:
                    System.out.println("Enter Element to remove:");
                    String data3=scanner.next();
                    if(remove(list,data3))
                    {
                        System.out.println("Data removed successfully");
                    }else {
                        System.out.println("Element not present");
                    }
                    break;
                case 5:
                    System.out.println("Enter Index at which we want to remove");
                    int index1=scanner.nextInt();
                    remove(list,index1);
                    break;
                case 6:
                    List<String >list2=List.of("BCA","MCA","MCS","MBA");
                    removeAll(list,list2);
                    break;
                  case 7:
                      System.out.println("Enter index at which we want to update data");
                      int index2=scanner.nextInt();
                      System.out.println("Enter Data to update:");
                      String data4=scanner.next();
                      set(list,index2,data4);
                      break;
                 case 8:
                     for(String s:list)
                     {
                         System.out.println(s);
                     }
                     break;
                     case 9:
                         return;

            }
        }

    }
}
