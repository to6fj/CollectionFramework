package com.collection.queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

// ------------------------------------------
// ✅ Producer-Consumer using BlockingQueue
// ------------------------------------------
// ➤ BlockingQueue handles thread-safe insertion and removal.
// ➤ `put()` blocks if queue is full (producer waits).
// ➤ `take()` blocks if queue is empty (consumer waits).
// ➤ ArrayBlockingQueue has a fixed capacity and FIFO behavior.


// 🔹 Producer Thread: produces integers and adds to queue
class Producer implements Runnable {
    private BlockingQueue<Integer> queue;
    int value = 0; // Value to be produced

    public Producer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Produced: " + value);

                // put() blocks if queue is full
                queue.put(value++);

                // Simulating time taken to produce
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // Re-interrupt the thread (good practice)
                Thread.currentThread().interrupt();
            }
        }
    }
}


// 🔹 Consumer Thread: consumes integers from queue
class Consumer implements Runnable {
    private BlockingQueue<Integer> queue;

    public Consumer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                // take() blocks if queue is empty
                Integer value = queue.take();
                System.out.println("Consumed: " + value);

                // Simulating time taken to consume
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // Re-interrupt the thread (good practice)
                Thread.currentThread().interrupt();
            }
        }
    }
}


// 🔹 Main class to start Producer and Consumer threads
public class BlockingQueueDemo {
    public static void main(String[] args) {

        // Creating a BlockingQueue of size 5
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);

        // Starting Producer and Consumer threads
        Thread producerThread = new Thread(new Producer(queue));
        Thread consumerThread = new Thread(new Consumer(queue));

        producerThread.start();
        consumerThread.start();
    }
}
