package com.collection.list;
/*
21. Student Marks Management: Add, update, calculate average of marks using ArrayList.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Question21
{
    private static ArrayList<Student> students=new ArrayList<>();
    public static  void addStudent()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter Roll No: ");
        int rollNo = scanner.nextInt();
        Student student = new Student(name, rollNo);
        System.out.println("Enter No of subjects");
        int subjects = scanner.nextInt();
        System.out.println("Enter Marks One By one: ");
        for (int i = 0; i < subjects; i++) {
            System.out.println("Enter "+(i+1)+" Subject Marks:");
            Double mark = scanner.nextDouble();
            student.getMarks().add(mark);
        }
        students.add(student);
    }
    public static void updateStudentMarks()
    {
        if(students.isEmpty()) {
            System.out.println("No students found");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Roll No: ");
        int rollNo = scanner.nextInt();
        for (Student student : students) {
            if(student.getRollNo() == rollNo) {
                System.out.println("Enter Subject code from 0 to n");
                int code = scanner.nextInt();
                if(code>=0 && code<student.getMarks().size()) {
                    System.out.println("Enter Marks to update");
                    double mark = scanner.nextDouble();
                    student.getMarks().set(code,mark);
                    System.out.println("Marks Updated sucessfully");
                }
                else {
                    System.out.println("Invalid subject code");
                }
            }else {
                System.out.println("Invalid roll no");
            }
        }

    }
    public static void averageMarks()
    {
        if(students.isEmpty()) {
            System.out.println("No students found");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ROll No to check average marks:");
        int rollNo=scanner.nextInt();
        for(Student student : students) {
            if(student.getRollNo() == rollNo) {
                System.out.println("Average marks of student:"+student.getName()+" is "+student.averageMarks());
                return;
            }
        }
        System.out.println("Invalid roll no");

    }
    public static  void removeStudent()
    {
        if(students.isEmpty()) {
            System.out.println("No students found");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Roll No: ");
        int rollNo = scanner.nextInt();
        for(Student student : students) {
            if(student.getRollNo() == rollNo) {
                students.remove(student);
                return;
            }
        }
        System.out.println("Invalid roll no");
    }
    public static void displayAllStudents()
    {
        if(students.isEmpty()) {
            System.out.println("No students found");
            return;
        }
        for(Student student : students) {
            System.out.println(student);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Enter Your choice:");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Average Marks");
            System.out.println("4.Update Marks");
            System.out.println("5.Display All Students");
            System.out.println("6.Exit");
            int ch=scanner.nextInt();
            switch(ch) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    removeStudent();
                    break;
                case 3:
                    averageMarks();
                    break;
                case 4:
                    updateStudentMarks();
                    break;
                case 5:
                    displayAllStudents();
                    break;
                case 6:
                    return;
                 default:
                     System.out.println("Please select a valid choice between 1 and 5");
                     break;
            }

        }
    }
}
class Student {

private  String name;
private int rollNo;
private ArrayList<Double> marks=new ArrayList<>();

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public ArrayList<Double> getMarks() {
        return marks;
    }

    public void setMarks(ArrayList<Double> marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Name:"+this.name+" RollNo:"+this.rollNo+" Marks:"+this.marks;
    }
    public  double averageMarks()
    {
        double sum=0;
        for(Double mark : this.marks) {
            sum+=mark;
        }
        return sum/this.marks.size();
    }
}
