package com.collection.queue;

import java.util.Comparator;
import java.util.concurrent.PriorityBlockingQueue;

// ------------------------------------------------------------
// ✅ PriorityBlockingQueue Demo with Comparator.reverseOrder()
// ------------------------------------------------------------
//
// 🔹 PriorityBlockingQueue is an unbounded, thread-safe queue.
// 🔹 It orders Head based on natural order or a custom Comparator.
// 🔹 It uses Max Heap or Min Heap
// 🔹 It does not allow null values.
// 🔹 It is useful in producer-consumer systems where priority matters.
//
// 🔹 Methods like `offer()` and `poll()` are non-blocking.
// 🔹 Methods like `put()` and `take()` are blocking variants (used in multi-threading).
//
// 🔸 In this demo, we use Comparator.reverseOrder() to create a MAX-Heap.
//     So the largest element is removed first.

public class PriorityBlockingQueueDemo {

    public static void main(String[] args) {

        // Creating a PriorityBlockingQueue with reverse order (max-heap behavior)
        PriorityBlockingQueue<Integer> priorityBlockingQueue =
                new PriorityBlockingQueue<>(5, Comparator.reverseOrder());

        // 🔹 Adding elements using offer() — non-blocking
        priorityBlockingQueue.offer(10);
        priorityBlockingQueue.offer(20);
        priorityBlockingQueue.offer(30);
        priorityBlockingQueue.offer(40);
        priorityBlockingQueue.offer(0);

        // 🔹 Printing and removing elements using poll()
        // Elements will be retrieved in descending order due to reverseOrder() comparator
        while (!priorityBlockingQueue.isEmpty()) {
            System.out.println(priorityBlockingQueue.poll());
        }
    }
}
