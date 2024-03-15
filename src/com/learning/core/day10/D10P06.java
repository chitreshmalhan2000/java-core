package com.learning.core.day10;
import java.util.*;
import java.io.*;
public class D10P06 {

	public static void main(String[] args) {
		 mergeNotes("src/com/learning/core/day10/DavidEnglish.txt", "src/com/learning/core/day10/DavidScience.txt", "src/com/learning/core/day10/DavidComputer.txt", "src/com/learning/core/day10/DavidNotes.txt");
    }

    public static void mergeNotes(String englishFile, String scienceFile, String computerFile, String outputFile) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
            readAndWriteFile(englishFile, writer);
            writer.write("\n"); 
            readAndWriteFile(scienceFile, writer);
            writer.write("\n"); 
            readAndWriteFile(computerFile, writer);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readAndWriteFile(String inputFile, BufferedWriter writer) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
