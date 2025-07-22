package com.collection.map.scenario;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/*Dictionary Application:
        - Map<String, String>: word -> meaning.
 - Add, search, update, remove. Sorted output with TreeMap.*/
public class Question4 {
    public static Map<String,String>dictionary=new TreeMap<String,String>();
    public static  void add(String word,String meaning)
    {
        if(dictionary.containsKey(word)){
            System.out.println("Word "+word+" is already present");
            return;
        }
        dictionary.put(word,meaning);
    }
    public static void updateWord(String word,String meaning)
    {
        if(!dictionary.containsKey(word)){
            System.out.println(word+" is not present");
            return;
        }
        dictionary.put(word,meaning);
    }
    public static void remove(String word)
    {
        if(!dictionary.containsKey(word)){
            System.out.println("Word "+word+" is not present");
            return;
        }
        dictionary.remove(word);
    }
    public static  boolean isPresent(String word)
    {
        return  dictionary.containsKey(word);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word;
        String meaning;
        while (true){
            System.out.println("Enter Your Choice:");
            System.out.println("1.Add");
            System.out.println("2.Update");
            System.out.println("3.Remove");
            System.out.println("4.Search");
            System.out.println("5.Display");
            System.out.println("6.Exit");
            int choice=sc.nextInt();
            switch (choice){
                case 1:{
                    System.out.println("Enter Word:");
                    sc.nextLine();
                    word=sc.nextLine();
                    System.out.println("Enter Meaning:");
                    meaning=sc.nextLine();
                    add(word,meaning);
                    break;
                }
                case 2:{
                    System.out.println("Enter Word:");
                    sc.nextLine();
                    word=sc.nextLine();
                    System.out.println("Enter Meaning:");
                    meaning=sc.nextLine();
                    updateWord(word,meaning);
                    break;
                }
                case 3:{
                    System.out.println("Enter Word:");
                    sc.nextLine();
                    word=sc.nextLine();
                    remove(word);
                    break;
                }
                case 4:{
                    System.out.println("Enter Word to search:");
                    sc.nextLine();
                    word=sc.nextLine();
                    if(isPresent(word)){
                        System.out.println(word+" is present");
                        System.out.println(word+" = "+dictionary.get(word));
                    }else {
                        System.out.println(word+" is not present");
                    }
                    break;
                }
                case 5:{
                    display();
                    break;
                }
                case 6:{
                    return;
                }
                default:
                    System.out.println("Invalid Choice");
            }

        }
    }

    private static void display()
    {
        dictionary.forEach((key,value)->{
            System.out.println(key+" = "+value);
        });
    }
}
