package com.innerclass.staticinnerclass;

// 1. A class declared inside another class is known as an inner class.
// 2. If the inner class is declared using the 'static' keyword, it's called a static inner class.
// 3. A static inner class is associated with the outer class itself, not with instances of the outer class.

class Outer {

    // 4. Static member of the outer class — can be accessed by static inner class
    private static int data = 10;

    // 5. Instance member of the outer class — CANNOT be accessed directly by static inner class
    private int value = 100;

    // 6. Static Inner Class
    static class Inner {

        // 7. Instance variable of inner class — can be used in instance methods
        private int a = 100;

        // 8. Static variable of inner class — can be used in static and instance methods
        private static int b = 10011;

        // 9. Static method inside static inner class
        public static void staticMethod() {
            System.out.println("---- Inside staticMethod() of Static Inner Class ----");

            // ✅ Can access static member of outer class
            System.out.println("Outer class static data: " + data);

            // ✅ Can access static member of inner class
            System.out.println("Inner class static b: " + b);

            // ❌ Cannot access instance member 'a' here — would cause compilation error
            // System.out.println("Inner class non-static a: " + a); // INVALID

            System.out.println("---------------------------------------------");
        }

        // 10. Instance method inside static inner class
        public void instanceMethod() {
            System.out.println("---- Inside instanceMethod() of Static Inner Class ----");

            // ✅ Can access static member of outer class
            System.out.println("Outer class static data: " + data);

            // ✅ Can access both instance and static members of inner class
            System.out.println("Inner class instance a: " + a);
            System.out.println("Inner class static b: " + b);

            // ❌ Cannot access non-static member 'value' of Outer directly
            // System.out.println(value); // INVALID

            System.out.println("---------------------------------------------");
        }
    }
}

public class StaticInnerClassDemo {
    public static void main(String[] args) {

        // 11. Instantiating static inner class — does NOT require outer class object
        Outer.Inner i = new Outer.Inner();

        // 12. Calling instance method using inner class object
        i.instanceMethod();

        // 13. Calling static method using object (allowed but not recommended)
        i.staticMethod();

        // 14. Preferred way — calling static method directly using class name
        Outer.Inner.staticMethod();
    }
}
