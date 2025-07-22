package com.collection.map.scenario;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*14. Secure Login - Demonstrate null-safety and thread-safety.*/
public class Question14
{
//    public static Map<String,String> user=new HashMap<>();//Data Inconsistency
    public static Map<String,String> user=new Hashtable<>(  );
    public static  void addUser(String userName,String password)
    {
        if(userName==null||password==null)
            return;
        if(user.containsKey(userName))
        {
            System.out.println("User already exists.");
            return;
        }
        user.put(userName,password);
        System.out.println("user added successfully.");
    }
    public static  boolean login(String userName,String password)
    {
        if(user.containsKey(userName))
        {
            String currentPassword=user.get(userName);
            if(currentPassword.equals(password))
            {
                System.out.println(Thread.currentThread().getName()+"Login successful.");
                return true;
            }
            else {
                System.out.println("Incorrect password.");
                return false;
            }
        }
        else {
            System.out.println("Incorrect user name.");
            return false;
        }
    }

    public static void main(String[] args) {
        user.put("shubham","shubham@13");
        ExecutorService service= Executors.newFixedThreadPool(5);
        Future future1=service.submit(()->{
            for(int i=0;i<1000;i++)
            {
                user.put(String.valueOf(i),String.valueOf(i));
            }
        });
     Future<?>future2= service.submit(()->{
            for(int i=1000;i<2000;i++)
            {
                user.put(String.valueOf(i),String.valueOf(i));
            }
        });
     try
     {
         future1.get();
         future2.get();
     }catch (InterruptedException | ExecutionException e)
     {
         Thread.currentThread().interrupt();
     }
        service.shutdown();
        System.out.println(user.size());

    }
}
