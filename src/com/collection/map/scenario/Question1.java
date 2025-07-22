package com.collection.map.scenario;

/*
1. PhoneBook Application:
        - Map a person's name to their phone number.
        - Operations: Add, Delete, Search, List.
        - Use containsKey(), validate input.
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Question1
{
    private static HashMap<String, String> phoneBook = new HashMap<>();
    public static  void addContact(String name,String phoneNumber)
    {
        if(isNumber(phoneNumber))
        {
            System.out.println("Invalid phone number");
            return;
        }
        if(name==null||phoneNumber==null)
        {
            return;
        }
        if(phoneBook.containsKey(name))
        {
            if(!phoneBook.get(name).equals(phoneNumber))
            {
                phoneBook.put(name, phoneNumber);
            }else {
                System.out.println("Phone Number Already Exists");
                return;
            }
        }
        phoneBook.put(name, phoneNumber);
        System.out.println("Phone Number Added Successfully");
    }
    public static void deleteContact(String name)
    {
        if(!phoneBook.containsKey(name))
        {
            System.out.println("Phone Number Not Exists");
            return;
        }
        phoneBook.remove(name);
        System.out.println("Phone Number Deleted Successfully");
    }
    public static void search(String name)
    {
        if(phoneBook.isEmpty())
        {
            System.out.println("No contacts.......");
            return;
        }
        if(phoneBook.containsKey(name))
        {
            System.out.println(name+"----->"+phoneBook.get(name));
        }else {
            System.out.println("Phone Number Not Exists");
        }
    }
    public static void display()
    {
        Set<Map.Entry<String,String>> entrySet=phoneBook.entrySet();
        for(Map.Entry<String,String> entry:entrySet)
        {
            System.out.println(entry.getKey()+"----->"+entry.getValue());
        }
    }
    public  static void updateContact(String name,String phoneNumber)
    {
        if(isNumber(phoneNumber))
        {
            System.out.println("Invalid phone number");
            return;
        }
        if(phoneBook.containsKey(name))
        {
            System.out.println("Phone number associated with "+name+" is "+phoneBook.get(name));
            phoneBook.put(name, phoneNumber);
            System.out.println("Phone Number Updated Successfully");
        }else {
            System.out.println("Phone Number Not Exists");
        }
    }
    public static boolean isNumber(String number)
    {
        if(number==null|| number.isEmpty())
            return true;
        return !number.matches("\\d{10}");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name="";
        String phoneNumber="";
        while (true)
        {
            System.out.println(")Enter your choice");
            System.out.println("1.Add Contact");
            System.out.println("2.Update Contact");
            System.out.println("3.Delete Contact");
            System.out.println("4.Search Contact");
            System.out.println("5.Display All Contacts");
            System.out.println("6.Exit");
            int choice=sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Name:");
                    sc.nextLine();
                    name = sc.nextLine();
                    System.out.println("Enter Your Phone Number:");
                    phoneNumber = sc.nextLine();
                    addContact(name, phoneNumber);
                    break;
                 case 2:
                 {
                     System.out.println("Enter Name Which you want to update");
                     sc.nextLine();
                     name = sc.nextLine();
                     System.out.println("Enter Phone Number:");
                      phoneNumber = sc.nextLine();
                     updateContact(name, phoneNumber);
                     break;
                 }
                 case 3:
                 {
                     System.out.println("Enter Name Which you want to delete from phonebook");
                     sc.nextLine();
                     name = sc.nextLine();
                     deleteContact(name);
                     break;
                 }
                 case 4:
                 {
                     System.out.println("Enter Name Which you want to search from phonebook");
                     sc.nextLine();
                     name = sc.nextLine();
                     search(name);
                     break;
                 }
                 case 5:
                 {
                     display();
                     break;
                 }
                 case 6:
                 {
                     System.out.println("Thanks for using phonebook!!!!!!!!!!!!");
                     return;
                 }
                default:
                    System.out.println("Invalid choice... Please select choice from 1 to 6");
            }
        }
    }
}
