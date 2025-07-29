package com.java8.functionalinterface.function;
/*
12. Use FuncƟon<Product, Double> to calculate price + 18% GST.
*/

import java.util.function.Function;

public class Question12
{
    public static void main(String[] args) {
        Function<Product,Double>productPriceGST=x->{
            return x.getProductPrice()+(x.getProductPrice()*0.18);
        };
        Product p1 = new Product("Laptop", 55000.0, 5);
        Product p2 = new Product("Smartphone", 32000.0, 10);
        Product p3 = new Product("Headphones", 1500.0, 25);
        Product p4 = new Product("Keyboard", 1200.0, 15);
        Product p5 = new Product("Smartwatch", 8000.0, 8);
        System.out.println(productPriceGST.apply(p1));


    }
}
class Product
{
    private String productName;
    private double productPrice;
    private int productQuantity;

    public Product(String productName, double productPrice, int productQuantity) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    @Override
    public String toString() {
        return "Product Name:"+productName+", Product Price:"+productPrice+", Product Quantity:"+productQuantity;
    }
}
