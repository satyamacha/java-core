package com.learning.core.day10;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class D10P04 {

  public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java D10P04 <source_file> <destination_file>");
            return;
        }

        Path sourcePath = Paths.get(args[0]);
        Path destinationPath = Paths.get(args[1]);

        try {
            Files.copy(sourcePath, destinationPath);
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while copying the file.");
            e.printStackTrace();
        }
    }
}