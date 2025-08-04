package com.innerclass.memberinnerclass;

// ===============================
// 1. Outer Class Declaration
// ===============================
class OuterClass {

    // Private instance variable of outer class
    private String name = "Shubham";

    // ===============================
    // 2. Member Inner Class Declaration
    // ===============================
    /*
        - InnerClass is a Member Inner Class (non-static).
        - It has its own 'name' variable which shadows the outer class's 'name' variable.
        - 'this.name' refers to InnerClass's 'name'.
        - 'OuterClass.this.name' refers to OuterClass's 'name'.
    */
    class InnerClass {

        // Private instance variable of inner class (shadows outer class variable)
        private String name = "Puri";

        void show() {
            // Refers to the current inner class instance's variable
            System.out.println("Inner class name: " + this.name);

            // Refers to the outer class's instance variable using OuterClass.this
            System.out.println("Outer Class Name: " + OuterClass.this.name);
        }
    }
}

// ===============================
// 3. Main Class to Demonstrate Reference Resolution
// ===============================
public class ReferenceDemo {
    public static void main(String[] args) {
        // Step 1: Create object of outer class
        OuterClass obj = new OuterClass();

        // Step 2: Create object of inner class using outer object
        OuterClass.InnerClass inner = obj.new InnerClass();

        // Step 3: Call method to display names
        inner.show();
    }
}
