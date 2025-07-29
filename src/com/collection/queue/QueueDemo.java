package com.collection.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueDemo {
    public static void main(String[] args) {

        //  Creating an unbounded queue using LinkedList (no size limit)
        Queue<Integer> queue = new LinkedList<>();

        // add() - adds element to the queue; does NOT fail in unbounded queues
        queue.add(1);

        //  remove() - removes and returns the head of the queue
        //  Throws NoSuchElementException if queue is empty
        queue.remove();

        //  poll() - removes and returns head; returns null if queue is empty
        Integer poll = queue.poll(); // safe version of remove()
        System.out.println(poll); // Output: null (queue is empty now)


        //  Creating a bounded (fixed-size) queue with capacity 2
        Queue<Integer> queue2 = new ArrayBlockingQueue<>(2);

        //  add() - adds element; throws IllegalStateException if full
        boolean add2 = queue2.add(1); // adds 1 successfully
        System.out.println(add2);     // Output: true

        boolean add1 = queue2.add(2); // adds 2 successfully
        System.out.println(add1);     // Output: true

        //  queue2.add(3); → would throw IllegalStateException (Queue is full)

        //  offer() - adds element; returns false if queue is full (no exception)
        boolean offer = queue2.offer(4); // Queue is full → returns false
        System.out.println(offer);       // Output: false

        //  Final output of queue2
        System.out.println("---------------------------------");
        System.out.println(queue2); // Output: [1, 2]
    }
}
