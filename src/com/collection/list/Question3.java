package com.collection.list;

import java.util.Vector;

/*
3.	Use a Vector to store 5 product prices (double) and calculate the total sum.
*/
public class Question3 {
    public static void main(String[] args) {
        Vector<Double>productPrices=new Vector<>();
        productPrices.add(254.23);
        productPrices.add(123.12);
        productPrices.add(198.234);
        productPrices.add(234.56);
        productPrices.add(456.23);
        double sum=0.0;
        for(double price:productPrices)
        {
            sum+=price;
        }
        System.out.println("Sum of ProductPrices is "+sum);
        System.out.println("--------------------------------------------------------------------");
        sum=0.0;
        for(int i=0;i<productPrices.size();i++)
        {
            sum+=productPrices.get(i);
        }
        System.out.println("Sum of ProductPrices is "+sum);
        System.out.println("-----------------------------------------------------------------------");


    }
}
