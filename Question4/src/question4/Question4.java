
package question4;

import java.util.Arrays;
import java.util.Scanner;

public class Question4 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter five number :");
        
        int[] number =new int[5];
        
        int highNumber= number[0];
        int lowNumber= number[0];
        
        for(int i=0; i< 5; i++){
            System.out.println("No. "+(i+1));
            number[i]=s.nextInt();
        }
        System.out.println("Array: "+Arrays.toString(number));
        
        // wrong 
        for(int i=0; i< number.length; i++){
            if(number[i] > highNumber){
                highNumber= number[i];
            }
            if(number[i] < lowNumber){
                lowNumber= number[i];
            }
        }
        
        
        System.out.println("Highest Number is: "+ highNumber);
        System.out.println("Lowest Number is: "+ lowNumber);
        
        s.close();
    }
    
    
}
