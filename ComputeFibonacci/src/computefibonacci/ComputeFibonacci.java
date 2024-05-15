
package computefibonacci;

import java.util.Scanner;

public class ComputeFibonacci {

    public static void main(String[] args) {
        System.out.println("Fibonacci Number: ");
        
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        
        System.out.println(fibonacci(n));
    }
    public static long fibonacci(int n){
        if(n <= 1){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
