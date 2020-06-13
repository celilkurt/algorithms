package hackerrank.java.BigIntegerDecimal;

import java.math.BigInteger;
import java.util.Scanner;

public class PrimalityTest {

    public static void main(String[] args){

        primalityTest();

    }


    //Java Primality Test with BigInteger
    static void primalityTest(){
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        BigInteger num = new BigInteger(n);

        if(num.isProbablePrime(1))
            System.out.println("prime");
        else
            System.out.println("not prime");

        scanner.close();
    }
}
