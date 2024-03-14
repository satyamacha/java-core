package com.learning.core.day5;
import java.util.*;

class Person10 implements Comparable<Person10> {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Person10(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Person10 person = (Person10) obj;
        return id == person.id;
    }

    @Override
    public int compareTo(Person10 other) {
        return Integer.compare(this.id, other.id);
    }
}

public class D05P10 {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<Person10> personSet = new TreeSet<>();

        // Taking input for 6 persons
        for (int i = 1; i <= 6; i++) {
            System.out.println("Enter details for person " + i + ":");
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            personSet.add(new Person10(id, name, age, salary));
        }

        // Finding and printing the first person whose name starts with "j"
        for (Person10 person : personSet) {
            if (person.getName().toLowerCase().startsWith("j")) {
                System.out.println("First person whose name starts with 'j': " + person);
                break;
            }
        }
    }
}