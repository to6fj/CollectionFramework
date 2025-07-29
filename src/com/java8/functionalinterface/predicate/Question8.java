package com.java8.functionalinterface.predicate;

import java.util.List;
import java.util.function.Predicate;

public class Question8 {
    public static void main(String[] args) {
        List<String> list = List.of("Shubham", " ", "", "Pandit", "  ", "Puri", "");

         Predicate<String> isNotBlank = str -> str != null && !str.trim().isEmpty();

        List<String> filteredList = list.stream()
                .filter(isNotBlank)
                .toList();

        System.out.println("Filtered List: " + filteredList);
    }
}
