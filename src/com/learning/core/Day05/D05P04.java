package com.learning.core.Day05;

import java.util.HashSet;
import java.util.Scanner;

class Product4 {
    String productId;
    String productName;

    public Product4(String productId, String productName) {
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

        Product4 product = (Product4) obj;
        return productId.equals(product.productId);
    }
}

public class D05P04 {
    public static void main(String[] args) {
        HashSet<Product4> productSet = new HashSet<>();
        productSet.add(new Product4("P001", "DS Automobile"));
        productSet.add(new Product4("P002", "Dodge Viper ACR"));
        productSet.add(new Product4("P003", "Chevrolette Corvette Grand Sport"));
        productSet.add(new Product4("P004", "Lamborgini SVJ Roadster"));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter P00 and then product ID without space: ");
        String userProductId = scanner.nextLine();
        System.out.print("Enter Car Name from Asphalt 9 : ");
        String userProductName = scanner.nextLine();

        searchProduct(userProductId, userProductName, productSet);

        scanner.close();
    }

    private static void searchProduct(String userProductId, String userProductName, HashSet<Product4> productSet) {
        Product4 searchProduct = new Product4(userProductId, userProductName);

        if (productSet.contains(searchProduct)) {
            System.out.println("Product found");
        } else {
            System.out.println("Product not found");
        }
    }
}
