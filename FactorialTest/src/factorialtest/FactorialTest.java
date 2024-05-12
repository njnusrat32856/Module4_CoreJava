
package factorialtest;

import java.util.Scanner;

public class FactorialTest {

    public static void main(String[] args) {
        
        Scanner fac=new Scanner(System.in);
        System.out.println("Enter the Number");
        long facValue=fac.nextInt();
        long factorial= 1;
//        for(int i=1;i<=facValue; i++){
//        factorial*=i;
//        }
        for(long i=facValue; i>=1;i--){
        factorial*=i;
        }
        System.out.println("Result is "+factorial);
    }
    
}
