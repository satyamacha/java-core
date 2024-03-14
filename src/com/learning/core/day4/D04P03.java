package com.learning.core.day4;

import java.util.Scanner;

class CatheyBankException extends Exception {
    public CatheyBankException(String message) {
        super(message);
    }
}

class InvalidNameException extends CatheyBankException {
    public InvalidNameException(String message) {
        super(message);
    }
}

class InvalidPostException extends CatheyBankException {
    public InvalidPostException(String message) {
        super(message);
    }
}

class InvalidAgeException extends CatheyBankException {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class Validator {
    public static void validate(Applicant applicant) throws CatheyBankException {
        if (!isValidApplicantName(applicant.getApplicantName())) {
            throw new InvalidNameException("Invalid Applicant Name");
        }

        if (!isValidPost(applicant.getPostApplied())) {
            throw new InvalidPostException("Invalid Post");
        }

        if (!isValidAge(applicant.getApplicantAge())) {
            throw new InvalidAgeException("Invalid Age");
        }

        System.out.println("All details are valid");
    }

    private static boolean isValidApplicantName(String name) {
        return name != null && !name.isEmpty();
    }

    private static boolean isValidPost(String post) {
        return post != null && (post.equals("Probationary Officer") || post.equals("Assistant") || post.equals("Special Cadre Officer"));
    }

    private static boolean isValidAge(int age) {
        return age > 18 && age < 30;
    }
}

class Applicant {
    private String applicantName;
    private String postApplied;
    private int applicantAge;

    public Applicant(String applicantName, String postApplied, int applicantAge) {
        this.applicantName = applicantName;
        this.postApplied = postApplied;
        this.applicantAge = applicantAge;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public String getPostApplied() {
        return postApplied;
    }

    public int getApplicantAge() {
        return applicantAge;
    }
}

public class D04P03 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter applicant details (name, post, age - separated by space):");
        String input = scanner.nextLine();

        String[] values = input.split(" ");
        if (values.length != 3) {
            System.out.println("Invalid input format");
            return;
        }

        String applicantName = values[0];
        String postApplied = values[1];
        int applicantAge;

        try {
            applicantAge = Integer.parseInt(values[2]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid age format");
            return;
        }

        Applicant applicant = new Applicant(applicantName, postApplied, applicantAge);

        try {
            Validator.validate(applicant);
        } catch (CatheyBankException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
