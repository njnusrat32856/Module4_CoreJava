
package addnumberinarray;

import java.util.Scanner;

public class AddNumberInArray {

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Enter 10 number");
        
        int[] number= new int[10];
        
        addNumber(number, user);
        
        
    }
    public static void addNumber(int[] number, Scanner user){
        for(int i=0; i< 10; i++){
            System.out.println(i+1);
            number[i]= user.nextInt();
        }
    }
    
}
