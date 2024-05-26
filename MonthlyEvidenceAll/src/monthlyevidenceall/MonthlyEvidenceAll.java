package monthlyevidenceall;

import java.util.Scanner;

public class MonthlyEvidenceAll {

    public static void main(String[] args) {
        System.out.println("Recursion: ");

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Interger Number");

        int input = s.nextInt();

        System.out.println("Factorial of " + input + " is " + factorial(input));
    }

    public static long factorial(int input) {

        if (input == 0) {
            return 1;
        } else {
            return input * factorial(input - 1);
        }
    }

    //OOT use kore jodi kori tahole this one
//    public class Factarial {
//
//        private int n;
//
//        public Factarial() {
//        }
//
//        public Factarial(int n) {
//            this.n = n;
//        }
//
//        public int getN() {
//            return n;
//        }
//
//        public void setN(int n) {
//            this.n = n;
//        }
//
//        @Override
//        public String toString() {
//            return "Factarial{" + "n=" + n + '}';
//        }
//
//        public int fac(int n) {
//            if (n == 0 || n == 1) {
//                return 1;
//            } else {
//                return n * fac(n - 1);
//            }
//        }
//    }
//    import java.util.Scanner ;
//    import test.Factarial ;
//
//    public class Recursion {
//
//        public static void main(String[] args) {
//
//            Scanner scanner = new Scanner(System.in);
//            int number = scanner.nextInt();
//            Factarial input = new Factarial(number);
//            System.out.println(input.fac(number));
//        }
//    }

}
