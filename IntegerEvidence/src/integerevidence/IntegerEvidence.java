package integerevidence;

import java.util.Scanner;

public class IntegerEvidence {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a number");
        int num1 = s.nextInt();

        System.out.println("Enter 2nd number");
        int num2 = s.nextInt();

//        int result = num1 / num2;
        try {

            int result = num1 / num2;
            if (num2 > 0) {

                System.out.println("Result of division: " + result);
            } 
//            else {
//
//                System.out.println("Cannot divide by zero.");
//            }
        } catch (ArithmeticException e) {

            System.out.println("Error: " + e.getMessage());
        }
    }

}
