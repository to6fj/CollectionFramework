package com.collection.list;

/*

    36.Create an immutable list using List.of() with 5 city names. Try modifying and catch
        exception.
*/

import java.util.List;

public class Question36
{
    public static void main(String[] args) {
        List<String>cityNames=List.of("Pune","Mumbai","Latur","Beed","Parbhani");
        try {
            cityNames.add("Nagpur");
        }catch (UnsupportedOperationException e)
        {
            System.out.println("Immutable Objects cant be modified");

        }
        System.out.println(cityNames);
    }
}
