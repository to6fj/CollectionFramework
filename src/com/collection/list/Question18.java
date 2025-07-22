package com.collection.list;

/*
18. Try to pop from an empty Stack, and handle the excepƟon.
*/

import java.util.EmptyStackException;
import java.util.Stack;

public class Question18
{
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        try
        {
            stack.pop();
        }catch (EmptyStackException e)
        {
            System.out.println("Empty Stack");
        }
        System.out.println("Main ends");
    }
}
