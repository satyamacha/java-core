package com.learning.core.day10;
import java.io.*;
public class D10P05 {

  public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter a string: ");
            String inputString = reader.readLine();

            writeToFile(inputString);

            showFileSize();

            readAndDisplayFileContents();

            deleteFile();

        } catch (IOException e) {
            System.out.println("An error occurred while reading input or writing to file.");
            e.printStackTrace();
        }
    }

    private static void writeToFile(String inputString) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("io.txt"))) {
            writer.write(inputString);
            System.out.println("Input string has been written to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to file.");
            e.printStackTrace();
        }
    }

    private static void showFileSize() {
        File file = new File("io.txt");
        long fileSize = file.length();
        System.out.println("Size of the file: " + fileSize + " bytes");
    }

    private static void readAndDisplayFileContents() {
        try (BufferedReader reader = new BufferedReader(new FileReader("io.txt"))) {
            String line;
            System.out.println("Contents of the file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading file contents.");
            e.printStackTrace();
        }
    }

    private static void deleteFile() {
        File file = new File("io.txt");
        if (file.delete()) {
            System.out.println("File io.txt has been deleted successfully.");
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}