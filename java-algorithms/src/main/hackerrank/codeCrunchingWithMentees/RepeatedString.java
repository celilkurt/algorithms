package main.hackerrank.codeCrunchingWithMentees;

import java.io.IOException;
import java.util.Scanner;

public class RepeatedString {


    static long repeatedString(String s, long n) {

        int len = s.length();
        long subLimit =  n%len;
        long carry = 0;
        long count = 0;

        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == 'a') {
                count++;
            }

            if (subLimit-1 == i){
                carry = count;
            }

        }

        return (n/len)*count+carry;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        System.out.println(result);

        scanner.close();
    }


}

