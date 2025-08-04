package com.innerclass.memberinnerclass;

// ===============================
// 1. Outer Class Declaration
// ===============================
class OuterClassOne {

    // Private instance variable of Outer class
    private String name = "Shubham";

    // ===============================
    // 2. Member Inner Class (Non-static)
    // ===============================
    class InnerClass {
        public void show() {
            System.out.println(name);  // Can directly access private members of outer class
        }
    }

    // ===============================
    // 3. Instance Method (Valid Context for Instantiation)
    // ===============================
    public void m1() {
        InnerClass i = new InnerClass(); // ✅ Valid: Instance context
        i.show();
    }

    // ===============================
    // 4. Static Method (Invalid Context for Instantiation)
    // ===============================
    /*
    public static void m2() {
        InnerClass i = new InnerClass(); ❌ Compilation Error
        i.show();
    }
    */
}
public class InstanciationDemo {
    public static void main(String[] args) {
        OuterClassOne o = new OuterClassOne(); // Step 1: Create outer class object
        o.m1();                                // Step 2: Call instance method which creates inner class
    }
}
