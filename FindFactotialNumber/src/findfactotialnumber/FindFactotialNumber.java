
package findfactotialnumber;

import java.util.Scanner;

public class FindFactotialNumber {
    
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter your Number");
        
        int fact=s.nextInt();
        int factorial= 1;
        
        for(int i=1; i<=fact; i++){
            factorial*=i;
        }
        
        System.out.println("Factorial result "+ factorial);
    }
    
//    public int factorial(){}
}
