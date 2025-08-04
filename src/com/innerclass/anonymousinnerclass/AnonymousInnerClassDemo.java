package com.innerclass.anonymousinnerclass;

public class AnonymousInnerClassDemo
{
    /*
     * ---------------------------------------------
     * 🔷 Anonymous Inner Class in Java - Theory
     * ---------------------------------------------
     *
     * ✅ Inner Class:
     * - A class defined inside another class is called an Inner Class.
     *
     * ✅ Anonymous Inner Class:
     * - A special type of local inner class without a name.
     * - Declared and instantiated **in one single expression**.
     * - Used when you need a **one-time-use class implementation**.
     * - Mostly used for:
     *     → Interface implementations
     *     → Abstract class extensions
     *     → Subclassing concrete classes
     *
     * ✅ Syntax:
     * new SuperType() {
     *     // body (override methods or add behavior)
     * };
     *
     * ✅ When to use:
     * - When you need to override methods of a class or interface only once
     * - When you want to keep your code concise
     */

    public static void main(String[] args) {

        Runnable runnable=new Runnable() {
            public void run() {
                System.out.println("Thread Name:"+Thread.currentThread().getName());
            }
        };
        Thread thread=new Thread(runnable);
        thread.start();
    }
}
