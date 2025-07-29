package com.collection.queue;

import java.util.concurrent.SynchronousQueue;

// -------------------------------------------------------------
// ✅ SynchronousQueue Producer-Consumer Demo with Notes
// -------------------------------------------------------------
// 🔹 SynchronousQueue has zero capacity — it doesn’t store elements.
// 🔹 Each `put()` by producer must wait for a `take()` by consumer.
// 🔹 It is useful for direct handoff between threads (like a handshake).
// 🔹 Thread-safe and blocking — no need for synchronized or wait/notify.


// 🔸 Producer thread — produces integer values and tries to put into the queue
class ProducerSync implements Runnable {
    private SynchronousQueue<Integer> queue;
    int value = 0;

    public ProducerSync(SynchronousQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("Produced: " + value);
            try {
                // 🔹 put() blocks until another thread takes the value
                queue.put(value++);

                // Simulating production delay
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Restore interrupted status
            }
        }
    }
}


// 🔸 Consumer thread — takes values from the queue as soon as they are produced
class ConsumerSync implements Runnable {
    private SynchronousQueue<Integer> queue;

    public ConsumerSync(SynchronousQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                // 🔹 take() blocks until another thread puts a value
                Integer p = queue.take();
                System.out.println("Consumed: " + p);

                // Simulating consumption delay
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Restore interrupted status
            }
        }
    }
}


// 🔸 Main class to start both producer and consumer threads
public class SynchronousQueueDemo {
    public static void main(String[] args) {

        // 🔹 Create a SynchronousQueue (no internal capacity)
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();

        // 🔹 Start the producer and consumer threads
        Thread producerThread = new Thread(new ProducerSync(queue));
        Thread consumerThread = new Thread(new ConsumerSync(queue));

        producerThread.start();
        consumerThread.start();
    }
}
