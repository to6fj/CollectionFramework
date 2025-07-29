package com.java8.functionalinterface.predicate;

import java.util.List;

/*
15. Write a Predicate to filter products that are in stock and price > 1000.*/
public class Question15 {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 10, 55000.00);
        Product p2 = new Product("Smartphone", 25, 20000.00);
        Product p3 = new Product("Headphones", 50, 1500.00);
        Product p4 = new Product("Keyboard", 40, 800.00);
        Product p5 = new Product("Mouse", 60, 500.00);
        Product p6 = new Product("Monitor", 15, 12000.00);
        Product p7 = new Product("Printer", 8, 7500.00);
        Product p8 = new Product("Tablet", 18, 18000.00);
        Product p9 = new Product("Smartwatch", 30, 3000.00);
        Product p10 = new Product("Speaker", 20, 2500.00);
        List<Product>productList=List.of(p1,p2,p3,p4,p5,p6,p7,p8,p9,p10);
        List<Product> list = productList.stream().filter(x -> x.getProductPrice() > 1000).toList();
        list.forEach(x -> System.out.println(x));
    }
}
class Product
{
    private String productName;
    private  int productQuantity;
    private double productPrice;

    public Product() {
    }

    public Product(String productName, int productQuantity, double productPrice) {
        this.productName = productName;
        this.productQuantity = productQuantity;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "Product Name: "+productName+" Quantity: "+productQuantity+" Price: "+productPrice;
    }
}

