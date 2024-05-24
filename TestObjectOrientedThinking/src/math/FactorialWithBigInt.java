package math;

import java.math.BigInteger;

public class FactorialWithBigInt {

    int number = 0;

    public FactorialWithBigInt() {
    }
    
    public FactorialWithBigInt(int number) {
        this.number = number;
    }

    public BigInteger getFactorial() {
        BigInteger factorial = new BigInteger("1");

        for (int i = 1; i <= number; i++) {
            factorial = factorial.multiply(new BigInteger(i + ""));
        }
        
        return factorial;
    }

}
