package com.java8.lambda;

// ---------------------------------------------------------------------
// ✅ Java 8 Lambda Expressions & Functional Interface Demo
// ---------------------------------------------------------------------

// 🔹 Lambda expressions provide a concise way to represent **functional interfaces**
// 🔹 A functional interface is an interface that contains **only one abstract method**
// 🔹 Syntax for lambda: (parameters) -> { body }
// 🔹 Used primarily in Functional Programming, Threads, Event Handling, Collections, etc.

public class LambdaDemo {
    public static void main(String[] args) {

        // ✅ Example 1: Lambda with Runnable (Thread)
        // Thread constructor takes Runnable (a functional interface)
        Thread t1 = new Thread(() -> {
            System.out.println("Hello from thread!");
        });
        t1.start(); // Output: Hello from thread!

        // ✅ Example 2: Lambda with Custom Functional Interface
        I1 a1 = (a, b) -> a + b; // Lambda for add() method of I1
        int result = a1.add(1, 2);
        System.out.println("Addition: " + result); // Output: 3
    }
}

// ---------------------------------------------------------------------
// ✅ Functional Interface: Only ONE abstract method allowed
// ---------------------------------------------------------------------
@FunctionalInterface // Optional but recommended for compile-time check
interface I1 {
    public int add(int a, int b); // Single abstract method
}
