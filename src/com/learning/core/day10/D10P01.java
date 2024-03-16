
package com.learning.core.day10;
import java.io.*;
public class D10P01 {

  public static void main(String[] args) {
        String sourcePath = "";
        String destinationPath = "";

        // Check if proper arguments are provided
        if (args.length == 2) {
            sourcePath = args[0];
            destinationPath = args[1];
        } else {
            // Prompt the user to enter source file and destination file paths
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
                System.out.print("Enter source file path: ");
                sourcePath = reader.readLine().trim();

                System.out.print("Enter destination file path: ");
                destinationPath = reader.readLine().trim();
            } catch (IOException e) {
                System.out.println("An error occurred while reading user input.");
                e.printStackTrace();
                return;
            }
        }

        // Check if source file exists
        File sourceFile = new File(sourcePath);
        if (!sourceFile.exists()) {
            System.out.println("Source file does not exist.");
            return;
        }

        // Check if destination file exists
        File destinationFile = new File(destinationPath);
        if (destinationFile.exists()) {
            // Destination file exists, prompt user whether to overwrite
            System.out.print("Destination file already exists. Do you want to overwrite? (yes/no): ");
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
                String choice = reader.readLine().trim().toLowerCase();
                if (!choice.equals("yes")) {
                    System.out.println("Operation aborted.");
                    return;
                }
            } catch (IOException e) {
                System.out.println("An error occurred while reading user input.");
                e.printStackTrace();
                return;
            }
        } else {
            // Destination file does not exist, perform any necessary action here
            // For example, create a new file, display a message, etc.
            System.out.println("Destination file does not exist. Creating a new file...");
        }

        // Copy file contents from source to destination
        try (InputStream inputStream = new FileInputStream(sourceFile);
             OutputStream outputStream = new FileOutputStream(destinationFile)) {
            byte[] buffer = new byte[1024];
            int length;
            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
            }
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while copying the file.");
            e.printStackTrace();
        }
    }
}