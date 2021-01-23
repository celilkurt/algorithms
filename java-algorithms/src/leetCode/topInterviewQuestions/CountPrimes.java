package leetCode.topInterviewQuestions;

import java.util.Arrays;

//Count the number of prime numbers less than a non-negative number, n.
public class CountPrimes {

    public static void main(String[] args){

        int n = 256;
        System.out.println("Input: " + n +
                "\nOutput: " + countPrimes(n));

    }

    public static int countPrimes(int n) {
        if(n < 2)
            return 0;

        boolean[] isPrime = new boolean[n];

        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for(int i = 2; i < Math.ceil((float)n/(float)2); i++)
            isPrime[i*2] = false;

        for(int i = 3; i < n; i += 2)
            if(isPrime[i])
                for(int j = 3; j < Math.ceil((float)n/(float)i); j += 2)
                    isPrime[i*j] = false;

        int count = 0;
        for(boolean key: isPrime)
            if(key)
                count++;


        return count;

    }

}
