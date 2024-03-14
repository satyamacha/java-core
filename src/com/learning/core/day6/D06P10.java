package com.learning.core.day6;

import java.util.Hashtable;
import java.util.Scanner;

class Employee {
    private int id;
    private String name;
    private String department;
    private String designation;

    public Employee(int id, String name, String department, String designation) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.designation = designation;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Employee ID: " + id + ", Name: " + name + ", Department: " + department + ", Designation: " + designation;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return id == employee.id;
    }
}

public class D06P10 {

  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int numEmployees = scanner.nextInt();
        scanner.nextLine(); 
        Hashtable<Integer, Employee> employeeTable = new Hashtable<>();

        for (int i = 0; i < numEmployees; i++) {
            System.out.println("\nEnter details for employee " + (i + 1));
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); 
            
            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Department: ");
            String department = scanner.nextLine();

            System.out.print("Designation: ");
            String designation = scanner.nextLine();

            Employee employee = new Employee(id, name, department, designation);
            employeeTable.put(employee.getId(), employee);
        }

        
        boolean isEmpty = employeeTable.isEmpty();
        System.out.println("\nIs the Hashtable empty? " + isEmpty);

        scanner.close();
    }
}