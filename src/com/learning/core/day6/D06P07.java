package com.learning.core.day6;
import java.util.Map;
import java.util.TreeMap;

class Vehicle {
    private String brand;
    private double price;

    public Vehicle(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("%-10s %.1f", brand, price);
    }
}

class VehicleEntry implements Comparable<VehicleEntry> {
    private Vehicle vehicle;

    public VehicleEntry(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    @Override
    public int compareTo(VehicleEntry other) {
        return Double.compare(this.vehicle.getPrice(), other.getVehicle().getPrice());
    }

    @Override
    public String toString() {
        return vehicle.toString();
    }
}

public class D06P07 {

  public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Benz", 900000.0);
        Vehicle vehicle2 = new Vehicle("Bugatti", 80050.0);
        Vehicle vehicle3 = new Vehicle("Audi", 600100.0);
        Vehicle vehicle4 = new Vehicle("Swift", 305000.0);

        TreeMap<VehicleEntry, Double> vehicleMap = new TreeMap<>();
        vehicleMap.put(new VehicleEntry(vehicle1), vehicle1.getPrice());
        vehicleMap.put(new VehicleEntry(vehicle2), vehicle2.getPrice());
        vehicleMap.put(new VehicleEntry(vehicle3), vehicle3.getPrice());
        vehicleMap.put(new VehicleEntry(vehicle4), vehicle4.getPrice());

        Map.Entry<VehicleEntry, Double> maxEntry = vehicleMap.lastEntry();
        System.out.println("Vehicle with the greatest price:");
        System.out.println(maxEntry.getKey() + " " + maxEntry.getValue());

        Map.Entry<VehicleEntry, Double> minEntry = vehicleMap.firstEntry();
        System.out.println("Vehicle with the least price:");
        System.out.println(minEntry.getKey() + " " + minEntry.getValue());
    }
}