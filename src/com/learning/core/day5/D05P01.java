package com.learning.core.day5;
import java.util.Random;
import java.util.Scanner;

class Register<T> {
    private String registerId;

    public Register(String registerId) {
        this.registerId = registerId;
    }

    public String generateRegisterId(int length) {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }

        return sb.toString();
    }
}

class Employee {
    private String name;
    private long phoneNo;
    private String passportNo;
    private int licenseNo;
    private String panCardNo;
    private int voterId;
    private int employeeId;

    public Employee(String name, long phoneNo, int employeeId, String passportNo) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.employeeId = employeeId;
        this.passportNo = passportNo;
    }

    public Employee(String name, long phoneNo, int employeeId, int licenseNo, String panCardNo) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.employeeId = employeeId;
        this.licenseNo = licenseNo;
        this.panCardNo = panCardNo;
    }

    public Employee(String name, long phoneNo, int employeeId, int voterId, int licenseNo) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.employeeId = employeeId;
        this.voterId = voterId;
        this.licenseNo = licenseNo;
    }

    @Override
    public String toString() {
        return String.format("%s %d %d %s", name, phoneNo, employeeId, passportNo);
    }
}

class Student {
    private String name;
    private long phoneNo;
    private String passportNo;
    private int licenseNo;
    private String panCardNo;
    private int voterId;

    public Student(String name, long phoneNo, String passportNo) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.passportNo = passportNo;
    }

    public Student(String name, long phoneNo, int licenseNo, String panCardNo) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.licenseNo = licenseNo;
        this.panCardNo = panCardNo;
    }

    public Student(String name, long phoneNo, int voterId, int licenseNo) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.voterId = voterId;
        this.licenseNo = licenseNo;
    }

    @Override
    public String toString() {
        return String.format("%s %d %d %s", name, phoneNo, voterId, licenseNo);
    }
}
public class D05P01 {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input 1 for an Employee:");
        int choice = scanner.nextInt();
        scanner.nextLine();

        Register<Employee> employeeRegister = new Register<>("Employee");
        Register<Student> studentRegister = new Register<>("Student");
        if (choice == 1) {
            System.out.println("Enter details for Employee:");
            String[] employeeInput = scanner.nextLine().split(" ");
            Employee employee = new Employee(employeeInput[0], Long.parseLong(employeeInput[1]),
                    Integer.parseInt(employeeInput[2]), employeeInput[3]);
            String employeeRegisterId = employeeRegister.generateRegisterId(6);
            System.out.printf("%s %s\n", employeeRegisterId, employee);
        } else {
            System.out.println("Input 2 for a Student:");
            int choice2 = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter details for Student:");
            String[] studentInput = scanner.nextLine().split(" ");
            Student student = new Student(studentInput[0], Long.parseLong(studentInput[1]),
                    Integer.parseInt(studentInput[2]), studentInput[3]);
            String studentRegisterId = studentRegister.generateRegisterId(6);
            System.out.printf("%s %s\n", studentRegisterId, student);
        }

        scanner.close();
    }
}