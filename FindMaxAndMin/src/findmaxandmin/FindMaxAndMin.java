
package findmaxandmin;

import java.util.Scanner;

public class FindMaxAndMin {

    public static void main(String[] args) {
        
        Scanner s =new Scanner(System.in);
        
        System.out.println("Enter First Number");
        int num1= s.nextInt();
        
        System.out.println("Enter Second Number");
        int num2= s.nextInt();
        
        System.out.println("Enter Third Number");
        int num3= s.nextInt();
        
        maxNumber(num1, num2, num3, s);
        minNumber(num1, num2, num3, s);
        
//        maxNumber(num1, num2, num3);
//        minNumber(num1, num2, num3);
//        System.out.println("Max Number is "+maxNumber);
//        System.out.println("Min number is "+minNumber);
    }
    public static void maxNumber(int num1, int num2, int num3, Scanner s){
        
        int maxNumber;
        if(num1>num2 && num1>num3){
            maxNumber= num1;
        }
        else if(num2>num1 && num2>num3){
            maxNumber= num2;
        }
        else{
            maxNumber= num3;
        }
    }
    
    public static void minNumber(int num1, int num2, int num3, Scanner s){
    
        int minNumber;
        if(num1<num2 && num1<num3){
            minNumber= num1;
        }
        else if(num2<num1 && num2<num3){
            minNumber= num2;
        }
        else{
            minNumber= num3;
        }
    }
}
