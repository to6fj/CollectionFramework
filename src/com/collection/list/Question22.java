package com.collection.list;

/*
22. Movie Booking System: Remove a movie on booking; add new ones dynamically.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question22 {
   public static List<String>movies=new ArrayList<>();
   public static  void bookMovie(String movie){
       if(movies.isEmpty()){
           System.out.println("No more movies");
           return;
       }
       for(String movieName:movies){
           if(movie.equalsIgnoreCase(movieName)){
               movies.remove(movie);
               System.out.println("Movie Booked successfully "+movieName);
               return;
           }
       }
       System.out.println("Movie Not found");
   }
   public static  void addMovie(){
       System.out.println("Enter movie name");
       Scanner sc = new Scanner(System.in);
       String movie = sc.nextLine();
       movies.add(movie);
       System.out.println(movie+" Movie Added Sucessfully");
   }
   public static  void  display()
   {
       if(movies.isEmpty()){
           System.out.println("No more movies");
           return;
       }
       System.out.println("----------------------------------------------------------------------------------");

       for(String movieName:movies){
           System.out.println(movieName);
       }
       System.out.println("----------------------------------------------------------------------------------");

   }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter Your choice");
            System.out.println("1. Add Movie");
            System.out.println("2. Book Movie");
            System.out.println("3.Display");
            System.out.println("4.Exit");
            int choice = sc.nextInt();
            switch(choice){
                case 1: addMovie();
                        break;
                case 2:
                    System.out.println("Enter movie name");
                    sc.nextLine();
                    String movie = sc.nextLine();
                    bookMovie(movie);
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
