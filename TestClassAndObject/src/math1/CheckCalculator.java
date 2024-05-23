
package math1;

import java.util.Scanner;

public class CheckCalculator {
    
    double calculation =0;

    public CheckCalculator() {
    }
    
    public CheckCalculator(double newCalculation){
        this.calculation= newCalculation;
    }
    
    public double checkCalculation(){
        
        Scanner s= new Scanner(System.in);
        
        System.out.println("Enter 1 for addition, 2 for subtraction, 3 for multiplication, 4 for division:");
        int operation = s.nextInt();
        
        System.out.println("Enter 1st Number");
        double num1 = s.nextDouble();
        System.out.println("Enter 2nd Number");
        double num2 = s.nextDouble();
        
        switch (operation) {
            case 1:
                return num1 + num2;
                
            case 2:
                return num1 - num2;
                
            case 3:
                return num1 * num2;
                
            case 4:
                return num1 / num2;
                
            default:
                System.out.println("Invalid operation");
                break;
        }
        return 0;
    }
}
