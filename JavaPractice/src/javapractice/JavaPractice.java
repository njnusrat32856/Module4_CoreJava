/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javapractice;

import java.util.ArrayList;
import java.util.HashSet;
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
        
        
//        Write a Java program to reverse a string without using in-built functions.
        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Call the method to reverse the string
        String reversed = reverseString(input);
        
        // Display the reversed string
        System.out.println("Reversed string: " + reversed);
        
        
        
//        Write a program to find duplicate elements in an ArrayList.
        
        // Create an ArrayList to store elements
        ArrayList<Integer> numbers = new ArrayList<>();
        
        // Prompt the user to enter the number of elements
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        // Input elements into the ArrayList
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }
        
        // Find and print duplicate elements
        findDuplicates(numbers);
        
        
        
        
//        Write a Java method to check whether a given number is a palindrome.

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Check if the number is a palindrome
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
        
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
    
    
    public static void findDuplicates(ArrayList<Integer> list) {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();
        
        for (Integer number : list) {
            // If the number is already in the 'seen' set, it's a duplicate
            if (!seen.add(number)) {
                duplicates.add(number);
            }
        }
        
        // Print the duplicates
        if (duplicates.isEmpty()) {
            System.out.println("No duplicate elements found.");
        } else {
            System.out.println("Duplicate elements: " + duplicates);
        }
    }
    
    
    
    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int num) {
        int originalNum = num; // Store the original number
        int reversedNum = 0;   // Variable to hold the reversed number
        
        // Reverse the number
        while (num > 0) {
            int digit = num % 10; // Get the last digit
            reversedNum = reversedNum * 10 + digit; // Build the reversed number
            num /= 10; // Remove the last digit
        }
        
        // Check if the original number and the reversed number are the same
        return originalNum == reversedNum;
    }
}
