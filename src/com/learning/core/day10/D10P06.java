package com.learning.core.day10;

import java.io.*;

public class D10P06 {
    public static void main(String[] args) {
        mergeNotes("C:\\Users\\satya\\Desktop\\Mphasis2\\MLA Phase0 Practise Exercises\\java-core\\src\\com\\learning\\core\\day10\\DavidEnglish.txt",
        		   "C:\\Users\\satya\\Desktop\\Mphasis2\\MLA Phase0 Practise Exercises\\java-core\\src\\com\\learning\\core\\day10\\DavidScience.txt",
                   "C:\\Users\\satya\\Desktop\\Mphasis2\\MLA Phase0 Practise Exercises\\java-core\\src\\com\\learning\\core\\day10\\DavidComputer.txt",
                   "C:\\Users\\satya\\Desktop\\Mphasis2\\MLA Phase0 Practise Exercises\\java-core\\src\\com\\learning\\core\\day10\\DavidNotes.txt");
    }

    public static void mergeNotes(String file1, String file2, String file3, String outputFile) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

            mergeFile(writer, file1);
            mergeFile(writer, file2);
            mergeFile(writer, file3);

            writer.close();
            System.out.println("Notes merged successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void mergeFile(BufferedWriter writer, String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = reader.readLine()) != null) {
            writer.write(line);
            writer.newLine();
        }
        writer.newLine(); // Add an extra newline between different subjects
        reader.close();
    }
}
