
package testswitchcase;

import java.util.Scanner;


public class TestSwitchCase {

    public static void main(String[] args) {
        
        Scanner s =new Scanner(System.in);
        
         System.out.println("Pls enter First Number");
        float number1 = s.nextFloat();
        System.out.println("Pls enter Second Number");
        float number2 = s.nextFloat();
        System.out.println("Add(+) press 1 \nSubstruction(-) press 2 \nMultiplication(X) press 3 \nDivididation(/) press 4");
        int choice=s.nextInt();
        
        float result=0.0f;
        
        switch (choice) {
            case 1:
                result=number1+number2;    
                break;        
                
            case 3:
                result=number1*number2;    
                break;
            case 4:
                result=number1/number2;    
                break;
                
            default:
                System.out.println("invalid Choice ");
        }
        
        System.out.println("Result is "+result);
        
    }
    
}
