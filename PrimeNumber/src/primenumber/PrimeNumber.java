package primenumber;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter your number");
        int primeNumber = s.nextInt();
        int count = 0;

        for (int i = 1; i <= primeNumber; i++) {

            if (primeNumber % i == 0) {
                count++;
            }

        }
        if (count == 2) {
            System.out.println(primeNumber + " is a prime number");
        } else {
            System.out.println(primeNumber + " is not prime number");
        }

//        // nested loop
//        for (int i = 1; i <= primeNumber; i++) {
//            for (int j = 1; j <= i; j++) {
//                if(i%j==0){
//                count++;
//                }
//            }
//        }
//        if (count==2){
//            System.out.println(primeNumber + " prime");
//        }
//        count=0;
    }

}
