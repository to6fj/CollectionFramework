package com.collection.list;

import java.util.LinkedList;
import java.util.NoSuchElementException;

/*

15. Create a CustomStack class using List that mimics push, pop, and peek.
*/
public class Question15
{
    public static void main(String[] args) {
        CustomStack<Integer> stack=new CustomStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        Integer a=stack.peek();
        System.out.println("Peeked:"+a);
        stack.pop();
        System.out.println(stack);
    }
}
class CustomStack<E> {
    private LinkedList<E> stack = new LinkedList<>();

    public void push(E x) {
        stack.addFirst(x);
        System.out.println("Pushed " + x);
    }
    public E pop()
    {
        try
        {
            E x=stack.removeFirst();
            System.out.println("Poped Data " + x);
            return x;
        }catch (NoSuchElementException e) {
           e.getLocalizedMessage();
        }
        return null;
    }
    public  E peek()
    {
        E x=stack.peekFirst();
        return x;
    }
    public  void clear()
    {
        stack.clear();
        System.out.println("Stack is cleared now");
    }
    public  boolean isEmpty()
    {
        return stack.isEmpty();
    }
    public  String toString()
    {
        return stack.toString();
    }
}
