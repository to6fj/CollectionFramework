package com.innerclass.localinnerclass;
// File: Outer.java

import java.util.function.BiPredicate;

class Outer {
    // Instance variable of the Outer class
    private String msg = "Hello from Outer";

    void outerMethod() {
//        BiPredicate
        /*
         * ----------------------------------------
         * 🔹 localVar is a local variable.
         * 🔹 It is used inside a local inner class.
         * 🔹 It is "effectively final" — which means:
         *    ➤ You are not modifying its value after initialization.
         *    ➤ Java treats it like a final variable automatically.
         * 🔹 From Java 8 onwards, local variables used in
         *    local/anonymous inner classes can be *effectively final*.
         */
        int localVar = 10; // effectively final (not modified)

        /*
         * 🔸 Local Inner Class
         * ➤ Declared inside a method (not static).
         * ➤ Can access:
         *     - instance variables (like msg)
         *     - final or effectively final local variables (like localVar)
         */
        class LocalInner {
            void display() {
                System.out.println("Message: " + msg);         // Accessing outer class instance variable
                System.out.println("Local Variable: " + localVar); // Accessing local method variable
            }
        }

        // Creating object of Local Inner Class and calling method
        LocalInner inner = new LocalInner();
        inner.display();
    }
}

// File: Test.java

public class LocalInnerClassDemo {

    public static void main(String[] args) {
        Outer obj = new Outer();
        obj.outerMethod(); // Triggers local inner class behavior
    }
}
