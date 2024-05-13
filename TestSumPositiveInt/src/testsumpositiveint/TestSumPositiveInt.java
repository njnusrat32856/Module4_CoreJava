
package testsumpositiveint;

import java.util.Scanner;

public class TestSumPositiveInt {

    public static void main(String[] args) {
//        System.out.println("H");

        Scanner s = new Scanner(System.in);
        int sum = 0;
        
        System.out.println("Enter integers(enter a negative integer to stop): ");
        
        while(true){
            int num = s.nextInt();
            
            if(num > 0){
                sum += num; 
            }
            else{
                break;
            }
        }
        System.out.println("Sum of positive integers: " + sum);
        
        s.close();
    }
    
}
