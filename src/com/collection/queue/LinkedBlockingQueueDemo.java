package com.collection.queue;

import java.util.concurrent.LinkedBlockingQueue;

class ProducerLinked implements Runnable {
    private LinkedBlockingQueue<Integer> queue;
    int value=0;

    public ProducerLinked(LinkedBlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Produced:"+value);
                queue.put(value++);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
class ConsumerLinked implements Runnable {
    private LinkedBlockingQueue<Integer> queue;

    public ConsumerLinked(LinkedBlockingQueue<Integer> queue) {
        this.queue = queue;
    }
    @Override
    public void run() {
        while (true) {
            try {
                Integer poll = queue.take();
                System.out.println("Consumed:"+poll);
                Thread.sleep(2000);
            }catch (InterruptedException e)
            {
                Thread.currentThread().interrupt();
            }
        }
    }
}
public class LinkedBlockingQueueDemo
{
    public static void main(String[] args) {
        LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>(5);
        //if we dont mention its capacity while creating LinkedBlockingQueue then it will create LinkedBlockingQueue with Integer.MAX Value capacity
        Thread producerThread = new Thread(new Producer(queue));
        Thread consumerThread = new Thread(new Consumer(queue));
        producerThread.start();
        consumerThread.start();
    }
}
