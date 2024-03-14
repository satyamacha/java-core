package com.learning.core.day6;
import java.util.Map;
import java.util.TreeMap;

class CarDetails {
    private String name;
    private double price;

    public CarDetails(String name, double price) {
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
}

class CarPrice implements Comparable<CarPrice> {
    private double price;

    public CarPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(CarPrice other) {
        return Double.compare(other.getPrice(), this.getPrice()); // For reverse order of price
    }
}
public class D06P06 {

  public static void main(String[] args) {
        CarDetails car1 = new CarDetails("Bugatti", 80050.0);
        CarDetails car2 = new CarDetails("Swift", 305000.0);
        CarDetails car3 = new CarDetails("Audi", 600100.0);
        CarDetails car4 = new CarDetails("Benz", 900000.0);

        TreeMap<CarPrice, CarDetails> carMap = new TreeMap<>();
        carMap.put(new CarPrice(car1.getPrice()), car1);
        carMap.put(new CarPrice(car2.getPrice()), car2);
        carMap.put(new CarPrice(car3.getPrice()), car3);
        carMap.put(new CarPrice(car4.getPrice()), car4);

        System.out.println("Price of cars in reverse order:");
        for (Map.Entry<CarPrice, CarDetails> entry : carMap.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}