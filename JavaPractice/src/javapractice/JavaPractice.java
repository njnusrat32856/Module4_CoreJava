/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javapractice;

import java.util.Scanner;

/**
 *
 * @author Naima
 */
public class JavaPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int a = 5;
        
        System.out.println(a++ + ++a + "Result");
        
        int x = 10;
        int y = x++ + ++x;
        System.out.println(y);
        
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Call the method to reverse the string
        String reversed = reverseString(input);
        
        // Display the reversed string
        System.out.println("Reversed string: " + reversed);
        
        scanner.close();
    }
    
    
    // Method to reverse a string
    public static String reverseString(String str) {
        char[] charArray = new char[str.length()]; // Create a character array
        int j = 0;

        // Fill the character array with characters from the original string in reverse order
        for (int i = str.length() - 1; i >= 0; i--) {
            charArray[j] = str.charAt(i);
            j++;
        }

        // Convert the character array back to a string
        String reversedStr = "";
        for (char c : charArray) {
            reversedStr += c; // Concatenate characters to form the reversed string
        }

        return reversedStr; // Return the reversed string
    }
}
