package com.learning.core.day6;
import java.util.Map;
import java.util.TreeMap;

import java.util.Map;
import java.util.TreeMap;

class Automobile implements Comparable<Automobile> {
    private String name;
    private double price;

    public Automobile(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("%-10s %.1f", name, price);
    }

    @Override
    public int compareTo(Automobile o) {
        return this.name.compareTo(o.name);
    }
}

public class D06P08 {

  public static void main(String[] args) {
        Automobile auto1 = new Automobile("Benz", 900000.0);
        Automobile auto2 = new Automobile("Bugatti", 80050.0);
        Automobile auto3 = new Automobile("Audi", 600100.0);
        Automobile auto4 = new Automobile("Swift", 305000.0);

        TreeMap<Automobile, Double> autoMap = new TreeMap<>();
        autoMap.put(auto1, auto1.getPrice());
        autoMap.put(auto2, auto2.getPrice());
        autoMap.put(auto3, auto3.getPrice());
        autoMap.put(auto4, auto4.getPrice());

        Map.Entry<Automobile, Double> entry = autoMap.pollLastEntry();
        System.out.println(entry.getKey());

        for (Map.Entry<Automobile, Double> autoEntry : autoMap.entrySet()) {
            System.out.println(autoEntry.getKey());
        }
    }
}