
package questiion1prime;

import java.util.Scanner;

public class Questiion1Prime {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your number: ");
        
        int prime= s.nextInt();
        int count=0;
        
        for(int i=1; i <= prime; i++){
            if(prime % i==0){
                count++;
            }
        }
        
        if(count==2){
            System.out.println(prime +" is a Prime Number");
        }
        else{
            System.out.println(prime +" is not a Prime Number");
        }
        s.close();
    }
    
}
