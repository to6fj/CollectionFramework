package com.collection.map.scenario;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.*;

public class Question20 {
    public static void main(String[] args) throws InterruptedException {

        Map<Stock, Integer> stockMap = new ConcurrentHashMap<>();

        Stock samsung = new Stock("Samsung S25", 278000);
        Stock iphone = new Stock("iPhone 16", 178000);

        ExecutorService service = Executors.newFixedThreadPool(10);

        // 2 threads updating Samsung stock
        Runnable updateSamsung = () -> {
            for (int i = 0; i < 1000; i++) {
                synchronized (samsung){
                    stockMap.put(samsung, stockMap.getOrDefault(samsung,0) + 1);
                }
            }
        };

        // 2 threads updating iPhone stock
        Runnable updateIphone = () -> {
            for (int i = 0; i < 1000; i++) {
               synchronized (iphone) {
                   stockMap.put(iphone, stockMap.getOrDefault(iphone,0) + 1);
               }
            }
        };

        Future<?> submit1=service.submit(updateSamsung);
        Future<?> submit2=service.submit(updateIphone);
        Future<?> submit3=service.submit(updateSamsung);
        Future<?> submit4 = service.submit(updateIphone);
        try {
            submit1.get();
            submit2.get();
            submit3.get();
            submit4.get();
        }catch (InterruptedException | ExecutionException e)
        {
            Thread.currentThread().interrupt();
        }

        // Display results
        stockMap.forEach((stock, quantity) -> {
            System.out.println(stock.getStockName() + " → Quantity: " + quantity);
        });
        service.shutdown();
    }
}

class Stock {
    private String stockName;
    private double stockPrice;

    public Stock(String stockName, double stockPrice) {
        this.stockName = stockName;
        this.stockPrice = stockPrice;
    }

    public String getStockName() {
        return stockName;
    }

    public double getStockPrice() {
        return stockPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Stock)) return false;
        Stock stock = (Stock) o;
        return Double.compare(stock.stockPrice, stockPrice) == 0 &&
                Objects.equals(stockName, stock.stockName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stockName, stockPrice);
    }
}
