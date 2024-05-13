package testfactorialvalue5;

public class TestFactorialValue5 {

    public static void main(String[] args) {
        System.out.println("Factorial of  5 number is: ");

        int fact = 5;
        int factorial = 1;

        for (int i = 1; i <= fact; i++) {

            factorial *= i;

        }

        System.out.println(factorial);
    }

}
