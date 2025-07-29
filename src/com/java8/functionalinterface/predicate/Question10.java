package com.java8.functionalinterface.predicate;
/*
10. Write a generic method that takes a list and a Predicate and returns a filtered list.
*/

import java.util.List;
import java.util.function.Predicate;

public class Question10
{
    public  static  <E>List<E> filteredList(List<E> list, Predicate<E> predicate)
    {
        return list.stream().filter(predicate).toList();
    }
    public static void main(String[] args) {
        List<Integer> list = filteredList(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), x -> x % 2 == 0);
        list.forEach(System.out::println);
        List<String>list1=filteredList(List.of("shubham","shrikant","sejal","akash","zayen"),x->x.startsWith("s"));
        list1.forEach(System.out::println);
    }
}
