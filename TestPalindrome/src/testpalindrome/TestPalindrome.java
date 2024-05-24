package testpalindrome;

import java.util.Scanner;

public class TestPalindrome {

    public static void main(String[] args) {
//        System.out.println("Hi");

        Scanner s = new Scanner(System.in);
        System.out.println("Enter your Word");

        String word = s.nextLine();
        
        if(isPalindrome(word)){
            System.out.println(word +" is a palindrome.");
        }
        else{
            System.out.println(word +" is not a palindrome.");
        }

    }

    public static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
