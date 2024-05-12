
package javaapplication12;

public class JavaApplication12 {

    public static void main(String[] args) {
        int num = 33; // Replace with the number you want to check
        boolean isPrime = true;
        int i = 2;

        while (i <= num / 2) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
            ++i;
        }

        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
    
}
