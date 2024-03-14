package com.learning.core.day6;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class CarModel implements Comparable<CarModel> {
    private String name;
    private double price;

    public CarModel(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("%-10s %.1f", name, price);
    }

    @Override
    public int compareTo(CarModel other) {
        return this.name.compareTo(other.name);
    }
}

public class D06P09 {

  public static void main(String[] args) {
        
        CarModel car1 = new CarModel("Benz", 900000.0);
        CarModel car2 = new CarModel("Bugatti", 80050.0);
        CarModel car3 = new CarModel("Audi", 600100.0);
        CarModel car4 = new CarModel("Swift", 305000.0);

        TreeMap<CarModel, Double> carMap = new TreeMap<>();
        carMap.put(car1, car1.getPrice());
        carMap.put(car2, car2.getPrice());
        carMap.put(car3, car3.getPrice());
        carMap.put(car4, car4.getPrice());

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the new price: ");
        double newPrice = scanner.nextDouble();
        scanner.close();

        boolean found = false;
        for (Map.Entry<CarModel, Double> entry : carMap.entrySet()) {
            if (entry.getValue() == newPrice) {
                entry.getKey().setPrice(newPrice);
                System.out.println(entry.getKey());
                found = true;
                break;
            }
        }
        
        if (!found) {
            System.out.println("Value not found.");
        }
    }
}