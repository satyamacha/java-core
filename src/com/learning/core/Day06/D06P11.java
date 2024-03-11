
package com.learning.core.Day06;
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

public class D06P11 {

  public static void main(String[] args) {
        Employee employee1 = new Employee(1001, "Daniel", "L&D", "Analyst");
        Employee employee2 = new Employee(1002, "Thomas", "Testing", "Tester");
        Employee employee3 = new Employee(1003, "Robert", "Development", "Product Manager");
        Employee employee4 = new Employee(1004, "Grace", "HR", "Tech Support");

        Hashtable<Integer, Employee> employeeTable = new Hashtable<>();
        employeeTable.put(employee1.getId(), employee1);
        employeeTable.put(employee2.getId(), employee2);
        employeeTable.put(employee3.getId(), employee3);
        employeeTable.put(employee4.getId(), employee4);

        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the employee id to search: ");
        int searchId = scanner.nextInt();
        scanner.close();

        Employee searchEmployee = employeeTable.get(searchId);
        if (searchEmployee != null) {
            System.out.println("Employee found:");
            System.out.println(searchEmployee);
        } else {
            System.out.println("Employee not found.");
        }
    }
}