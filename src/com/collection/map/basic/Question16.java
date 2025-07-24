package com.collection.map.basic;
/*
16. Create a phone book app using Map<String, List<String>> for names and their phone numbers.
*/

import java.util.*;

public class Question16 {
    public static Map<String, List<String>> phoneBook=new HashMap<String,List<String>>();
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String name="";
        String phoneNumber="";
        while (true)
        {
            System.out.println("Enter Your Choice:");
            System.out.println("1. Add Contact");
            System.out.println("2. Remove Contact");
            System.out.println("3. Update Contact");
            System.out.println("4. Display Contact");
            System.out.println("5.Display All contact");
            System.out.println("6.Exit");
            int choice=scanner.nextInt();
            switch (choice){
                case 1:{
                    System.out.println("Enter Name:");
                    scanner.nextLine();
                    name = scanner.nextLine();
                    System.out.println("Enter Phone Number:");

                    phoneNumber=scanner.nextLine();
                    addContact(name,phoneNumber);
                    break;
                }
                case 2:{
                    System.out.println("Enter Name:");
                    scanner.nextLine();
                    name=scanner.nextLine();
                    System.out.println("Enter old Phone Number:");

                    phoneNumber=scanner.nextLine();
                    removeContact(name,phoneNumber);
                    break;
                }
                case 3:{
                    System.out.println("Enter Name:");
                    scanner.nextLine();
                    name=scanner.nextLine();
                    System.out.println("Enter Old Phone Number");

                    phoneNumber=scanner.nextLine();
                    System.out.println("Enter New Phone Number");

                    String newPhoneNumber=scanner.nextLine();
                    updateContact(name,phoneNumber,newPhoneNumber);
                    break;
                }
                case 4:
                {
                    System.out.println("Enter Name:");
                    scanner.nextLine();
                    name=scanner.nextLine();
                    displayContact(name);
                    break;
                }
                case 5:
                {
                    display();
                    break;
                }
                case 6:
                {
                    return;
                }
                default:{
                    System.out.println("Please enter choice between 1 to 6!!!!!");
                }
            }

        }
    }

    public static void addContact(String name,String phoneNumber)
    {
        if(!checkData(name,phoneNumber))
            return;

        if(phoneBook.containsKey(name))
        {
            List<String> list=phoneBook.get(name);
            list.add(phoneNumber);
            System.out.println("Phonebook Updated successfully");
        }else{
            List<String> list=new ArrayList<String>();
            list.add(phoneNumber);
            phoneBook.put(name, list);
            System.out.println("New Contact Added successfully");
        }
    }
    public static void removeContact(String name,String phoneNumber)
    {
        if(!checkData(name,phoneNumber))
            return;
        if(phoneBook.isEmpty())
        {
            System.out.println("No contact found");
            return;
        }
        if(phoneBook.containsKey(name))
        {
            List<String> list=phoneBook.get(name);
            if(list.contains(phoneNumber))
            {
                list.remove(phoneNumber);
                System.out.println("contact removed successfully");
            }
            else {
                System.out.println("contact not found");
            }
        }else {
            System.out.println("PhoneBook does not contain"+name+" With");
        }
    }
    public static void updateContact(String name,String oldPhoneNumber,String newPhoneNumber)
    {
        if(!isNumber(newPhoneNumber))
        {
            System.out.println("Phone number is invalid");
            return;
        }
        if(!checkData(name,oldPhoneNumber))
            return;
        if(phoneBook.isEmpty())
        {
            System.out.println("No contact found");
            return;
        }
        if(phoneBook.containsKey(name))
        {
            List<String> list=phoneBook.get(name);
            if(list.contains(oldPhoneNumber))
            {

                int index=list.indexOf(oldPhoneNumber);
                list.set(index, newPhoneNumber);
                System.out.println("new contact list updated successfully");
            }else {
                System.out.println("mobile number not found in list");
            }
        }else
        {
            System.out.println("PhoneBook does not contain"+name+" With");
        }
    }
    public static void displayContact(String name)
    {
        if(name==null || name.isEmpty())
        {
            System.out.println("Name is empty!!!!!!");
            return;
        }
        if(phoneBook.containsKey(name))
        {
            List<String> list=phoneBook.get(name);
            list.forEach(System.out::println);
        }
        else {
            System.out.println("contact not found");
        }
    }
    public static void display()
    {
        phoneBook.forEach((k,v)-> System.out.println(k+" "+v));
    }
    public static boolean isNumber(String number)
    {
        return number.matches("\\d{10}");
    }
    public static  boolean checkData(String name,String phoneNumber)
    {
        if(name==null || name.isEmpty())
        {
            System.out.println("Name is empty");
            return false;
        }
        if(phoneNumber==null || phoneNumber.isEmpty())
        {
            System.out.println("Phone number is empty");
            return false;
        }
        if(!isNumber(phoneNumber))
        {
            System.out.println("Phone number is invalid");
            return false;
        }
        return true;
    }

}
