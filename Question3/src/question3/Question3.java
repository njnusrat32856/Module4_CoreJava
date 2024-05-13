
package question3;

import java.util.Scanner;

public class Question3 {

    public static void main(String[] args) {
        
        Scanner s= new Scanner(System.in);
        
        System.out.println("Enter your number:");
        
        int fact= s.nextInt();
        int factorial =1;
        
        for(int i=1; i<= fact; i++){
            factorial *= i;
        }
        s.close();
        
        System.out.println("Factorial Result is "+ factorial);
    }
    
}
