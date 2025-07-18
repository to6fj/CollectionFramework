package com.collection.list;

import java.util.Scanner;
import java.util.Stack;

/*
10.	Simulate undo-redo operations using two Stacks.
*/
public class Question10 {
    public static Stack<String>undoStack=new Stack<>();
    public static Stack<String>redoStack=new Stack<>();
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        while (true)
        {
            System.out.println("Enter Choice:");
            System.out.println("1.Add Action");
            System.out.println("2.Undo Action");
            System.out.println("3.Redo Action");
            System.out.println("4.Display Action");
            System.out.println("5.Exit");
            int choice=scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Action to perform");

                    String action=scanner.next();
                    add(action);
                    break;
               case 2:
                   undo();
                   break;
               case 3:
                   redo();
                   break;
               case 4:
                   System.out.println("Undo Task:"+undoStack);
                   System.out.println("Redo Task:"+redoStack);
                   break;
                case 5:
                    return;
            }
        }
    }
    public  static  void add(String action)
    {
        undoStack.push(action);
        redoStack.clear();
        System.out.println("Action Performed: "+action);
    }
    public static  void undo()
    {
        if(!undoStack.isEmpty())
        {
            String lastAction=undoStack.pop();
            redoStack.push(lastAction);
            System.out.println("Undo Action: "+lastAction);

        }else {
            System.out.println("Nothing to undo");
        }
    }
    public static void redo()
    {
        if(!redoStack.isEmpty())
        {
            String lastAction=redoStack.pop();
            undoStack.push(lastAction);
            System.out.println("Redo Action: "+lastAction);
        }else {
            System.out.println("Nothing to redo");
        }
    }
}
