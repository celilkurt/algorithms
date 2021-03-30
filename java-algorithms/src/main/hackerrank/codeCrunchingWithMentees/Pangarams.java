package main.hackerrank.codeCrunchingWithMentees;

import java.io.IOException;
import java.util.Scanner;

public class Pangarams {

    // Complete the pangrams function below.
    static String pangrams(String s) {

        boolean[] has = new boolean[26];
        int count = 0;
        int asciiValue;
        for (char c: s.toLowerCase().toCharArray()) {
            if(c == ' ') continue;

            asciiValue = c-97;
            if (!has[asciiValue]) {
                has[asciiValue] = true;
                count++;

                if(count == 26) return "pangram";
            }
        }

        return "not pangram";

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String s = scanner.nextLine();

        String result = pangrams(s);

        System.out.println(result);

        scanner.close();
    }
}