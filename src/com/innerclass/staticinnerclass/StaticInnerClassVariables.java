package com.innerclass.staticinnerclass;

// Outer class
class OuterOne {

    // Instance variable of outer class
    private int outerInstance = 10;

    // Static variable of outer class
    private static int outerStatic = 20;

    // ✅ Instance method of outer class
    public void outerInstanceMethod() {
        System.out.println(">>> Outer instance method accessed: Value = " + outerInstance);
    }

    // ✅ Static method of outer class
    public static void outerStaticMethod() {
        System.out.println(">>> Outer static method accessed: Value = " + outerStatic);
    }

    // Static Inner Class
    static class Inner {

        // Instance variable of inner class
        private int innerInstance = 30;

        // Static variable of inner class
        private static int innerStatic = 40;

        // ✅ Instance method of static inner class
        public void innerInstanceMethod() {
            System.out.println("----- Inside innerInstanceMethod() of Inner -----");

            // ✅ Inner instance & static members
            System.out.println("Inner instance variable: " + innerInstance);
            System.out.println("Inner static variable: " + innerStatic);

            // ✅ Outer static member
            System.out.println("Outer static variable: " + outerStatic);

            // ❌ Outer instance member — NOT directly accessible
            System.out.println("❌ Cannot access outerInstance or call outerInstanceMethod() directly");

            System.out.println("-------------------------------------------");
        }

        // ✅ Static method of static inner class
        public static void innerStaticMethod() {
            System.out.println("----- Inside innerStaticMethod() of Inner -----");

            // ✅ Inner static and outer static members
            System.out.println("Inner static variable: " + innerStatic);
            System.out.println("Outer static variable: " + outerStatic);

            // ❌ Cannot access instance variables or methods
            System.out.println("❌ Cannot access innerInstance or outerInstance directly");
            System.out.println("❌ Cannot call outerInstanceMethod() or use 'this'");

            System.out.println("-------------------------------------------");
        }
    }
}

// Driver class with main()
public class StaticInnerClassVariables {
    public static void main(String[] args) {

        // ✅ Create OuterOne object to call its instance method
        OuterOne outerObj = new OuterOne();
        outerObj.outerInstanceMethod(); // Allowed

        // ✅ Call static method of outer class
        OuterOne.outerStaticMethod();

        // ✅ Create Inner object (no need of OuterOne object)
        OuterOne.Inner innerObj = new OuterOne.Inner();

        // ✅ Call instance method of static inner class
        innerObj.innerInstanceMethod();

        // ✅ Call static method of static inner class
        OuterOne.Inner.innerStaticMethod();
    }
}
