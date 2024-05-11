
package twopractice;

import java.util.Scanner;

public class TwoPractice {


    public static void main(String[] args) {
//        System.out.println("hellow");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter an integer for seconds: ");
        
        int seconds = s.nextInt();
        
        int minutes = seconds/ 60;
        int remainingSeconds = seconds % 60;
        System.out.println(seconds +" seconds is "+ minutes +" minutes and "+ remainingSeconds +" seconds");
    }
    
}
