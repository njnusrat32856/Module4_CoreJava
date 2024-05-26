package fileevidence;

//import java.io.BufferedReader;
//import java.io.BufferedWriter;
import java.io.File;

import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileEvidence {

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("File: ");

        File file = new File("C:\\Users\\Dell New\\OneDrive\\Desktop\\nusrat.txt");
        PrintWriter s = new PrintWriter(file);
        s.print("Nusrat");
        s.append("\nRezvi");
        s.append("\nPanna");
        s.append("\nEva");
        s.append("\nRaju");
        s.close();

        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }
        
    

        
        

//        String inputFile = "input.txt"; // Input file path
//        String outputFile = "output.txt"; // Output file path
//
//        // Read input from file
//        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
//            StringBuilder inputData = new StringBuilder();
//            String line;
//            while ((line = reader.readLine()) != null) {
//                inputData.append(line).append("\n");
//            }
//
//            // Process input data (Here, just echoing the input)
//            String processedData = inputData.toString();
//
//            // Write output to file
//            try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
//                writer.write(processedData);
//                System.out.println("Data written to " + outputFile + " successfully.");
//            } catch (IOException e) {
//                System.err.println("Error writing to file: " + e.getMessage());
//            }
//        } catch (IOException e) {
//            System.err.println("Error reading from file: " + e.getMessage());
//        }
    }
}
