package com.collection.map.scenario;

import java.util.*;

/*
2. Student Marks Management:
 - Map<Integer, Double>: roll no -> marks.
 - Add, update, calculate average/highest, display topper.
*/
public class Question2 {

    public static Map<Integer,Double>studentMarks=new HashMap<Integer,Double>();
    public  static  void addStudent(int rollNo,double marks)
    {
        if(isPresent(rollNo))
        {
            System.out.println("Student already exists");
            return;
        }
        studentMarks.put(rollNo,marks);
        System.out.println("Student added successfully");
    }
    public static void updateMarks(int rollNo,double marks)
    {
        if(!isPresent(rollNo))
        {
            System.out.println("Student does not exist");
            return;
        }
        studentMarks.put(rollNo,marks);
        System.out.println("Student Marks updated successfully");

    }
    public static boolean isPresent(int rollNo)
    {
        return studentMarks.containsKey(rollNo);
    }
    public static double averageMarks()
    {
        double sum=0;
        int size=studentMarks.size();
       Set<Map.Entry<Integer,Double>>entrySet= studentMarks.entrySet();
       for(Map.Entry<Integer,Double> entry:entrySet)
       {
           sum+=entry.getValue();
       }
        return sum/size;
    }
    public static void highestMarks()
    {
        double maxMarks=0;
        Collection<Double>marks=studentMarks.values();
        for(Double mark:marks)
        {
            if(mark>maxMarks)
            {
                maxMarks=mark;
            }
        }
        System.out.println("Maximum marks is "+maxMarks);
     }
     public static  void  display()
     {
         for(Map.Entry<Integer,Double> entry:studentMarks.entrySet())
         {
             System.out.println("Student Roll No:"+entry.getKey()+" Marks: "+entry.getValue());
         }
     }

    public static void main(String[] args) {
        Integer rollNo=0;
        Double marks=0.0;
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("Enter Your Choice:");
            System.out.println("1.Add Student Marks");
            System.out.println("2.Update Student Marks");
            System.out.println("3.Average Marks");
            System.out.println("4.Highest Marks");
            System.out.println("5.Display All Students");
            System.out.println("6.Exit");
            int choice=sc.nextInt();
            switch(choice) {
                case 1:{
                    System.out.println("Enter Roll No");
                    rollNo=sc.nextInt();
                    System.out.println("Enter Marks");
                    marks=sc.nextDouble();
                    addStudent(rollNo,marks);
                    break;
                }
                case 2:{
                    System.out.println("Enter Roll No");
                    rollNo=sc.nextInt();
                    marks=sc.nextDouble();
                    updateMarks(rollNo,marks);
                    break;
                }
                case 3:{
                    System.out.println("Average Marks:"+averageMarks()      );
                    break;
                }
                case 4:{
                    highestMarks();
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
                    System.out.println("Invalid Choice Please try again");
            }
        }
    }


}
