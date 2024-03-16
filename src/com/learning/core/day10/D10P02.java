package com.learning.core.day10;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

class InvalidDataException extends Exception {
    public InvalidDataException(String message) {
        super(message);
    }
}

class Record implements Serializable {
    private String rollNumber;
    private String name;
    private int age;
    private String address;

    public Record(String rollNumber, String name, int age, String address) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Roll Number: " + rollNumber + ", Name: " + name + ", Age: " + age + ", Address: " + address;
    }
}
public class D10P02 {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Record> records = new ArrayList<>();

        while (true) {
            try {
                System.out.print("Enter Roll Number: ");
                String rollNumber = scanner.nextLine();

                System.out.print("Enter Name: ");
                String name = scanner.nextLine();

                System.out.print("Enter Age: ");
                int age = Integer.parseInt(scanner.nextLine());

                System.out.print("Enter Address: ");
                String address = scanner.nextLine();

                if (rollNumber.isEmpty() || name.isEmpty() || address.isEmpty()) {
                    throw new InvalidDataException("Roll Number, Name, and Address cannot be blank.");
                }

                records.add(new Record(rollNumber, name, age, address));

                System.out.print("Do you want to add another record? (yes/no): ");
                String choice = scanner.nextLine().trim().toLowerCase();
                if (!choice.equals("yes")) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Age must be a numeric value.");
            } catch (InvalidDataException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.print("Do you want to write the data to file? (yes/no): ");
        String writeToFileChoice = scanner.nextLine().trim().toLowerCase();
        if (writeToFileChoice.equals("yes")) {
            writeRecordsToFile(records);
        }

        scanner.close();
    }

    private static void writeRecordsToFile(ArrayList<Record> records) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("records.dat"))) {
            for (Record record : records) {
                outputStream.writeObject(record);
            }
            System.out.println("Records saved to file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing records to file.");
            e.printStackTrace();
        }
    }
}