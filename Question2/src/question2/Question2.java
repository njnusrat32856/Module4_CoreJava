
package question2;

import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int sum= 0;
        
        System.out.println("Enter positive Integer :");
        
        while(true){
            
            int num= s.nextInt();
            
            if(num > 0){
                sum += num;
            }
            else{
                break;
            }
        }
        s.close();
        
        System.out.println("Sum of positive Integer: " + sum);
            
        
    }

    
}
