package com.collection.map.scenario;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
5.
     Inventory Management:
     - Map<String, Integer>: item name -> quantity.
     - Add, update,view,Remove
 */
public class Question5
{
    public static HashMap<String,Integer>products=new HashMap<>();
    public static void addProduct(String productName,int quantity)
    {
        if(products.containsKey(productName))
        {
            System.out.println("Product already exists");
            return;
        }
        products.put(productName,quantity);
        System.out.println("Product added successfully");

    }
    public static void updateProduct(String productName,int quantity)
    {
        if(!searchProduct(productName))
        {
            System.out.println("Product does not exist");
            return;
        }
        products.put(productName,quantity);
    }
    public static void displayProduct( )
    {
        for(Map.Entry<String,Integer> entry:products.entrySet())
        {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
    public static  boolean searchProduct(String productName)
    {
        return products.containsKey(productName);
    }
    public static void removeProduct(String productName)
    {
        if(!searchProduct(productName))
        {
            System.out.println("Product does not exist");
            return;
        }
        products.remove(productName);
        System.out.println("Product removed successfully");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String productName;
        int quantity;
        while(true) {
            System.out.println("Enter Your Choice");
            System.out.println("1. Add Product");
            System.out.println("2.Update Product");
            System.out.println("3.Display Product");
            System.out.println("4.Remove Product");
            System.out.println("5.Exit");
            int choice = sc.nextInt();
            switch(choice) {
                case 1:{
                    System.out.println("Enter Product Name");
                    sc.nextLine();
                    productName = sc.nextLine();
                    System.out.println("Enter Quantity");
                    quantity = sc.nextInt();
                    addProduct(productName,quantity);
                    break;
                }
                case 2:{
                    System.out.println("Enter Product Name to update");
                    sc.nextLine();
                    productName = sc.nextLine();
                    System.out.println("Enter Quantity");
                    quantity = sc.nextInt();
                    updateProduct(productName,quantity);
                    break;
                }
                case 3:{
                    displayProduct( );
                    break;
                }
                case 4:{
                    System.out.println("Enter Product Name to remove");
                    sc.nextLine();
                    productName = sc.nextLine();
                    removeProduct(productName);
                    break;
                }
                case 5:{
                    return;
                }
                default:
                    System.out.println("Invalid Choice!!!");

            }

        }
    }
}
