package com.collection.queue;

import java.util.LinkedList;

//  FIFO: First In First Out
// In a Queue, elements are inserted at the rear (end) and removed from the front (start).

//  Enqueue → Adding element at the end of the queue → addLast()
//  Dequeue → Removing element from the front of the queue → removeFirst()
//  Peek → Accessing the front element without removing → getFirst()

public class LinkedListQueue {

    public static void main(String[] args) {

        //  Creating a LinkedList that acts as a Queue
        LinkedList<Integer> queue = new LinkedList<>();

        //  Enqueue operations - add elements at the end of the queue
        queue.addLast(5); // Enqueue 5
        queue.addLast(4); // Enqueue 4
        queue.addLast(3); // Enqueue 3
        queue.addLast(2); // Enqueue 2

        //  Dequeue operation - remove the front (first) element
        Integer i = queue.removeFirst(); // Removes 5 (first inserted)

        //  Peek operation - get the front element without removing it
        Integer j = queue.getFirst(); // Will return 4

        //  Display the queue after operations
        System.out.println(queue); // Output: [4, 3, 2]
    }
}
