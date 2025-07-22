package com.collection.list;

import java.util.Stack;
import java.util.Scanner;

public class Question13 {
    public static Stack<String> backward = new Stack<>();
    public static Stack<String> forward = new Stack<>();
    public static String currentPage = null;

    public static void setForward() {
        if (forward.isEmpty()) {
            System.out.println("No page to forward............:");
            return;
        }
        backward.push(currentPage); // ✅ Push current page to backward
        currentPage = forward.pop(); // ✅ Pop forward to become current
        System.out.println("Forward page to " + currentPage);
    }

    public static void setBackward() {
        if (backward.isEmpty()) {
            System.out.println("No page to backward............:");
            return;
        }
        forward.push(currentPage); // ✅ Push current page to forward
        currentPage = backward.pop(); // ✅ Pop backward to become current
        System.out.println("Backward page to " + currentPage);
    }

    public static void newSearch() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter action:");
        String newPage = scanner.nextLine();

        if (currentPage != null) {
            backward.push(currentPage);
        }

        currentPage = newPage;
        forward.clear(); // ✅ Clear forward history
        System.out.println("You are now on " + currentPage);
    }

    public static void main(String[] args) {
        newSearch();    // Visit Page 1
        newSearch();    // Visit Page 2
        setBackward();  // Go back to Page 1
        setForward();   // Go forward to Page 2
    }
}
