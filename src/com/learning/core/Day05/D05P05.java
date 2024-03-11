package com.learning.core.Day05;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

class Product5 {
    String productId;
    String productName;

    public Product5(String productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    @Override
    public int hashCode() {
        return productId.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Product5 product = (Product5) obj;
        return productId.equals(product.productId);
    }

    @Override
    public String toString() {
        return productId + " " + productName;
    }
}

public class D05P05 {
    public static void main(String[] args) {
        HashSet<Product5> productSet = new HashSet<>();
        productSet.add(new Product5("P001", "DS Automobile"));
        productSet.add(new Product5("P002", "Dodge Viper ACR"));
        productSet.add(new Product5("P003", "Chevrolette Corvette Grand Sport"));
        productSet.add(new Product5("P004", "Lamborgini SVJ Roadster"));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter P00 and product ID to remove: ");
        String userProductId = scanner.nextLine();

        removeProduct(userProductId, productSet);

        System.out.println("Updated product set:");
        displayProductSet(productSet);

        scanner.close();
    }

    private static void removeProduct(String userProductId, HashSet<Product5> productSet) {
        Iterator<Product5> iterator = productSet.iterator();
        while (iterator.hasNext()) {
            Product5 product = iterator.next();
            if (product.productId.equals(userProductId)) {
                iterator.remove();
                System.out.println("Product removed: " + product);
                return; // Exit the loop once the product is removed
            }
        }
        System.out.println("Product not found with ID: " + userProductId);
    }

    private static void displayProductSet(HashSet<Product5> productSet) {
        for (Product5 product : productSet) {
            System.out.println(product);
        }
    }
}
