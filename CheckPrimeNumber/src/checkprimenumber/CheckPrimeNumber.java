
package checkprimenumber;

import java.util.Scanner;

public class CheckPrimeNumber {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your Number");
        
        int prime =s.nextInt();
        int count =0;
        
        for(int i=1; i<=prime;i++){
            if(prime % i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println(prime +" it's a prime number.");
        }
        else{
            System.out.println(prime +" it's not a prime number.");
        }
        
    }
    
}
