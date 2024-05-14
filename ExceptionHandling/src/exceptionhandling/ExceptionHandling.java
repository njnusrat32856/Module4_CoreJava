package exceptionhandling;

import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your number ");
        int number1 = input.nextInt();

        System.out.println("Enter your number ");
        int number2 = input.nextInt();
        
        try {
            System.out.println(number1 / number2);
        } catch (Exception e) {
            e.printStackTrace();
            //System.out.println(e);
        }

//        if  
//            (number2 != 0)
//        
//        {
//            System.out.println(number1 / number2);
//        }
//        else{
//            System.out.println("Second number can't be zero(0)");
//            System.exit(1);
//        }
    }

}
