package com.learning.core.day6;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

class Employee14 {
    private int id;
    private String name;
    private String department;
    private String designation;

    public Employee14(int id, String name, String department, String designation) {
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
        return id + " " + name + " " + designation + " " + department;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee14 employee = (Employee14) obj;
        return id == employee.id;
    }
}
public class D06P14 {

  public static void main(String[] args) {
	  
        Hashtable<Integer, Employee14> employeeTable = new Hashtable<>();
        employeeTable.put(1001, new Employee14(1001, "Grace", "Tech Support", "HR"));
        employeeTable.put(1002, new Employee14(1002, "Robert", "Product Manager", "development"));
        employeeTable.put(1003, new Employee14(1003, "Thomas", "Tester", "Testing"));
        employeeTable.put(1004, new Employee14(1004, "Daniel", "Analyst", "L&D"));


        Hashtable<Integer, Employee14> currentCollection = new Hashtable<>();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter employee details:");
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Department: ");
            String department = scanner.nextLine();
            System.out.print("Designation: ");
            String designation = scanner.nextLine();

            currentCollection.put(id, new Employee14(id, name, department, designation));

            System.out.print("Do you want to add another employee? (yes/no): ");
            String choice = scanner.nextLine();
            if (!choice.equalsIgnoreCase("yes")) {
                break;
            }
        }

        
        employeeTable.putAll(currentCollection);
        System.out.println("Employee details added successfully!");

        
        System.out.println("Employee Table:");
        for (Map.Entry<Integer, Employee14> entry : employeeTable.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        scanner.close();
    }
}