package com.learning.core.Day06;
import java.util.Hashtable;
import java.util.Map;
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
        Employee employee = (Employee) obj;
        return id == employee.id;
    }
}
public class D06P14 {

  public static void main(String[] args) {
	  
        Hashtable<Integer, Employee> employeeTable = new Hashtable<>();
        employeeTable.put(1001, new Employee(1001, "Grace", "Tech Support", "HR"));
        employeeTable.put(1002, new Employee(1002, "Robert", "Product Manager", "development"));
        employeeTable.put(1003, new Employee(1003, "Thomas", "Tester", "Testing"));
        employeeTable.put(1004, new Employee(1004, "Daniel", "Analyst", "L&D"));


        Hashtable<Integer, Employee> currentCollection = new Hashtable<>();

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

            currentCollection.put(id, new Employee(id, name, department, designation));

            System.out.print("Do you want to add another employee? (yes/no): ");
            String choice = scanner.nextLine();
            if (!choice.equalsIgnoreCase("yes")) {
                break;
            }
        }

        
        employeeTable.putAll(currentCollection);
        System.out.println("Employee details added successfully!");

        
        System.out.println("Employee Table:");
        for (Map.Entry<Integer, Employee> entry : employeeTable.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        scanner.close();
    }
}