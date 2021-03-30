package main.hackerrank.codeCrunchingWithMentees;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class SteppingStones {

    // Complete the solve function below.
    static String solve(long n) {

        // n*(n+1)/2  = x, n*(n+1) = 2*x

        long x = (long)Math.sqrt(2*n);

        if (x*(x+1) == 2*n) {
            return "Go On Bob " + x;
        } else {
            return "Better Luck Next Time";
        }


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            long n = scanner.nextLong();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            String result = solve(n);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
