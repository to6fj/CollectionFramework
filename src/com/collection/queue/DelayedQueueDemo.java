package com.collection.queue;

import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;




// ------------------------------------------------------------
// ✅ DelayQueue Demo with Custom DelayedTask Implementation
// ------------------------------------------------------------
//
// 🔹 DelayQueue is a **BlockingQueue** that holds elements until a **delay expires**
// 🔹 Elements must implement the `Delayed` interface
// 🔹 Retrieval (`take()`) is **blocked** until the delay period of an element is over
// 🔹 Internally uses a **PriorityQueue** ordered by the delay
//
// ✅ Use Cases: Scheduled task execution, retry mechanisms, caching expiration, etc.

public class DelayedQueueDemo {
    public static void main(String[] args) throws InterruptedException {

        // 🔸 Creating a DelayQueue of DelayedTask elements
        DelayQueue<DelayedTask> delayQueue = new DelayQueue<>();

        // 🔸 Adding tasks with different delays
        delayQueue.offer(new DelayedTask("task1", 100, TimeUnit.MILLISECONDS));
        delayQueue.offer(new DelayedTask("task2", 30, TimeUnit.MILLISECONDS));
        delayQueue.offer(new DelayedTask("task3", 100, TimeUnit.MILLISECONDS));
        delayQueue.offer(new DelayedTask("task4", 10, TimeUnit.MILLISECONDS));

        // 🔸 Loop that blocks until the delay of each task has expired
        while (!delayQueue.isEmpty()) {
            DelayedTask delayedTask = delayQueue.take(); // blocks until task is ready
            System.out.println("Executed: " + delayedTask.getTaskName());
        }
    }
}

class DelayedTask implements Delayed {
    private String taskName;
    private long delay;
    private final long startTime;

    public DelayedTask(String taskName, long delay,TimeUnit timeUnit) {
        this.taskName = taskName;
        this.delay = delay;
        startTime=System.currentTimeMillis()+timeUnit.toMillis(delay);

    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public long getDelay() {
        return delay;
    }

    public void setDelay(long delay) {
        this.delay = delay;
    }

    public long getStartTime() {
        return startTime;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        long remaining=startTime-System.currentTimeMillis();
        return unit.convert(remaining,TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        if(this.startTime>((DelayedTask)o).startTime)
        {
            return 1;
        }
        if (this.startTime<((DelayedTask)o).startTime)
        {
            return -1;
        }return 0;
    }
}
