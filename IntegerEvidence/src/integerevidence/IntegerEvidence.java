package integerevidence;

import java.util.Scanner;

public class IntegerEvidence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Enter a number");
//        int num1 = scanner.nextInt();
//
//        System.out.println("Enter 2nd number");
//        int num2 = scanner.nextInt();
//
////        int result = num1 / num2;
//        try {
//
//            int result = num1 / num2;
//            if (num2 > 0) {
//
//                System.out.println("Result of division: " + result);
//            } 
////            else {
////
////                System.out.println("Cannot divide by zero.");
////            }
//        } catch (ArithmeticException e) {
//
//            System.out.println("Error: " + e.getMessage());
//        }

         try {
            System.out.println("Enter an integer&quot");

            int numerator = scanner.nextInt();

            System.out.println("Enter anotehr integer (denominator)&quot");
            int denominator = scanner.nextInt();

            if (denominator == 0) {
                System.out.println("Error: Cannot divide by Zero&quot");
            } else {
                int result = numerator / denominator;
                System.out.println("Result of division: " + result);
            }

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }

    }

}
