package main.hackerrank.java.BigIntegerDecimal;

import java.math.BigInteger;

public class Factorial {


    static BigInteger faktorial(int n){

        BigInteger f = new BigInteger("1");

        for(int i = 2; i <= n; i++)
            f = f.multiply(BigInteger.valueOf(i));

        return f;

    }
}
