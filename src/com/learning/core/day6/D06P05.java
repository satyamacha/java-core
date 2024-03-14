package com.learning.core.day6;
import java.util.Map;
import java.util.TreeMap;

class Car implements Comparable<Car> {
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " " + price;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        long temp;
        temp = Double.doubleToLongBits(price);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Car other = (Car) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
            return false;
        return true;
    }

    @Override
    public int compareTo(Car other) {
        return this.name.compareTo(other.name);
    }
}
public class D06P05 {

  public static void main(String[] args) {
        Car car1 = new Car("Bugatti", 80050.0);
        Car car2 = new Car("Swift", 305000.0);
        Car car3 = new Car("Audi", 600100.0);
        Car car4 = new Car("Benz", 900000.0);

        TreeMap<Car, Integer> carMap = new TreeMap<>();
        carMap.put(car1, 1);
        carMap.put(car2, 2);
        carMap.put(car3, 3);
        carMap.put(car4, 4);

        for (Map.Entry<Car, Integer> entry : carMap.entrySet()) {
            System.out.println(entry.getKey());
        }
    }
}