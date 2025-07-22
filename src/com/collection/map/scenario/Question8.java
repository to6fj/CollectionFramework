package com.collection.map.scenario;

/*
8. Login System - Map<String, String>: Add, validate, reset passwords.
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question8 {
    public static Map<String,String> users=new HashMap<>();
    public  static  void addUser(String name,String password){
        if(isPresent(name))
        {
            System.out.println("User already exists");
            return;
        }
        users.put(name,password);
        System.out.println("User added successfully");
    }
    public static boolean isPresent(String name){
        return users.containsKey(name);
    }
    public static void login(String name,String password){
        if(!isPresent(name))
        {
            System.out.println("User not present");
            return;
        }
        if(users.get(name).equals(password)){
            System.out.println("Login successful");
        }else {
            System.out.println("Invalid password please try again!!!!");
        }
    }
    public static void resetPassword(String name,String password){
        if(!isPresent(name))
        {
            System.out.println("User not present");
            return;
        }
        if(users.get(name).equals(password)){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter new password");
            String newPassword=sc.nextLine();
            users.put(name,newPassword);
            System.out.println("Password reset successful");
        }
        else {
            System.out.println("Invalid password please try again!!!!");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String userName;
        String password;
        while(true){
            System.out.println("Enter your choice:");
            System.out.println("1. Add User");
            System.out.println("2. Login");
            System.out.println("3. Reset Password");
            System.out.println("4. Exit");
            int choice=sc.nextInt();
            switch(choice){
                case 1:{
                    System.out.println("Enter Username:");
                    sc.nextLine();
                    userName=sc.next();
                    System.out.println("Enter Password:");
                    sc.nextLine();
                    password=sc.next();
                    addUser(userName,password);
                    break;
                }
                case 2:{
                    System.out.println("Enter Username:");
                    sc.nextLine();
                    userName=sc.next();
                    System.out.println("Enter Password:");
                    sc.nextLine();
                    password=sc.next();
                    login(userName,password);
                    break;
                }
                case 3:{
                    System.out.println("Enter Username:");
                    sc.nextLine();
                    userName=sc.next();
                    System.out.println("Enter Password:");
                    sc.nextLine();
                    password=sc.next();
                    resetPassword(userName,password);
                    break;
                }
                case 4:{
                    return;
                }
                default:
                    System.out.println("Invalid choice please try again");
            }
        }
    }
}
