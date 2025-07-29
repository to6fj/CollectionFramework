package com.collection.queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

    //  PriorityQueue Overview:
    // - Implements the Queue interface
    // - Does NOT allow null elements (throws NullPointerException)
    // - Uses natural ordering by default (ascending for integers)
    // - Internally based on a Min-Heap
    // - Head of the queue is always the smallest (min value)
    // - Supports custom ordering using Comparator

    public static void main(String[] args) {

        //  1. Min-Heap (Natural Ordering)
        Queue<Integer> priorityQueue = new PriorityQueue<>();

        //  Adding elements to the priority queue (min-heap)
        priorityQueue.add(-1);
        priorityQueue.add(21);
        priorityQueue.add(-30);
        priorityQueue.add(31);

        // ️ Printing the queue directly doesn't show full sorted order
        // Only the head (minimum) element is ordered correctly
        System.out.println(priorityQueue); // e.g., [-30, -1, 21, 31]

        System.out.println("-------------------------------------------------------");

        //  Polling elements: retrieves & removes in ascending order
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll()); // Output: -30, -1, 21, 31
        }

        //  2. Max-Heap (Reverse Order using Comparator)
        Queue<Integer> priorityQueue2 = new PriorityQueue<>(Comparator.reverseOrder());

        //  Adding elements to max-heap (largest element has highest priority)
        priorityQueue2.add(21);
        priorityQueue2.add(-30);
        priorityQueue2.add(31);

        //  Again, printing won't show fully sorted order, just head is max
        System.out.println(priorityQueue2); // e.g., [31, -30, 21]

        System.out.println("-----------------------------------");

        //  Polling elements: retrieves & removes in descending order
        while (!priorityQueue2.isEmpty()) {
            System.out.println(priorityQueue2.poll()); // Output: 31, 21, -30
        }
    }
}
