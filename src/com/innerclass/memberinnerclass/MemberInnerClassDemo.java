package com.innerclass.memberinnerclass;

// ===============================
// 1. Outer Class Declaration
// ===============================

class Outer {

    // Static member of outer class
    static int value = 19;

    // Private instance member of outer class
    private String name = "Hello From Outer Class";

    // ===============================
    // 2. Member Inner Class Declaration
    // ===============================
    /*
        - This is a Member Inner Class (also called non-static inner class).
        - It is associated with an instance of the outer class.
        - It can access all members of the outer class, including private ones.
        - In Java 16+, member inner classes can contain static members.
    */
    class Inner {

        // Static member (allowed from Java 16 onwards)
        static int a = 10;

        public void show() {
            // Accessing static variable of outer class
            System.out.println(value);

            // Accessing private instance variable of outer class
            System.out.println("Message: " + name);
        }
    }
}

/*
    ===============================
    ✅ Inner Class Concepts
    ===============================
    ➤ A class declared inside another class is called an "Inner Class".

    ✅ Java supports 3 main types of Inner Classes:
    -----------------------------------------------
    1. **Member Inner Class** (non-static class)
    2. **Static Nested Class** (declared with `static`)
    3. **Anonymous Inner Class** (class without a name, declared within a method or expression)

    ===============================
    ✅ Member Inner Class – Key Points:
    ===============================

    1. Declared **inside another class** but **without static** keyword.
    2. Tightly coupled with an **instance** of the outer class.
    3. To access it, you must first create an object of the outer class.
    4. Can access:
       - ✅ **Instance members** of outer class
       - ✅ **Static members** of outer class
       - ✅ Even **private members** of outer class
    5. 🔧 **Static members inside Inner Class?**
       - ❌ **Not allowed in Java 8–15** (except `static final` constants)
       - ✅ **Allowed from Java 16 onwards** (you can declare static methods & variables)
    6. 🗂️ Compiler creates separate `.class` files:
       - Outer.class
       - Outer$Inner.class
*/

// ===============================
// 3. Main Class to Demonstrate Member Inner Class
// ===============================

public class MemberInnerClassDemo {
    public static void main(String[] args) {
        // Step 1: Create object of outer class
        Outer out = new Outer();

        // Step 2: Create object of inner class using outer class object
        Outer.Inner inner = out.new Inner();

        // Step 3: Call method of inner class
        inner.show();
    }
}
