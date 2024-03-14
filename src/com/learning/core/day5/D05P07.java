package com.learning.core.day5;
import java.util.*;

class Person7 implements Comparable<Person7> {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Person7(int id, String name, int age, double salary) {
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
        return id + " " + name + " " + salary;
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
        Person7 person = (Person7) obj;
        return id == person.id;
    }

    @Override
    public int compareTo(Person7 other) {
        return Integer.compare(this.id, other.id);
    }

//	@Override
	//public int compareTo(Person arg0) {
		// TODO Auto-generated method stub
		//return 0;
	//}
}
public class D05P07 {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<Person9> personSet = new TreeSet<>();

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

            personSet.add(new Person9(id, name, age, salary));
        }

        // Printing id, name, and salary of each person
        for (Person9 person : personSet) {
            System.out.printf("%d %s %.1f\n", person.getId(), person.getName(), person.getSalary());
        }
    }
}