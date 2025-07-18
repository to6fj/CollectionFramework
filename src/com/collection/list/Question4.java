package com.collection.list;

import java.util.Scanner;
import java.util.Stack;

/*
4.	Create a Stack of integers and perform push, pop, and peek operations.
*/
public class Question4
{
    public  static <E> E push(Stack<E> stack, E e)
    {
        return stack.push(e);
    }
    public static  <E> E pop(Stack<E> stack)
    {
        return stack.pop();
    }
    public  static <E> E peek(Stack<E> stack)
    {
        return stack.peek();
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            System.out.println("Enter Your Choice:");
            System.out.println("1.Push\n2.Pop\n3.Peek\n4.Display\n5.Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Element to push in the stack");
                    int element = scanner.nextInt();
                    stack.push(element);
                    System.out.println("Element added to the stack");
                    break;
                case 2:
                    int value = stack.pop();
                    System.out.println("Element removed from the stack"+value);
                    break;
                case 3:
                    int data=stack.peek();
                    System.out.println("Top Element: "+data);
                    break;
                case 4:
                    for(int i=0;i<stack.size();i++)
                    {
                        System.out.print(stack.get(stack.size()-1-i)+"--->");
                    }
                    System.out.println("\b");
                    break;
                    case 5:
                        return;



            }
        }

    }
}
