package com.collection.queue;

//  Deque (Double Ended Queue):
// A Deque allows insertion and removal of elements from **both ends (front and rear)**.
// It combines the behavior of both Queue (FIFO) and Stack (LIFO).

//  Java provides `Deque` interface and implementations like `ArrayDeque`, `LinkedList`

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo {

    // -----------------------------
    // Insertion Methods
    // -----------------------------

    //  These methods throw exceptions if insertion fails (e.g., due to capacity limit):
    // 1. addFirst(E e) - Inserts element at the front
    // 2. addLast(E e)  - Inserts element at the end

    //  These methods return false if insertion fails (no exception):
    // 3. offerFirst(E e) - Inserts at front safely
    // 4. offerLast(E e)  - Inserts at end safely

    // -----------------------------
    //  Removal Methods
    // -----------------------------

    //  These throw NoSuchElementException if Deque is empty:
    // 1. removeFirst() - Removes and returns front element
    // 2. removeLast()  - Removes and returns last element

    //  These return null if Deque is empty:
    // 3. pollFirst() - Removes and returns front element safely
    // 4. pollLast()  - Removes and returns last element safely

    // -----------------------------
    //  Examination (Peek) Methods
    // -----------------------------

    //  These throw NoSuchElementException if Deque is empty:
    // 1. getFirst() - Returns front element without removing
    // 2. getLast()  - Returns last element without removing

    //  These return null if Deque is empty:
    // 3. peekFirst() - Returns front element safely (no removal)
    // 4. peekLast()  - Returns last element safely (no removal)

    // You can implement examples here using ArrayDeque and LinkedList:
    // Example:
    // Deque<Integer> deque = new ArrayDeque<>();
    // deque.addFirst(10);
    // deque.addLast(20)

    public static void main(String[] args) {

        // ✅ Creating a Deque (Double-Ended Queue) using ArrayDeque
        Deque<Integer> deque = new ArrayDeque<>();

        // -----------------------------
        // 🔹 Insertion Operations
        // -----------------------------

        // These methods throw exception if insertion fails
        deque.addFirst(10);    // Inserts 10 at the front
        deque.addLast(20);     // Inserts 20 at the rear

        // These methods return false if insertion fails (no exception)
        deque.offerFirst(30);  // Inserts 30 at the front
        deque.offerLast(40);   // Inserts 40 at the rear

        // Current state of deque: [30, 10, 20, 40]
        System.out.println("Deque after insertions: " + deque);

        // -----------------------------
        // 🔹 Removal Operations
        // -----------------------------

        // These throw NoSuchElementException if deque is empty
        Integer removeFirst = deque.removeFirst();  // Removes and returns 30
        System.out.println("First remove (removeFirst): " + removeFirst);

        Integer removeLast = deque.removeLast();    // Removes and returns 40
        System.out.println("Last remove (removeLast): " + removeLast);

        // These return null if deque is empty (safe methods)
        Integer pollFirst = deque.pollFirst();      // Removes and returns 10
        System.out.println("First poll (pollFirst): " + pollFirst);

        Integer pollLast = deque.pollLast();        // Removes and returns 20
        System.out.println("Last poll (pollLast): " + pollLast);

        // -----------------------------
        // 🔹 Deque is now empty
        // -----------------------------

        // This line is commented because it will throw NoSuchElementException
        // Integer rem = deque.removeFirst();
        // System.out.println(rem);

        // Safe version: returns null if deque is empty
        Integer remove = deque.pollFirst();         // Returns null, no exception
        System.out.println("Poll after empty (pollFirst): " + remove);
    }

}
